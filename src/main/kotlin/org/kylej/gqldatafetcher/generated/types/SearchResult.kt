package org.kylej.gqldatafetcher.generated.types

import com.fasterxml.jackson.`annotation`.JsonSubTypes
import com.fasterxml.jackson.`annotation`.JsonTypeInfo
import jakarta.`annotation`.Generated as AnnotationGenerated
import org.kylej.gqldatafetcher.generated.Generated as GeneratedGenerated

@AnnotationGenerated(
  value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
  date = "2025-05-02T05:54:06.648635Z",
)
@GeneratedGenerated
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
  @AnnotationGenerated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2025-05-02T05:54:06.648635Z",
  )
  @GeneratedGenerated
  public companion object
}
