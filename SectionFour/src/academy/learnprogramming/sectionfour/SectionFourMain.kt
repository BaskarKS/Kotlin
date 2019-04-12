package academy.learnprogramming.sectionfour

import academy.learnprogramming.javacode.DummyClass

fun main() {
    println("Welcome to Section Four")
    //dataTypes()
    arrayLearning()
}

fun dataTypes() {
    val myInt = 10 // kotlin automatically widens numeric literals
    var myLong = 22L

    myLong = myInt.toLong()

    val myByte: Byte = 111
    var myShort: Short
    myShort = myByte.toShort() // no automatic widening for variables

    var myDouble = 34.567
    println(myDouble is Double)
    val myFloat = 123.45f
    println(myFloat is Float)
    //val myFloatOne: Float = 123.32 // Error
    myDouble = myFloat.toDouble() // explicit widening required

    val charVal = 'b'
    val charNew: Char = 'G'

    // val myChar: Char = 65 // Error: Cant assign an int value
    val myCharInt = 65
    var myChar = myCharInt.toChar()
    println(myChar)

    val myBoolean = false
    val myBoolExplicit: Boolean = true
    println(myBoolExplicit)

    val vacation = false
    //either isVacation() java method expects primitive "boolean" or
    //class "Boolean" value, kotlin take care of converting the vacation
    //kotlin Boolean class value to the respective java class parameter
    val onVacation = DummyClass().isVacation(vacation)
    println(onVacation)
}

fun arrayLearning (): Unit {
    val names = arrayOf("john", "jane", "jill", "Joe")

    val longs1 = arrayOf(1L,2L,3L)
    val longs2 = arrayOf<Long>(1,2,3,4,5)
    val longs3 = arrayOf(1,2,3)

    println(longs1 is Array<Long>)
    println(longs2 is Array<Long>)
    println(longs3 is Array<Int>)
    println(longs2[2])

    val evenNumbers = Array(10) {i -> i * 2}
    for (value in evenNumbers)
        println(value)

    val lotsOfNumbers = Array(100000){i -> i}
    val allZeros = Array(100){0}

    println()
    var someArray: Array<Int>
    someArray = arrayOf(1,2,3,4,5)
    for (number in someArray)
        println(number)

    println()
    someArray = Array(6) {i -> (i + 1) * 10}
    for (each in someArray)
        println(each)

    println()
    val mixedArray = arrayOf("Baskar", 10, 20L, true, 'c', 15.5)
    for (element in mixedArray)
        println(element)
    println(mixedArray is Array<Any>)

    println()
    //var myIntArray = arrayOf(5,6,56,44,23)
    //DummyClass().printNumbers(myIntArray)
    val myIntArray = intArrayOf(5,6,56,44,23) // creates primitive array
    DummyClass().printNumbers(myIntArray)

    //cant create collection array without values
    // var someOtherArray = Array<Int>(5)
    var array1: Array<Int> //can declare the type without instantiating

    // can create array, init wit default values
    println()
    var primArray = IntArray(5)
    DummyClass().printNumbers(primArray)

    println()
    //convert collection array to primitive array
    DummyClass().printNumbers(arrayOf(10,20,30).toIntArray())

    //convert primitive array to collection Array
    var collectionArray: Array<Int> = primArray.toTypedArray()




}