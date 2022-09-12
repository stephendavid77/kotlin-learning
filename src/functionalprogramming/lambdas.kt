package functionalprogramming

/*
Why Lambda ?
Replacement of Anonymous Function

Lambda is an anonymous function that can be used as an expression,
for instance, passed as an argument to another function.
 */

/*
Lambda syntax.

1. In Kotlin, Lambda always goes in curly braces
2. Inside curly braces, first you specify the parameters, then the arrow, then the Lambda body.
3.

 */

var lambda = { x: Int, y: Int -> x+y}


/*
When you see highlighted in bold curly braces, that means you see a Lambda.


If you pass a Lambda as an argument, you can put the whole Lambda inside the parentheses.
However, there is a better way to express that. You can move Lambda out with parentheses,
if the Lambda is the last argument, and if the parentheses are empty, you can omit them.
This way you have the nicer syntax.
At first, the same syntactic convention of moving Lambda out of parentheses was used in groovy
and it worked quite well there.
 */

/*
If the type of the argument can be inferred, if it's clear from the context,
it can be omitted. If your Lambda has their own argument, you can replace its name with it. It's an automatically generated name for your Lambda,
if it has only one argument, and you don't specify a different argument name.
 */

fun main() {
    var list: List<Int> = listOf(1, 3, 5)

    //All the follwing are valid
    var result = list.any({ i: Int -> i > 0 })
    result = list.any() { i: Int -> i > 0 }
    result = list.any { i: Int -> i > 0 }






    println(result.toString())
    val nonEmptyList = listOf(1, 2, 3)
    println("nonEmptyList.any() is ${nonEmptyList.any()}")
    println(lambda(1, 2))


    list.any {
        println("line 1")
        println(it > 0)
        it > 2
    }


    var mapExample = mutableMapOf<String,String>()
    mapExample.put("key1","value1")
    mapExample.put("key2","value2")
    mapExample.put("key3","value3")

    mapExample.mapValues { entry -> println("${entry.key} + ${entry.value}") }
    mapExample.mapValues { (_, value) -> println("$value") }


}

fun add(var1: Int, var2: Int, var3: Int): Int {
    return var1 + var2 + var3
}


