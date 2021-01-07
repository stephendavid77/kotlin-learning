package controlstructures


fun main(args: Array<String>) {
    /*
     In, used for two different use cases in Kotlin.
     1. iteration 2. belonging.
     */

    //Iteration
    for (i in 1..9) {

    }
    //Belonging
    println("Kotlin" in "Java".."Scala")

    /*
    not in a range
     */

    fun isNotDigit(c: Char) = c !in '0'..'9'

    print(isNotDigit('x'))


    /*
    'in' as when condition
     */


    fun recognize(c: Char) = when (c) {
        in '0'..'9', in 'a'..'z', in 'A'..'Z', '_' -> true
        else -> false
    }

    println(recognize('$'))

    /*
    You can store a range in a variable of the corresponding range type,
    such range is irregular object.
     */

    val intRange: IntRange = 1..9
    val anotherIntRange = 10 until 20
    val charRange: CharRange = 'a'..'z'
    val stringRange: ClosedRange<String> = "ab".."az"


    /*
    Ranges for primitive types are optimized
    No extra IntRange or CharRange objects are created
     */


    fun isValidIdentifier(str: String): Boolean {
        var isValidIdentifier = false
        if (str.isEmpty()) return false
        when (str[0]) {
            in 'a'..'z', in 'A'..'Z', '_' -> true
            else -> false
        }
        for (i in str) {
            isValidIdentifier = isValidIdentifier && recognize(i)
        }

        return isValidIdentifier
    }

    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}
