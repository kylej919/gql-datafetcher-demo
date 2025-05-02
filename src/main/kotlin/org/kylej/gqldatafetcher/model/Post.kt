package org.kylej.gqldatafetcher.model

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "post")
data class Post(@Id @GeneratedValue val id: UUID, val title: String, val content: String)
