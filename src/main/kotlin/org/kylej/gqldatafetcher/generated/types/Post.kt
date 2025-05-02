package org.kylej.gqldatafetcher.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import com.fasterxml.jackson.`annotation`.JsonTypeInfo
import kotlin.String

@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public data class Post(
  @JsonProperty("id")
  public val id: String,
  @JsonProperty("title")
  public val title: String,
  @JsonProperty("content")
  public val content: String,
) : SearchResult {
  public companion object
}
