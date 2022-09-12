package FunctionTypes

import kotlin.test.assertTrue

/*
In Kotlin, you can store Lambda in a variable, which type does the variable have in this case?
If we specify this type explicitly, we'll see a so-called function type.
 */

fun main() {
    val sum = { x: Int, y: Int -> x + y }
    val sum1 : (Int, Int) -> Int = { x: Int, y: Int -> x + y }
    val isEven: (Int) -> Boolean  = { i: Int -> i % 2 == 0 }
    assertTrue {isEven(2)}


    /*
     When you store a Lambda and a variable, you can pass this variable whenever an expression of function type is expected.
     For instance, to all the functions working with collections in a functional style like any or filter.
     You can even call a Lambda directly, putting parentheses right after lambdas curly braces. However, such invocation looks a bit strange. If you need to call a Lambda right in place, better user run.
     The version with run does exactly the same, but it's much more readable than the code above.
     */

    val list = mutableListOf(1,2,4,5)
    println(list.any(isEven))
    println(list.filter(isEven))
    list.filter(isEven).any(isEven)

    /*
    You can even call a Lambda directly, putting parentheses right after lambdas curly braces.
    However, such invocation looks a bit strange. If you need to call a Lambda right in place, better user run.
    The version with run does exactly the same, but it's much more readable than the code above.
     */

    val directLambda = { println("hey!")}()
    run { println("hey!") }

    //val f1: () -> Int? = null Won't compile
    val f2: () -> Int? = { null }
    val f3: (() -> Int)? = null
    //val f4: (() -> Int)? = { null } Won't compile


    val f: (() -> Int)? = null

    // f() ==> This won't compile

    if(null != f) {
        f()
    }

    f?.invoke()



}