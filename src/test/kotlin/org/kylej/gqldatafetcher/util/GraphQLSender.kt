package org.kylej.gqldatafetcher.util

import com.fasterxml.jackson.databind.ObjectMapper
import org.json.JSONObject
import org.springframework.graphql.server.support.SerializableGraphQlRequest
import org.springframework.http.HttpHeaders
import org.springframework.stereotype.Service
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.MvcResult
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders

@Service
class GraphQLSender(private val mockMvc: MockMvc?, private val objectMapper: ObjectMapper) {

  fun <T> query(queryRequest: String?, responseClass: Class<T>?, responsePath: String): T {
    val httpHeaders = HttpHeaders()
    httpHeaders.set("Content-Type", "application/json")

    val jsonObject = getBaseJsonObject(queryRequest!!, httpHeaders!!, responsePath)
    val paths = responsePath.split('.')

    val finalObject = jsonObject.opt(paths[paths.size - 1])

    val json =
        if ((finalObject == null || JSONObject.NULL == finalObject)) "null"
        else finalObject.toString()

    return objectMapper.readValue(json, responseClass)
  }

  private fun getBaseJsonObject(
      queryRequest: String,
      headers: HttpHeaders,
      responsePath: String
  ): JSONObject {
    val request = SerializableGraphQlRequest()
    request.query = queryRequest

    val action =
        MockMvcRequestBuilders.post("/graphql")
            .headers(headers)
            .content(objectMapper.writeValueAsString(request))

    val result: MvcResult = mockMvc!!.perform(action).andReturn()
    val paths = responsePath.split('.')

    var jsonObject = JSONObject(result.response.contentAsString)

    // ex - path 'data.node' will fetch the nested object types down to node
    for (path in paths.subList(0, paths.size - 1)) {
      jsonObject = jsonObject.getJSONObject(path)
    }

    return jsonObject
  }
}
