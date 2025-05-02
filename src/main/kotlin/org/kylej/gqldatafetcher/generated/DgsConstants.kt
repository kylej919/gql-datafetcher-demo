package org.kylej.gqldatafetcher.generated

import kotlin.String

@jakarta.`annotation`.Generated(
  value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
  date = "2025-05-02T05:54:06.648635Z",
)
@Generated
public object DgsConstants {
  public const val QUERY_TYPE: String = "Query"

  @jakarta.`annotation`.Generated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2025-05-02T05:54:06.648635Z",
  )
  @Generated
  public object POST {
    public const val TYPE_NAME: String = "Post"

    public const val Id: String = "id"

    public const val Title: String = "title"

    public const val Content: String = "content"
  }

  @jakarta.`annotation`.Generated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2025-05-02T05:54:06.648635Z",
  )
  @Generated
  public object COMMENT {
    public const val TYPE_NAME: String = "Comment"

    public const val Id: String = "id"

    public const val Text: String = "text"

    public const val PostId: String = "postId"
  }

  @jakarta.`annotation`.Generated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2025-05-02T05:54:06.648635Z",
  )
  @Generated
  public object USER {
    public const val TYPE_NAME: String = "User"

    public const val Id: String = "id"

    public const val Username: String = "username"

    public const val Email: String = "email"
  }

  @jakarta.`annotation`.Generated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2025-05-02T05:54:06.648635Z",
  )
  @Generated
  public object QUERY {
    public const val TYPE_NAME: String = "Query"

    public const val Search: String = "search"
  }

  @jakarta.`annotation`.Generated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2025-05-02T05:54:06.648635Z",
  )
  @Generated
  public object SEARCHRESULT {
    public const val TYPE_NAME: String = "SearchResult"
  }
}
