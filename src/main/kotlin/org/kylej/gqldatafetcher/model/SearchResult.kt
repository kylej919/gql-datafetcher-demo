package org.kylej.gqldatafetcher.model

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import jakarta.persistence.*
import java.util.*

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename",
)
@JsonSubTypes(
    value =
        [
            JsonSubTypes.Type(value = Post::class, name = "Post"),
            JsonSubTypes.Type(value = Comment::class, name = "Comment"),
            JsonSubTypes.Type(value = User::class, name = "User")])
interface SearchResult {}

@Entity
data class Post(
    @Id @GeneratedValue val id: UUID? = null,
    val title: String?,
    val content: String?
) : SearchResult

@Entity
data class Comment(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) val id: UUID = UUID.randomUUID(),
    val text: String,
    val postId: UUID
) : SearchResult

@Entity
@Table(name = "users")
data class User(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) val id: UUID = UUID.randomUUID(),
    val username: String,
    val email: String
) : SearchResult
