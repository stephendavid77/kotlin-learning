package nullability

data class Name(val value: String)

fun main() {

    /*
        ? nullable type
        ?. safe access
        ?: Elvis operator

     */
    var nonNullable: String? = null

    /*
    If you try to dereference a variable of a nullable type,
    the Kotlin compiler says it's not possible.
    The value of the nullable type can be null under the hood,
    and such dereference operation will then throw null pointer exception.
     */

    // nonNullable.length  ==> Compiler Error

    if (null != nonNullable) {
        nonNullable.length
    }

    /*
    What can you do if you want to dereference an object of a Nullable Type?
    The easiest way is to check explicitly that your reference is not Null.
    After such a check, you can simply dereference the variable and access its members.
    However, ideally, you will suggest you have a better way to express the same logic.
    You can replace the if expression with a safe access expression.
    Safe access, or in other words, a safe call, consists of two characters.
    The question mark and the dot. It allows you to dereference a value in a safe manner.
    This operator first checks whether the receiver is not null.
    If it is the case, then the safe access operator calls the required member and returns the result.
    If the receiver is null, then null becomes the result.
     */
    nonNullable?.length //equal to if(nonNullable != null) nonNullable.length else null

    /*
    When using safe access, you can use so called Elvis separator
    and provide the default value that will be used when your expression is null.
     */

    /*
    The result is either the left expression if it's not null,
    or the right expression if the left expression is null.
     */
    var length: Int? = nonNullable?.length
    val length1: Int = nonNullable?.length ?: 0

    /*
    If you want you can explicitly throw called the null pointer exception.
    For this, you use this not null assertion, an operator consisting of two exclamation marks.
    It throws a null pointer exception if it's operand is null and returns the operand if it's not null.
     */

    length = null
    val npw = length!! // ==> foo != null return foo else return NPE
    length.compareTo(2)
    print(npw)


    fun isFoo1(n: Name) = n.value == "foo"
    // fun isFoo2(n: Name?) = n.value == "foo"  ==> Compilation Error
    fun isFoo3(n: Name?) = n != null && n.value == "foo"
    fun isFoo4(n: Name?) = n?.value == "foo"

    // isFoo1(null) ==> Compilation Error
    //isFoo2(null)
    isFoo3(null)
    isFoo4(null)



    val x: Int? = 1
    val y: Int = 2
    val sum = x ?: 0 + y
    print(sum)




}