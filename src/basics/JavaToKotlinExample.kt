package basics

class JavaToKotlinExample {
    enum class Color {
        BLUE, ORANGE, RED
    }

    enum class Size {
        SMALL, MEDIUM, LARGE
    }

    fun updateWeather(unit: Int) {
        /*
        when’ expression in Kotlin is similar to ‘switch’ in Java;
        it allows you to enumerate several options.
        It’s especially useful when you have more than two ‘if-else’ options:
         */

        /*
        When you define a variable in Java you have to specify its type.
        In Kotlin, you can prefer to omit the type if it's clear from the context.
        When you omit the type specification, the Kotlin compiler infers the type automatically,
        based on the initializer expression.
         */

        /*
        We can initialize two variables at once by a pair of values.
        The first value in each pair is used to initialize the first variable, ‘description’,
        the second value initializes the second variable ‘color’.
        Now we don’t have to repeat the ‘description’ variable name.
         */
        val (description, color) = when {
            unit < 10 -> Pair("cold", Color.BLUE)
            unit < 25 -> Pair("mild", Color.ORANGE)
            else -> Pair("hot", Color.RED)
        }

        /*
        To be more Kotlin-ish, we can replace the constructing of ‘Pair’ with ‘to’.
         */
        val (desc, size) = when {
            unit > 40 -> "Small" to Size.SMALL
            unit > 70 -> "Medium" to Size.MEDIUM
            else -> "Large" to Size.LARGE
        }
    }
}