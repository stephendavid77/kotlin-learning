package basics

/*
In Kotlin, you can define the function at the package level.
You no longer need to put everything inside a class,
to define a lot of static utility functions inside a special util class.
If you need general functions without binding to the specific class,
you can define them at the package level.
 */


/*
In Java, the ‘main’ function always requires the program argument list.
But for simple use-cases, these program arguments are often unused.
Starting from Kotlin 1.3, you can omit ‘main’ program arguments, and define ‘args’ parameter
only if needed.
 */

/*
There is no special built-in syntax for arrays.
Under the hood, at the bytecode level, it's the same array as in Java.
However, in the code, Array looks like a regular class with generic arguments.
 */
fun main(args: Array<String>) {
    /*
    in Kotlin, 'if' is an expression.
    You can assign the result of 'if' into a variable or return it from a function.
    'if' returns you the result value. Here, we use 'if' to check whether there are any arguments passed to this function.
     */

    /*
    In Kotlin, you can use this nice syntax for String templates.
    You can insert a value inside a string literal by using a dollar sign and a variable name.
    If you need to print out a more complicated expression, like a function call, 'if' expression, or some arithmetic expression,
    you can insert the value of this expression, but you have to surround it with curly braces.
     */
    println("Hello, ${args.getOrNull(0)}!")
    val name = if (args.size > 0) args[0] else "Kotlin"
    print("Hello, $name")
}