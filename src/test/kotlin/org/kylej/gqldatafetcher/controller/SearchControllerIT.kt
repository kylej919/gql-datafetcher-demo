package org.kylej.gqldatafetcher.controller

import java.util.*
import kotlin.test.Test
import org.assertj.core.api.Assertions.assertThat
import org.kylej.gqldatafetcher.model.Post
import org.kylej.gqldatafetcher.model.SearchResult
import org.kylej.gqldatafetcher.repository.PostRepository
import org.kylej.gqldatafetcher.util.GraphQLSender
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
@AutoConfigureMockMvc
class SearchControllerIT {

  @Autowired private lateinit var graphQLSender: GraphQLSender

  @Autowired private lateinit var postRepository: PostRepository

  val fullQuery =
      """
        query Search {
            search {
                ... on Post {
                    __typename
                    id
                    title
                    content
                }
                ... on Comment {
                    __typename
                    id
                    text
                    postId
                }
                ... on User {
                    __typename
                    id
                    username
                    email
                }
            }
        }
    """

  val partialQuery =
      """
        query Search {
            search {
                ... on Post {
                    __typename
                    title
                }
                ... on Comment {
                    __typename
                    text
                }
                ... on User {
                    __typename
                    username
                }
            }
        }
    """

  @Test
  fun testSearch() {
    //      val qPost = QPost.post
    postRepository.save(Post(title = "Test Post", content = "This is a test post."))

    val result =
        graphQLSender.query(
            queryRequest = fullQuery,
            responseClass = Array<SearchResult>::class.java,
            responsePath = "data.search")

    assertThat(result).isNotNull
  }

  @Test
  fun testSearchPartial() {
    //      val qPost = QPost.post
    postRepository.save(Post(title = "Test Post", content = "This is a test post."))

    val result =
        graphQLSender.query(
            queryRequest = partialQuery,
            responseClass = Array<SearchResult>::class.java,
            responsePath = "data.search")

    assertThat(result).isNotNull
  }
}
