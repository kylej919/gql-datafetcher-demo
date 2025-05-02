package org.kylej.gqldatafetcher.controller

import com.querydsl.core.Tuple
import com.querydsl.core.types.Expression
import com.querydsl.jpa.impl.JPAQuery
import graphql.schema.DataFetchingEnvironment
import jakarta.persistence.EntityManager
import org.kylej.gqldatafetcher.model.Post
import org.kylej.gqldatafetcher.model.QPost
import org.kylej.gqldatafetcher.model.SearchResult
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class SearchController(private val entityManager: EntityManager) {

  @QueryMapping
  fun search(environment: DataFetchingEnvironment): List<SearchResult> {
    val qPost = QPost.post
    val requestedFields = environment.selectionSet.getFields("Post.*").map { it.name }
    val query = JPAQuery<Tuple>(entityManager)
    var selectedExpressions = emptyArray<Expression<*>>()
    if ("id" in requestedFields) selectedExpressions += qPost.id
    if ("title" in requestedFields) selectedExpressions += qPost.title
    if ("content" in requestedFields) selectedExpressions += qPost.content

    val tuples = query.select(*selectedExpressions).from(qPost).fetch()

    return tuples.map { tuple ->
      Post(
          id = tuple.get(qPost.id),
          title = tuple.get(qPost.title),
          content = tuple.get(qPost.content))
    }
    return listOf()
  }
}
