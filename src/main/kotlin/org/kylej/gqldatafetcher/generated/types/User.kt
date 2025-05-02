package org.kylej.gqldatafetcher.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import com.fasterxml.jackson.`annotation`.JsonTypeInfo
import kotlin.String

@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public data class User(
  @JsonProperty("id")
  public val id: String,
  @JsonProperty("username")
  public val username: String,
  @JsonProperty("email")
  public val email: String,
) : SearchResult {
  public companion object
}
