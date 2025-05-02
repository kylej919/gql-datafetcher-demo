package org.kylej.gqldatafetcher.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import com.fasterxml.jackson.`annotation`.JsonTypeInfo
import kotlin.String
import jakarta.`annotation`.Generated as AnnotationGenerated
import org.kylej.gqldatafetcher.generated.Generated as GeneratedGenerated

@AnnotationGenerated(
  value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
  date = "2025-05-02T05:54:06.648635Z",
)
@GeneratedGenerated
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public data class User(
  @JsonProperty("id")
  public val id: String,
  @JsonProperty("username")
  public val username: String,
  @JsonProperty("email")
  public val email: String,
) : SearchResult {
  @AnnotationGenerated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2025-05-02T05:54:06.648635Z",
  )
  @GeneratedGenerated
  public companion object
}
