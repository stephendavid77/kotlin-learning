package nullability

import functionalprogramming.eq

class NullableExample {
    fun main(args: Array<String>) {
        val s1: String? = null
        val s2: String? = ""
        println(s1?.isEmptyOrNull()?.eq(true))
        println(s2?.isEmptyOrNull()?.eq(true))
        val s3 = "   "
        println(s3.isEmptyOrNull() eq false)

    }

    fun String.isEmptyOrNull(): Boolean {
        if (this != null && !this.isEmpty()) {
            return true
        }
        return false
    }
}