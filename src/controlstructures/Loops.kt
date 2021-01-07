package controlstructures

/*

Kotlin has the same basic loops as in Java; for, while, and do-while.

In Kotlin, we have the same while, and do-while loops as in Java. Nothing more to say here

 */


/*

For loop looks a bit different.
1. First, a different keyword is used to express iteration over something "in".
2. Second, it omits the element type. If you want you can specify the element type explicitly
3. You can iterate over the contents of a map

 */

fun main(args: Array<String>) {
    /*
        Iterating a Map

     */
    val map = mapOf(1 to "One", 2 to "Two", 3 to "three")
    for((key,value) in map) {
        println(""+key + 2 + "$value")
    }

    val list = listOf("a", "b", "c")
    /*
        Iterating List

     */
    for((index,element) in list.withIndex()) {
        println("$index:" + "$element")
    }

    /*

        Iterating over Range
     */

    for (i in '0' .. '9') {  //It includes upper bound
        println(i)
    }

    for (i in '0' until '9') {  //It excludes upper bound
        println(i)
    }

    /*
        Iterating with a step
     */

    for(i in  9 downTo 1 step 2) {
        print(i)
    }

    /*
        Iterating over String
     */

    /*

     */

    for(ch in "abc") {
        println(ch + 1)
    }

    println("Kotlin" in "Java".."Scala")
    println("Jaalin" in "Java".."Scala")
    println("Java" in setOf("Java", "Scala"))
    println("Kotlin" in setOf("Java", "Scala"))
}



