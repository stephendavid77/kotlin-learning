package ExtensionFunctions


fun main(args: Array<String>) {
    val set = hashSetOf(1, 7, 23)
    val list = arrayListOf(1, 2, 5, 7, 9)
    val map = hashMapOf(1 to "one", 7 to "seven", 20 to "twenty")

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    println(listOf("abc", "def", "hello").joinToString(separator = "*", prefix = "$$$$", postfix = "$$$$"))

//    fun <T> Iterable<T>.joinToString(
//            separator: CharSequence = ",",
//            prefix: CharSequence = "",
//            postFix: CharSequence = ""
//    ): String

    println("Hello,{${args.getOrNull(0)}}")
    var args1 = args + "hell0"
    args1 += "hello1"
    println(args1.withIndex())

    for ((index, element) in args1.withIndex()) {
        println("$index $element")
    }

//    fun <T> Array<T>.getOrNull(index: Int) = if (index in 0 until size)
//        this[index] else null


    val p = """To code,
        |or not to code?.."""

    val q = """To code,
        |or not to code?..""".trimMargin()

    val a = """keep calm
        |and learn kotlin""".trimIndent()

    println(p)
    println(q)
    println(a)


    /*
    Using Regular expressions
     */

    val regex = "\\d{2}\\.\\d{2}\\.\\d{4}".toRegex()
    val regex1 = """\d{2}\.\d{2}\.\d{4}""".toRegex()
    println(regex1.matches("15.02.2016"))
    println(regex1.matches("15.02.16"))


    infix fun <T> T.eq(other: T) {
        if (this == other) println("OK")
        else println("Error: $this != $other")
    }

    fun getExpression() = 42
    getExpression() eq 50
    getExpression() eq 42

    infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)


    /*
    Change the 'sum' function so that it was declared as an extension to List<Int>.
     */

    fun sum1(list: List<Int>): Int {
        var result = 0
        for (i in list) {
            result += i
        }
        return result
    }

    fun main(args: Array<String>) {
        val sum = sum1(listOf(1, 2, 3))
        println(sum)    // 6
    }


    fun String.lastChar() = get(length - 1)

    fun String.repeat(n: Int): String {
        val sb = StringBuilder(n * length)
        for (i in 1..n) {
            sb.append(this)
        }
        return sb.toString()
    }


    fun List<Int>.sum1(): Int {
        var sum = 0
        for (i in this) {
            sum += i
        }
        return sum
    }

    var newList = listOf<Int>(1,2,3,4)
    var sum = newList.sum1()
    print(sum)
}
