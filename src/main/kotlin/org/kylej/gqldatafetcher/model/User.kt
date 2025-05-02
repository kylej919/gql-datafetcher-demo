package org.kylej.gqldatafetcher.model

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "users")
data class User(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) val id: UUID = UUID.randomUUID(),
    val username: String,
    val email: String
)
