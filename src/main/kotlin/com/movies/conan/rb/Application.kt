package com.movies.conan.rb


import io.ktor.server.application.*
import com.movies.conan.rb.plugins.*


fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {


    configureSerialization()
    configureMonitoring()
    configureRouting()
}
