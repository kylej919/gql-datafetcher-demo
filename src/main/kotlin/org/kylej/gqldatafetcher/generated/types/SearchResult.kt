package org.kylej.gqldatafetcher.generated.types

import com.fasterxml.jackson.`annotation`.JsonSubTypes
import com.fasterxml.jackson.`annotation`.JsonTypeInfo

@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__typename",
)
@JsonSubTypes(value = [
  JsonSubTypes.Type(value = Post::class, name = "Post"),
  JsonSubTypes.Type(value = Comment::class, name = "Comment"),
  JsonSubTypes.Type(value = User::class, name = "User")
])
public interface SearchResult {
  public companion object
}
