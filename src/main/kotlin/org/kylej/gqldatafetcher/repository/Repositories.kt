package org.kylej.gqldatafetcher.repository

import java.util.UUID
import org.kylej.gqldatafetcher.model.Comment
import org.kylej.gqldatafetcher.model.Post
import org.kylej.gqldatafetcher.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QuerydslPredicateExecutor

interface CommentRepository : JpaRepository<Comment, UUID>, QuerydslPredicateExecutor<Comment>

interface UserRepository : JpaRepository<User, UUID>, QuerydslPredicateExecutor<User>

interface PostRepository : JpaRepository<Post, UUID>, QuerydslPredicateExecutor<Post>
