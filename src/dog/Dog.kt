package dog

import kotlinx.serialization.Serializable

@Serializable
data class Dog(
    var name: String,
    var age: Int,
    var breed: String,
    var weight: Float,
)
