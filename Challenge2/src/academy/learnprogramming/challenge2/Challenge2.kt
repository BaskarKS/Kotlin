package academy.learnprogramming.challenge2

import academy.learnprogramming.javacode.Challenge2

fun main() {
    //1. Declare a non-nullable float variable 2 ways and assign it the
    //value -3847.384
    val floatArgOne = -3847.384f
    val floatArgTwo: Float = -3847.384f
    val floatArgThree = (-3847.384).toFloat()
    println("first arg -> $floatArgOne " +
            "and second Arg -> $floatArgTwo" +
            "and Third Arg -> $floatArgThree")

    //2. Now change both of the variable declarations into nullable
    // variables
    val floatArgNullableOne: Float? = -3847.384f
    val floatArgNullableTwo: Float? = (-3847.384).toFloat()

    //3. Now declare an array of type non-nullable Short . make it size 5
    // assign it values 1,2,3,4,5
    val shortArrayOne: Array<Short> = arrayOf<Short>(1,2,3,4,5)
    val shortArrayTwo = arrayOf<Short>(1,2,3,4,5)
    var shortArrayThree: Array<Short>
    shortArrayThree = arrayOf(1,2,3,4,5)
    val shortArrayFour = shortArrayOf(1,2,3,4,5)
    println(shortArrayThree is Array<Short>)

    //4. Now declare an array of nullable ints and initialize it with the values
    //5,10,15..200
    val nullableIntArrayOne: Array<Int?> = arrayOfNulls<Int>(40)
    val nullableIntArrayTwo = arrayOfNulls<Int?>(40)
    val nullableIntArrayThree = arrayOfNulls<Int>(40)
    val nullableIntArrayFour = Array<Int?>(40){i->(i + 1) * 5}
    for(each in nullableIntArrayFour)
        print("$each ")

    //5. you have to call a java method with the following signature from kotlin:
    //public void method1(char[] charArray), declare an array that you could pass to the
    //method and initialize it with the values 'a', 'b', 'c'
    println()
    val charArrayOne = charArrayOf('a', 'b', 'c')
    val charArrayTwo = arrayOf('a','b','c')
    Challenge2().method1(charArrayOne)
    println()
    Challenge2().method1(charArrayTwo.toCharArray())

    //6.Given the following code
    var x: String? = "I AM IN UPPERCASE"
    //Using one line of code and declare another string variable, and assign it
    //x.toLowerCase() when x isn't null and the string "I give up!" when x is null
    var y = x?.toLowerCase()?:"I give Up!"
    println(y)

    //7. now use the let function  to (a) to lowercase the string, (b) replace "am"
    //with "am not" in the result
    var z = x?.let { it.toLowerCase().replace("am", "am not") }
    println(z)
    x?.let { println(it.toLowerCase().replace("am", "am not")) }

    //8. If you are really really confident that the variable  myNonNullVariable cant't
    // contain null.
    //change the following code to assert that myNonNullVariable isn't null
    //(and shoot your self in the foot!)
    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble()



}