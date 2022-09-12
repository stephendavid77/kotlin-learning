package functionalprogramming


data class Hero(
        val name: String,
        val age: Int,
        val gender: Gender?
)

enum class Gender { MALE, FEMALE }

fun main() {

    val heroes = listOf(
            Hero("The Captain", 60, Gender.MALE),
            Hero("Frenchy", 42, Gender.MALE),
            Hero("The Kid", 9, null),
            Hero("Lady Lauren", 29, Gender.FEMALE),
            Hero("First Mate", 29, Gender.MALE),
            Hero("Sir Stephen", 37, Gender.MALE)
    )

    /*
    The Kotlin Standard Library contains useful functions.
    First, last, also firstOrNull, and lastOrNull.
    First and last throw an exception if there are no elements.
    FirstOrNull and lastOrNull return null if the list is empty.
    All these functions are overloaded and are available as the functions with predicates.
     */

    println(heroes.last().name) //"Sir Stephen"


    heroes.firstOrNull { it.age == 30 }?.name //null
    //heroes.first{it.age == 30}.name //NoSuchElementException

    heroes.map { it.age }.distinct().size //5
    heroes.filter { it.age < 30 }.size //3
    val (youngest, oldest) = heroes.partition { it.age < 30 }
    oldest.size //3
    heroes.maxBy { it.age }?.name //The Captain

    val heroesGreaterFifty = heroes.all { it.age < 50 }
    println(heroesGreaterFifty)


    println(heroes.any { it.gender == Gender.FEMALE })

    /*
    Quiz 2
     */

    val heroes1 = listOf(
            Hero("The Captain", 60, Gender.MALE),
            Hero("Frenchy", 42, Gender.MALE),
            Hero("The Kid", 9, null),
            Hero("Lady Lauren", 29, Gender.FEMALE),
            Hero("First Mate", 29, Gender.MALE),
            Hero("Sir Stephen", 37, Gender.MALE),
            Hero("Sir Stephen", 37, Gender.MALE),
            Hero("Sir Stephen", 37, Gender.MALE),
            Hero("Sir Stephen", 37, Gender.MALE),
            Hero("Sir Stephen", 37, Gender.MALE)
    )

    val mapByAge: Map<Int, List<Hero>> =
            heroes.groupBy { it.age }

    println(mapByAge)

    val (age, group) = mapByAge.maxBy { (_, group) ->
        group.size
    }!!
    println(mapByAge.maxBy { (_, group) ->
        group.size
    }!!)
    println(age)


    val mapByName: Map<String, Hero> =
            heroes.associateBy { it.name }
    mapByName["Frenchy"]?.age
    mapByName.getValue("Frenchy").age

    mapByName["undefined"]?.age //null
    //mapByName.getValue("undefined").age //NoSuchElementException


    val mapByName1 = heroes.associate { it.name to it.age }
    println(mapByName1)
    println(mapByName1.getOrElse("unknown") { 0 })


    val (first, second) = heroes
            .flatMap { heroes.map { hero -> it to hero } }
            .maxBy { it.first.age - it.second.age }!!
    println("Answer" + first.name)

    val heroes2 = listOf(
            Hero("The Captain", 60, Gender.MALE),
            Hero("Frenchy", 42, Gender.MALE),
            Hero("The Kid", 9, null),
            Hero("Lady Lauren", 29, Gender.FEMALE),
            Hero("First Mate", 29, Gender.MALE),
            Hero("Sir Stephen", 37, Gender.MALE)
    )

    val heroes3 = listOf(
            Hero("The Captain", 60, Gender.MALE),
            Hero("Frenchy", 42, Gender.MALE),
            Hero("The Kid", 9, null),
            Hero("Lady Lauren", 29, Gender.FEMALE),
            Hero("First Mate", 29, Gender.MALE),
            Hero("Sir Stephen", 37, Gender.MALE)
    )

    println(heroes
            .flatMap { heroes.map { hero -> it to hero } })
    println(heroes
            .flatMap { heroes.map { hero -> it to hero } }.size)


    println(heroes
            .flatMap { first -> heroes.map { hero -> first to hero } })


}