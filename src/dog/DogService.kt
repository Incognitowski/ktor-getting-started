package dog

class DogService {

    private fun getListOfDogs() : List<Dog> {
        val dogs = mutableListOf<Dog>()
        dogs.add(Dog("Spots", 4, "Unknown", 10.0f))
        dogs.add(Dog("Elliot", 3, "Pitbull", 25.2f))
        dogs.add(Dog("Amy", 4, "French Bulldog", 12f))
        dogs.add(Dog("Holly", 6, "Shih Tzu", 7f))
        dogs.add(Dog("Gaia", 10, "Husky", 21f))
        return dogs
    }

    fun getDogs() : List<Dog> = getListOfDogs()

    fun getDog(name : String) : Dog? {
        return getListOfDogs().find { dog -> dog.name == name }
    }

}