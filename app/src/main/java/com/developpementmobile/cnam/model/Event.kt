package com.developpementmobile.cnam.model

data class Event(
    val id: Long,
    val title: String,
    val category: String,
    val location: String?,
    val capacity: Int,
    val description: String
)

val sampleEvents = listOf(
    Event(1, "Conférence Kotlin", "Tech", "Amphi A", 10, "Découverte de Kotlin et Compose."),
    Event(2, "Atelier Compose", "Tech", null, 5, "Création d'interfaces modernes."),
    Event(3, "Exposition Art", "Art", "Hall B", 0, "Exposition d'art contemporain."),
    Event(4, "Meetup Android", "Tech", "Salle 101", 20, "Discussions autour d'Android."),
    Event(5, "Concert Live", "Musique", "Campus Plein Air", 50, "Concert de fin d'année.")
)
