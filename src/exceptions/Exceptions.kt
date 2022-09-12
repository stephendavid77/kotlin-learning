package exceptions

import java.io.IOException

/*
Exceptions are very similar to Java with one important difference.
Kotlin doesn't differentiate checked and unchecked exceptions.
In Kotlin, you may or may not handle any exception,
and your function does not need to specify which exception it can throw
 */

fun main() {

    /*
        Throw is an expression in Kotlin. You can assign this result to a variable.
        In java, throw is a special construct which you can't assign to a variable.
    */

    var number1 = 100
    val percentage = if (number1 in 1..100)
        number1
    else
        throw IllegalArgumentException("A percentage value must be between 0 and 100: $number1")

    println(percentage)

    /*
        Try can catch an exception if it was thrown inside, check it for being of a specific type, and perform the corresponding actions.
        Like in Java try simpler throws and exception if it's type wasn't listed.
        Unlike Java, in Kotlin try is an expression.
        That means we can assign the result of try to variable
     */

    val number2 = try {
        Integer.parseInt("se")
    } catch (e: NumberFormatException) {
        null
    }

    print("number2: " + number2)

    /*
    There are no checked exceptions in Kotlin
    so there is no need to specify this function throws at this exception.
    @Throws annotation is required though if the method needs to be called from a Java class
     */

    @Throws(IOException::class)
    fun foo() {
        throw IOException()
    }
}