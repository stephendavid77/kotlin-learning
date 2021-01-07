package controlstructures

class ifWhen {
    /*
    if is an expression in Kotlin. That means if returns a value which you can assign to a variable like here.
     */

    /*
    In Kotlin, there is no ternary operator like in Java. If you need the logic, if condition is [inaudible] on one value,
    otherwise, return another value, you use if expression
     */
    fun learning(counter: Int): Int {
        var ct = if (counter > 10) 15 else 25
        return ct
    }

    /*
    when might be considered as an analogous of Java switch.
    When you have enum class with some values, you can perform actions or return a specific expression depending on the enum constant.
    When then takes enum value as an argument and checks all the enum constants
     */

    /*
    In Kotlin, you no longer need to use break to say that the operation should stop here.
    If the rank condition is satisfied, the result of their corresponding branch is returned
    */


    enum class Color {
        BLUE, ORANGE, RED, YELLOW, GREEN, VIOLET, INDIGO
    }

    fun getDescription(color: Color): String =
            when (color) {
                Color.BLUE -> "cold"
                Color.ORANGE -> "mild"
                Color.RED -> "hot"
                else -> "not defined"
            }


    /*
    You can check whether when argument equal to one of the values.
    You list several values separated by comma.
    You can use any expression, not only constants as branch conditions.
     */

    fun respondToInput(input: String): String =
            when (input) {
                "y", "yes" -> "I'm glad you agree"
                "n", "no" -> "Sorry to hear that"
                else -> "I don't understand you"
            }


    /*
    You can use any expression, not only constants as branch conditions
     */

    fun mix(c1: Color, c2: Color): Color =
            when (setOf(c1, c2)) {
                setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
                setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
                setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
                else -> throw Exception("Invalid Color")
            }

    /* Sometimes you have a type hierarchy,
       and need to check whether it's the sub-type or that subtype,
       and do actions accordingly. In Kotlin, you can use when for this.
     */

    /*


    "Is" checks whether an argument is of a specific type. analaogous to instanceOf operator in Java
    Ex:

         when(pet) {
            is Cat -> pet.meow()
            is Dog -> pet.woof()
         }

    In Java, you cast the variable to the type after checking instance of.
    In Kotlin, you simply access its members as it was of the right type


    Java:

        if(pet instanceOf Cat) {
            ((Cat) pet).meow();
        }
        else if(pet instanceOf Dog) {
            Dog dog = (Dog) pet;
            dog.woof();



    When can also take references:

    Ex:

    when(val pet = getFavoritePet()) {
    is Cat -> pet.meow()
    is Dog -> pet.woof()
    }

    When without Argument:

    fun updateWeather(degress: Int) {

    val(description, color) = when {
        degress < 5 -> "cold" to BLUE
        degress < 23 -> "mild" to ORANGE
        else -> "hot" to RED
        }
    }







     */





}

