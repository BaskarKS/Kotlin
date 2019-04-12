package academy.learnprogramming.declarations

import academy.learnprogramming.javacode.SomeClass

val MY_INT_CONSTANT = 1000
val MY_STRING_CONSTANT = "MY String Constant"
val MY_SHORT_CONSTANT: Short = 10

typealias strArray = Array<String>

fun main() {
    println("revision checks")
    val name: strArray = arrayOf("Baskar", "Ramani", "Geetha", "Jaasritha")
    for (each in name)
        println("name in List : $each => " + each.javaClass)

    val names = listOf("Baskar", "Yuva", "Deva")
    for (index in 0 until names.size)
        println("Accessing list using Index => ${names[index]}")

    // casting operators are "is" - to check is an instance of
    //                       "as" - to assign, "!is" check not an instance of
    if (name is Array<String>) {
        println("name is Array of String")
/*     we get ClassCastException
       val toArrayList = name as List<String>
       if (toArrayList is List<String>)
           println("Converted to ArrayList")
*/
    }
    val isVal = -10.0
    println(SomeClass().printSome(isVal.toFloat()))

    val any: Any = 12.5
    println((any as Double) is Double)
    println(any !is Double)

    try {
        unImplemented()
    } catch (e: java.lang.ClassCastException) {
        println("Got a ClassCast Exception")
    }
    val arr = Array(10) { i -> i * 2 }
    for (each in arr)
        print("$each ")

    println()
    val notInit: Array<Int>
    notInit = arrayOf<Int>(11, 22, 33, 44, 55)
    for (each in 0 until notInit.size) {
        print(each)
        notInit[each] = 0
    }
    println()
    SomeClass().checkPrimArray(notInit.toIntArray())
    SomeClass().checkPrimArray(intArrayOf(12, 23, 34, 45))
    SomeClass().checkPrimArray(IntArray(5)) //primitive Array

    println()
    val primArray = IntArray(4)
    val intArray = primArray.toTypedArray()
    for (each in intArray)
        println(each)

    println()
    val aray = IntArray(4) { i -> i + 1 }
    for (each in aray)
        println(each)

    val str: String? = "Baskar"
    if (str != null)
        println(str.toUpperCase())
    //Or
    println(str?.toUpperCase())
    val address = BankAddress(BankCity("Chennai"))
    val branch = BankBranch(address)
    address.makeNull()
    var bank: String? = branch?.address?.city?.cityName ?: "Mumbai"
    var bankName: String? = bank ?: "Mumbai"
    println(bank)
    //println(bankName)

    val something: Any = arrayOf(1, 2, 3, 4)
    val typecast: Array<Int>? = something as? Array<Int>
    val check = something as? Int //Safe Typecast
    println(typecast)
    println(check)

    println()
    val nullStr: String? = null
    //val sureStr: String? = nullStr
    //val sureStr: String = nullStr!!
    //println(sureStr)
    val sendString: String? = nullStr ?: "some Value"
    if (sendString != null) printSomething(sendString)
    sendString?.let { printSomething(sendString) }
    sendString?.let { printSomething(it) }

    val strArray = arrayOfNulls<Int>(10)
    for (each in strArray) {
        print(" $each ")
        print(each is Int?)
    }
    strArray[3].toString()

    println()
    val emp = Emp("baskar")
    val emp2 = Emp("baskar")
    println("Both objects equal contents ====> ${emp.equals(emp2)} ")
    println("${emp.name} and ${emp.fulltime}")
    val emp1 = Emp("Yuva", false)
    println("${emp1.name} and ${emp1.fulltime}")

    val t = test("default", false)
    println("${t.name} and ${t.priv}")
    //t.set(true)
    t.name = "custom"
    t.priv = true
    println("${t.name} and ${t.priv}")

    println("$MY_INT_CONSTANT ${MY_INT_CONSTANT is Int}")
    println("$MY_STRING_CONSTANT ${MY_STRING_CONSTANT is String}")
    println("$MY_SHORT_CONSTANT ${MY_SHORT_CONSTANT is Short}")

    //Dataclass
    val car1 = Car("blue", "ford", 2000, "left", true)
    val car2 = Car("blue", "ford", 2000)
    println(car1.equals(car2)) // validate only primary constructor values
    val car3 = car1.copy() //copy only primary constructor values
    println("Car1 Steer:${car1.steer} and comfort:${car1.comfort}")
    println("Car3 Steer:${car3.steer} and comfort:${car3.comfort}")
    println(car1.toString())
    println(car1 == car3)
    val car4 = car1.copy(year = 2019, color = "Black")
    car4.steer = "left"
    car4.comfort = true
    println(car1 == car4)
    println(car4)

    println()
    //1. if var-arg is last param, no need to specify names to other params
    //2. if var-arg as first param then compulsary other param specify names
    // while passing
    printCars("Right", false, car1, car2, car3, car4)

    //Spread Operator *
    var dataClassArray = arrayOf(car1,car2,car3,car4)
    println()
    printCars("right", false, *dataClassArray) //spread operator to unpack array

    var arrayIntOne = arrayOf(111, 222, 333, 444)
    var arrayIntTwo = arrayOf(11, 22, 33, 44)
    var arrayIntCombo = arrayOf(*arrayIntOne, *arrayIntTwo, 15)

    println()
    for (each in arrayIntCombo) {
        println(each)
    }

    val statement = "all this statement is lowercase"
//  println(firstAndLastToUpperCase(statement))
//  println(firstAndLastToUpperCase("baskar"))

    println(statement.firstAndLastToUpperCase())
    println("baskar".firstAndLastToUpperCase())

    println(multiply(10, 20))
    println(multiply(5, 10, "Product is "))

}

