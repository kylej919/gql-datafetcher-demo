package org.kylej.gqldatafetcher.model

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "comment")
data class Comment(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) val id: UUID = UUID.randomUUID(),
    val text: String,
    val postId: UUID
)
