package dog

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*
import java.lang.Exception

@Suppress("unused")
fun Route.dogRoutes() {

    val dogService = DogService()

    route("dogs") {
        get {
            call.respond(dogService.getDogs())
        }
        post {
            val dogFromOutside = call.receive<Dog>()
            call.respond(dogFromOutside)
        }
        get("/{name}") {
            val dogNameFromQuery = call.parameters["name"] ?: kotlin.run {
                throw Exception("Please provide a dog name")
            }
            val dog = dogService.getDog(dogNameFromQuery)
            if (dog == null) {
                call.respond(HttpStatusCode.NotFound, "Dog not found");
            } else {
                call.respond(dog)
            }
        }
    }

}