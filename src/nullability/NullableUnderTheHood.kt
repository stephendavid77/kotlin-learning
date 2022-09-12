package nullability

fun main() {

    /*
    Under the hood, nullable types are implemented using annotations.
    The Kotlin compilers simply adds Nullable and NotNullable annotations to the corresponding types usages.
    Which gives us no performance overheads when using Nullable types.
     */


    fun foo(list1: List<Int?>, list2: List<Int>?) {
        list1.size
        list2?.size

        val i: Int? = list1?.get(0)
        val j: Int? = list2?.get(0)

    }
}