package basics

class Variables {
    /*
    There are two main keywords to define variables, 'val' and 'var'.
    'val' comes from 'value' and denotes a read-only or assigned-once variable,
    while 'var' comes from 'variable' and denotes a mutable variable,
    the one that can be modified.
     */

    /*
    Read-only variable can't be reassigned.
    If you try to assign a new value to it, you'll get the compiler error.
    In essence, 'val' in Kotlin corresponds to a 'final' variable in Java.
     */
    val a = 10
    var b = "Hello World"
    /*
    In Kotlin you can omit the types of variables and the compiler will infer the types for you.
    Here, we omitted the types of these two variables,
    and they are inferred automatically by the compiler
     */

    /*
    Kotlin is a statically-typed language, which means that every variable, every expression has a type.
    Even if you omit the type, the compiler just infers it for you.
    It doesn't mean that this variable doesn't have a type or it's unknown. It means that the type specification is verbose, it’s clear from the context, and you trust the compiler to infer the type.
     */

    /*
    Is it possible to modify an object stored in 'val'?
    If we're talking about reference types, in Kotlin as in Java, variables just refer to some objects stored in memory.
    And this question can be reworded as: Does 'val' put any additional constraints on the stored object?

    Answer: There are no additional constraints. You can easily modify an object stored in 'val', as in Java. 'val',
    like a 'final' variable, is an immutable reference which doesn't say anything about the content that is stored.
     */
    fun variables() {
        val languages = mutableListOf("Java")
        languages.add("Kotlin")


        val list = listOf("Java")
        /*
        This line will cause a compile time error
        You can't modify a read-only list.
        'val' doesn't give you any guarantees about the content stored in an object
         */
        //list.add("Kotlin")
    }
}