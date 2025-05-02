package org.kylej.gqldatafetcher.generated

import kotlin.String

public object DgsConstants {
  public const val QUERY_TYPE: String = "Query"

  public object POST {
    public const val TYPE_NAME: String = "Post"

    public const val Id: String = "id"

    public const val Title: String = "title"

    public const val Content: String = "content"
  }

  public object COMMENT {
    public const val TYPE_NAME: String = "Comment"

    public const val Id: String = "id"

    public const val Text: String = "text"

    public const val PostId: String = "postId"
  }

  public object USER {
    public const val TYPE_NAME: String = "User"

    public const val Id: String = "id"

    public const val Username: String = "username"

    public const val Email: String = "email"
  }

  public object QUERY {
    public const val TYPE_NAME: String = "Query"

    public const val Search: String = "search"
  }

  public object SEARCHRESULT {
    public const val TYPE_NAME: String = "SearchResult"
  }
}
