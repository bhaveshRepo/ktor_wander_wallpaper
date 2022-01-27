package com.example.routes

import com.example.model.Wallpaper
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

// Mention all the routes that will be available to / from the server

private const val BASE_URL = "http://192.168.1.3:9100"

private val wallpapers = listOf(
    Wallpaper("First","First Wallpaper","$BASE_URL/wall/Wallpaper1.jpg"),
    Wallpaper("Second","Second Wallpaper","$BASE_URL/wall/Wallpaper2.jpeg")
,    Wallpaper("Third","Third Wallpaper","$BASE_URL/wall/Wallpaper3.jpg")

)

fun Route.wallpaperRoute(){ // call this function in Routing Configuration
     get("randomWallpaper"){ // basically a type of endpoint of the server
         // we can also attach the Query parameters , if the user want a particular resource by mentioning the id / name
        call.respond(
            HttpStatusCode.OK,
            wallpapers.random()
        )

     }
}