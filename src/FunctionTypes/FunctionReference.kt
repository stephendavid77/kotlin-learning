package FunctionTypes

fun main() {
    fun isEven(i: Int): Boolean = i%2 ==0
    val isEvenLambda: (Int) -> Boolean  = { i: Int -> i % 2 == 0 }
    val predicate = ::isEven
    println(predicate(4))
    val predicate1 = {i:Int -> isEven(i)} //equivalent to above
    println(predicate1(4))

    val list = mutableListOf(1,2,4,5)
    list.any(::isEven)
    list.filter(::isEven)

}

class Person(val name: String, val age: Int) {
    fun isOlder(ageLimit: Int) = age > ageLimit
    fun getAgePredicate() = ::isOlder
}

//What is the type of ::isOlder here?


fun isEven(i: Int): Boolean = i % 2 == 0

val list = listOf(1, 2, 3, 4)
list.any(::isEven)
list.filter(::isEven)