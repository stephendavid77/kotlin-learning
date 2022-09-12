@file:JvmName("ExtensionFuncUtils")

package ExtensionFunctions

fun String.repeat(n: Int): String {
    val sb = StringBuilder(n * length)
    for (i in 1..n) {
        sb.append(this)
    }
    return sb.toString()
}




fun main() {
    /*
    Extension function extends the class.
    It is defined outside of the class but can be called as a regular member to this class.
     */


    /*
    The time that the function extends is called a Receiver. Here, string is the receiver of the lastChar function.
    In the body of this function, we can access the receiver by this reference.
    In our example, this refers to string. As usual for this reference, we can omit it.
    We can call members of the receiver inside an extension function without explicit this dot something specification.
    An important thing to note here is that you can't define an extension and use it everywhere.
    You have to import it explicitly.
     */

    fun String.lastChar() = this.get(this.length - 1)
    fun String.lastChar1() = get(length - 1)
    val c = "abc".lastChar()
    print(c)

    /*
    Calling Extension functions from Java
    */

    fun String.repeat(n: Int): String {
        val sb = StringBuilder(n * length)
        for (i in 1..n) {
            sb.append(this)
        }
        return sb.toString()
    }


    println("abc".repeat(10))
    /*
    Under the hood, at the byte code level when this function is compiled to a static function,
    the receiver is transformed to the extra first parameter.
    When you call these extension function from Java, you pass String expression explicitly as the first argument.
    In Java, the code with extensions looks like a regular Java.
     */


}