inline fun multiply(operandOne: Int, operandTwo: Int, label: String = "Result is ") =
    "{$label : ${operandOne * operandTwo}}"

/*
fun String.firstAndLastToUpperCase(str: String): String {
    return str.substring(0, 1).toUpperCase() +
            str.substring(1, str.length - 1) +
            str.substring(str.length - 1, str.length).toUpperCase()
}
*/
/*fun String.firstAndLastToUpperCase(): String {
    return this.substring(0, 1).toUpperCase() +
            this.substring(1, this.length - 1) +
            this.substring(this.length - 1, this.length).toUpperCase()
}*/
fun String.firstAndLastToUpperCase(): String {
    return substring(0, 1).toUpperCase() +
            substring(1, length - 1) +
            substring(length - 1, length).toUpperCase()
}

fun printCars (steer: String, comfort: Boolean, vararg cars: Car) {
    for (each in cars) {
        print(each)
        print("(Steer = ${each.steer}, comfort = ${each.comfort})")
        println()
    }
}

data class Car(val color: String, val model: String, val year: Int) {
    //below params are not considered for equals(), copy(), toString()
    var steer: String = "Right"
    var comfort: Boolean = false

    constructor(color: String, model: String, year: Int, steer: String, comfort: Boolean) :
            this(color, model, year) {
        this.steer = steer
        this.comfort = comfort
    }
}

fun printSomething(str: String) {
    println(str)
}

class BankBranch(val address: BankAddress) {

}

class BankAddress(var city: BankCity?) {
    fun makeNull() {
        city = null
    }
}

class BankCity(val cityName: String) {

}

fun unImplemented(): Nothing {
    throw ClassCastException("Check Nothing")
}

/*
class Emp(val name: String) { //constructor(name: String) {
    /*    val name: String = name
        init {
            this.name = name
            println("In init Block of assignment")
        }
     */
    init {
        println("In Init Block : $name")
    }
}

class Emp(val name: String) {
    var fulltime:Boolean = true
    constructor(name: String, fulltime: Boolean = false) : this(name) {
        this.fulltime = fulltime
    }
}

 class Emp(val name: String, var fulltime: Boolean = false) {

}
*/
class Emp {
    val name: String
    var fulltime: Boolean

    constructor(name: String, fulltime: Boolean = true) {
        this.name = name
        this.fulltime = fulltime
    }

/*    override fun equals(other: Any?): Boolean {
        if (other is Emp) {
            return if (this.name == other.name && this.fulltime == other.fulltime) {true} else {false}
        }
        else {
            return false
        }
    }*/

}
/*
class test(val name: String, private var priv: Boolean = false) {
    fun get(): Boolean {
        return priv
    }
    fun set(toggle: Boolean) {
        this.priv = toggle
    }
}
 */

class test {
    var name: String
        get() {
            println("custom Get for Name")
            return field
        }
        set(value) {
            println("custom set for Name")
            field = value
        }
    var priv: Boolean //private var priv: Boolean
        get() {
            println("custom get for Priv")
            return field
        }
        set(value) {
            println("custom set for Priv")
            field = value
        }

    constructor(name: String, priv: Boolean) {
        println("secondary constructor called")
        this.name = name
        this.priv = priv
    }
}