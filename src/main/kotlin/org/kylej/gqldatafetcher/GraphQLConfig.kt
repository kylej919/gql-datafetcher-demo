package org.kylej.gqldatafetcher

import graphql.schema.DataFetcher
import org.kylej.gqldatafetcher.model.Comment
import org.kylej.gqldatafetcher.model.Post
import org.kylej.gqldatafetcher.model.User
import org.kylej.gqldatafetcher.repository.CommentRepository
import org.kylej.gqldatafetcher.repository.PostRepository
import org.kylej.gqldatafetcher.repository.UserRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.graphql.data.query.QuerydslDataFetcher
import org.springframework.graphql.execution.RuntimeWiringConfigurer

@Configuration
class GraphQLConfig {

  @Bean
  fun userDataFetcher(userRepository: UserRepository): DataFetcher<Iterable<User>> {
    return QuerydslDataFetcher.builder(userRepository).many()
  }

  @Bean
  fun postDataFetcher(postRepository: PostRepository): DataFetcher<Iterable<Post>> {
    return QuerydslDataFetcher.builder(postRepository).many()
  }

  @Bean
  fun commentDataFetcher(commentRepository: CommentRepository): DataFetcher<Iterable<Comment>> {
    return QuerydslDataFetcher.builder(commentRepository).many()
  }

  @Bean
  fun searchResultsDataFetcher(
      userDataFetcher: DataFetcher<Iterable<User>>,
      postDataFetcher: DataFetcher<Iterable<Post>>,
      commentDataFetcher: DataFetcher<Iterable<Comment>>
  ): DataFetcher<Iterable<Any>> {
    return DataFetcher { env ->
      val users = userDataFetcher[env]
      val posts = postDataFetcher[env]
      val comments = commentDataFetcher[env]
      users + posts + comments
    }
  }

  @Bean
  fun runtimeWiringConfigurer(
      searchResultsDataFetcher: DataFetcher<Iterable<Any>>
  ): RuntimeWiringConfigurer {
    return RuntimeWiringConfigurer { wiring ->
      wiring
          .type("Query") { type -> type.dataFetcher("search", searchResultsDataFetcher) }
          .type("SearchResult") { type ->
            type.typeResolver { env ->
              val searchResult = env.getObject<Any>()
              when (searchResult) {
                is User -> env.schema.getObjectType("User")
                is Post -> env.schema.getObjectType("Post")
                is Comment -> env.schema.getObjectType("Comment")
                else -> null
              }
            }
          }
    }
  }
}
