/*
If you want you can change the name of the class that contains all the top-level functions as 'static' functions.
For that, you use a '@JVMName' annotation.
You annotate the file contents and put the annotation right before the package name.
 */
@file:JvmName("FunctionUtils")

package basics

/*
Top Level Function
 */

/*
From Java, you call a top-level function as a static function.
All top-level functions under the hood are implemented as static functions.
 */

fun topLevel() = "This is a top level function"

class Functions {

    /*
    Member Function
     */
    fun min(a: Int, b: Int): Int {
        return if (a < b) a else b
    }

    /*
    If the function simply returns one expression, you can use an alternative syntax,
    so-called, "function with expression body"
     */

    fun max(a: Int, b: Int): Int = if (a > b) a else b

    /*
    Note that if you try to omit the type for a function with expression body, it will mean that this function returns 'Unit'.
    You can think of 'Unit' as an analogue of 'void'.
     */
    fun displayMax(a: Int, b: Int): Unit {
        print(max(a, b))
    }

    /*
    Local Function
     */
    fun mainRoutine(): Unit {
        fun subRoutine() = 5
    }
}