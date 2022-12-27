package com.movies.conan.rb.plugins

import com.movies.conan.rb.data.MoviesData.AllMovies
import com.movies.conan.rb.data.MoviesData.Casting
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {

    routing {
        get("/movies") {
            call.respond(
                HttpStatusCode.OK,
                AllMovies
            )
        }
        get("/slides") {
            call.respond(
                HttpStatusCode.OK,
                listOf(AllMovies.random(),
                AllMovies.random(),
                AllMovies.random(),
                AllMovies.random(),
                AllMovies.random())
            )
        }
        get("/casting") {
            call.respond(
                HttpStatusCode.OK,
                Casting
            )
        }
    }
}
