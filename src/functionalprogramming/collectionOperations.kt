package functionalprogramming;

data class Person(val firstName: String, val lastName: String) {
        override fun toString(): String = "$firstName $lastName"
}

fun main() {

        var listEx1 = mutableListOf(1,2,3,4)

        /*
        FILTER: It filters out the content of the list and keeps only their elements
        that satisfy the given predicate
        */

        println(listEx1.filter { it > 0 })
        println(listEx1.filter { it % 2 == 0 })

        /*
        MAP: Map transforms each element in a collection and stores
        all the resulting elements in a new list.
         */

        println(listEx1.map { it * it })

        /*
        $all checks whether all elements satisfy the predicate
        $none makes sure that none of the elements satisfies the given predicate.
        $find finds an element satisfying the first given predicate and returns it as a result.
        If there is no required element, find returns null.
         */


        /*
        Partition divides the collection into two collections.
        Filter returns only the elements that satisfy the predicate, and in a sense,
        throws out all the elements that don't satisfy the predicate.
        If you need to keep both groups of elements that satisfy or do not satisfy the predicate, you can use the partition.
        It returns two collections, for the good elements and the remaining ones.
         */

        /*
         FirstorNull does the same as find, it returns you an element or null as a result.
         */

        println(listEx1.filter { it > 0 }.all { it > 0 })
        println(listEx1.filter { it > 0 }.none { it > 0 })
        println(listEx1.filter { it > 0 }.find { it > 2 })
        println(listEx1.filter { it > 0 }.first { it > 0 })
        println(listEx1.filter { it > 0 }.firstOrNull { it > 0 })

        var (even, odd) =  listEx1.partition { it %2 == 0 }
        println("Even numbers: "+ even)
        println("Odd numbers: "+ odd)

        /*
        If you need to divide your collection into more than two groups, you can use GroupBy.
        As an argument, you provide the way how to group the elements.
        What should be the grouping key?
        For instance, here we group personal elements by their age.
         */

        val names = listOf("kim", "julia", "jim", "hala","kim","jim")
        val groupedMap = names.groupBy { it.length }
        val groupedMapByName = names.groupBy ( {it}, {it.length>3} )
        println(groupedMap) // {3=[kim, jim, kim, jim], 5=[julia], 4=[hala]}
        println(groupedMapByName)
        val groupedMap1 = names.groupBy({it}, {it.length})   //LinkedHashMap: {kim=[3], julia=[5], jim=[3], hala=[4]}
        println(groupedMap1) // {kim=[3, 3], julia=[5], jim=[3, 3], hala=[4]}

        /*
        This often the case that, as a result of grouping, you'd prefer one element instead of a list.
        If the key is unique, then it's more useful to have a map of the key to this unique element as a result.
        That's what they associateBy function does for you. It also performs groping, but it returns you one element as the map value.
        Note that, associateBy should be used to run the keys unique. If it's not, pay attention that duplicates are removed, so the last element will be chosen.
        If you key isn't unique, it's safer to use groupBy to avoid losing some of the elements.
        You can use as associate to build a map based on a list.
         */


        val scientists = listOf(Person("Grace", "Hopper"), Person("Jacob", "Bernoulli"), Person("Johann", "Bernoulli"))
        val byLastName = scientists.associateBy { it.lastName }
        val byLastNameGroup = scientists.groupBy { it.lastName }
        println(byLastName)
        println(byLastNameGroup)


        /*
        You can use as associate to build a map based on a list.
        As an argument, you pass allowed to creating the key value pair based on each list element, then associate builds a map by filling in specified keys and values.
        The first value in a pair becomes key in the map, the second becomes the value.
        Here, a plus it specifies how to create keys, while 10 multiply, it is the way to create values.
        Note that, it's often convenient to use the least element as a key and provide a way to fetch the value in the lambda.
         */

        val names_ex2 = listOf("Grace Hopper", "Jacob Bernoulli", "Johann Bernoulli")
        val byLastNameAssociate = names_ex2.associate { it.split(" ").let { (firstName, lastName) -> lastName to firstName } }
        println(byLastNameAssociate)


        /*
         Zip provides you with a way to organize a couple of lists.
         It zips like a zipper the elements from two lists.
         It returns you a list of pairs where each pair contains one element from the first list
         and another element from the second list.
         If their initial list have different sizes, then the resulting list of pairs will have the length of the shortest list,
         the remaining elements from the longest list will be ignored.
         */

        val stringA = "abcd"
        val stringB = "zyx"
        println(stringA zip stringB) // [(a, z), (b, y), (c, x)]


        /*
        The frequent use case is to zip neighboring elements in the list. That can be done with the help of the zipWithNext function. It returns you a list of pairs where each pair consists of neighboring elements is from the initial list.
        Note that, each element except the first and the last one will belong two pairs.
         */

        val letters = ('a'..'f').toList()
        val pairs = letters.zipWithNext()
        println(letters) // [a, b, c, d, e, f]
        println(pairs) // [(a, b), (b, c), (c, d), (d, e), (e, f)]

        val values = listOf(1, 4, 9, 16, 25, 36)
        val deltas = values.zipWithNext { a, b -> b - a }

        println(deltas) // [3, 5, 7, 9, 11]


        /*
        Flatten is an extension function that must be called on a list of lists.
        It combines all the elements from the nested list and returns you a list of these elements as the result.
        We can say, it flattens the list of lists contents.

        Returns a single list of all elements from all arrays in the given array.
         */

        val deepArray = arrayOf(
                arrayOf(1),
                arrayOf(2, 3),
                arrayOf(4, 5, 6)
        )

        println(deepArray.flatten()) // [1, 2, 3, 4, 5, 6]

        val deepList = listOf(listOf(1), listOf(2, 3), listOf(4, 5, 6))
        println(deepList.flatten()) // [1, 2, 3, 4, 5, 6]


        /*
        Another useful function is flatMap.
        It combines two operations, map and flat.
        The argument to flatMap must be a lambda that converts each initial element to a list. H
        ere, we first map each string into a list of characters.
        In the middle layer after applying the first map operations, we have at list of lists.
        Often, you'd prefer list of elements as a result instead and flatten does that
         */


}

