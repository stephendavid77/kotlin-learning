package basics

class NamedAndDefaultArguments {

    /*
    Named arguments are often used together with default arguments.
    For 'joinToString', you can provide only the value for one of the arguments, for instance, 'postfix’.
    Looking at the output, we can understand that the default separator is comma, and an empty string is used by default as 'prefix'.
    You don't have to specify the values for all arguments each time.
    You can change the defaults, only if needed.
     */

    fun print() {
        println(listOf('a', 'b', 'c').joinToString(
                separator = "#", prefix = "(", postfix = ")"))
        displaySeparator(size = 5)
        displaySeparator('t', 20)
        displaySeparator(size = 5)
    }

    /*
    How to declare a function with default values for arguments.
    Here, the function 'displaySeparator' prints a character by a given number of times.
    We use star as 'character' by default, and 10 as the default number of times.
    Afterward, you can call this function with different arguments values.
    For each argument with the default value, you can either provide another value or use a default one.
     */


    /*
    Afterward, you can call this function with different arguments values.
    For each argument with the default value, you can either provide another value or use a default one.
    However, note that if you need to provide only the value for the second argument, then you have to use named arguments syntax.
    By default, there is the direct correspondence between unnamed arguments and parameters according to their order.
     */


    fun displaySeparator(character: Char = '*', size: Int = 10) {
        repeat(size) {
            print(character)
        }

        /*
            In Java, if you want to achieve the same behavior, you will use the overloaded functions.
            To provide the functionality of default arguments, you will define several different overloads,
            and call one inside another by specifying default values.
            In Kotlin, you use the default arguments feature directly.
            You no longer need to provide several overloads.
        */
    }


    /*
    If you want to call the Kotlin function with default arguments from Java in a convenient way,
    then you can add '@JvmOverloads' annotation.
    After you annotate the function with default argument with @JvmOverloads,
    you can specify only some of the arguments when you call it from Java.
     */

    @JvmOverloads
    fun displaySeparator(noOfIterations: String = "", size: Float = 10.0F) {
        repeat(10) {
            print(noOfIterations)
        }
    }
}