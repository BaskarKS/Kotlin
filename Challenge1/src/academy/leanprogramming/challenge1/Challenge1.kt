package academy.leanprogramming.challenge1

fun main(args: Array<String>)   {
    val hello1: String = "Hello"
    val hello2 = "Hello"
    println(hello1 === hello2)
    println("Checking both the variables are referentially equal: ${hello1 === hello2}")
    println("Checking for Content equals : ${hello1 == hello2}")

    var value: Int = 2988

    val anyTypeInfo: Any = "The Any type is the root of the kotlin class Hierarchy"
    if (anyTypeInfo is String) {
        println(anyTypeInfo.toUpperCase())
    }

    println("""   1
                  |  11
                  | 111
                  |1111""".trimMargin())
    println()
    println("""1   1
               1  11
               1 111
               11111""".trimMargin("1"))


}