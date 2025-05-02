package org.kylej.gqldatafetcher.controller

import org.kylej.gqldatafetcher.generated.types.Post
import org.kylej.gqldatafetcher.generated.types.SearchResult
import org.kylej.gqldatafetcher.repository.PostRepository
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class SearchController(
  private val postRepository: PostRepository
) {

  @QueryMapping
  fun search(): List<SearchResult> {

    return postRepository.findAll()
      .map { post ->
        Post(
          id = post.id.toString(),
          title = post.title,
          content = post.content
        )
      }
  }
}
