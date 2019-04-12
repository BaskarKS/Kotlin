package academy.learnprogramming.declarations

fun main() {
    println("Revise OOPS")

    val laserPrinter = LaserPrinter("Brother1234", 255)
    laserPrinter.printModel()

    myPrinter("customPrinter", 242).printMyFunction()

    Something().printValues()


}

/*
open class Printer() {
}
class LaserPrinter() : Printer() {

}
*/

/*
open class Printer {

}

class LaserPrinter : Printer {
    constructor() : super()
}*/

/*
open class Printer(val modelName: String) {

}
class LaserPrinter(modelName: String) : Printer(modelName) {

}
*/

/*
open abstract class Printer(val modelName: String) {

}
class LaserPrinter(modelName: String) : Printer(modelName) {

}*/

abstract class Printer(val modelName: String) {
    open fun printModel() = println("Model Name of Printer : ${modelName}")

    abstract fun bestSellingPrice(): Double
}

open class LaserPrinter(modelName: String, var ppm: Int) : Printer(modelName) {
    override fun printModel() = println("ModelName of laserPrinter : $modelName $ppm")

    override fun bestSellingPrice(): Double = 122.33
    //override fun bestSellingPrice()= 122.33

    //Restrict the child class to override bestSellingPrice()
    //final override fun bestSellingPrice(): Double = 122.33
}

//override also implicit mean open, we didn't specify open to LaserPrinter methods
class SpecialLaserPrinter(modelName: String, ppm: Int) : LaserPrinter(modelName, ppm) {
    override fun printModel(): Unit = println("SpecialLaserPrinter name is : $modelName, ppm : $ppm")

    override fun bestSellingPrice(): Double = 150.0
}

interface MyInterface {
    val number: Int
    val numberProd: Int
        get() = number * 4

    fun myFunction(str: String): String
}

interface MySubInterface : MyInterface {
    override val number: Int
        get() = 25

    fun mySubFunction(str: String): String
}

class Something : MySubInterface {
    override val number: Int
        get() = 4 //super.number
    override val numberProd: Int
        get() = super.numberProd * 2

    override fun myFunction(str: String): String {
        val prod = numberProd
        return str
    }

    override fun mySubFunction(str: String): String {
        return str
    }

    fun printValues() {
        println("$number and $numberProd")
    }
}

class myPrinter(modelName: String, ppm: Int) : LaserPrinter(modelName, ppm), MySubInterface {
    override val number: Int
        get() = 40 //super.numberProd // cause StackOverFlowError

    override fun myFunction(str: String): String {
        return str
    }

    override fun mySubFunction(str: String): String {
        return str
    }

    final override fun printModel() = println("MyPrinter $modelName and ppm: $ppm")

    override fun bestSellingPrice(): Double = 200.00

    fun printMyFunction() = println("$number")
}

