package org.kylej.gqldatafetcher.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import com.fasterxml.jackson.`annotation`.JsonTypeInfo
import kotlin.String

@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public data class Comment(
  @JsonProperty("id")
  public val id: String,
  @JsonProperty("text")
  public val text: String,
  @JsonProperty("postId")
  public val postId: String,
) : SearchResult {
  public companion object
}
