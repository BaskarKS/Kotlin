package academy.learnprogramming.declarations

fun main(args: Array<String>) {

    //immutable variables
    val number = 20

    val employee2: Employee
    val number2 = 100

    if (number < number2) {
        employee2 = Employee("Jane", 400)
    } else {
        employee2 = Employee("Mike", 150)
    }

    println(employee2)

    val names = arrayListOf("John", "Jane", "Mary")
    println(names[1])

    val employeeOne = Employee("Mary", 1)
    val employeeTwo = Employee("John", 2)
    val employeeThree = Employee("John", 2)
    println()
    println(employeeOne == employeeTwo)
    println(employeeTwo == employeeThree) //doing content comparison
    println(employeeOne.equals(employeeTwo))
    println(employeeTwo.equals(employeeThree)) //doing content comparison

    println()
    println("using === operator :" + (employeeTwo === employeeThree))

    println("Checking Not Equal")

    println("employeeOne != employeeTwo : " + (employeeOne != employeeTwo))
    println("employeeOne !== employeeTwo : " + (employeeOne !== employeeTwo))
    println("employeeTwo != employeeThree : " + (employeeTwo != employeeThree))
    println("employeeTwo !== employeeThree : " + (employeeTwo !== employeeThree))

    val employeeFour = employeeTwo
    println()
    println("Checking same objects reference and content:")
    println(employeeTwo == employeeFour)
    println(employeeTwo === employeeFour)
    println(employeeTwo !== employeeFour)

    val something: Any = employeeFour
    if (something !is String)  { //checking instanceof type using "is"
        val employeeTemp = something as Employee //type casting done here

        //typecasting not needed as Kotlin already determined something as
        // Employee type with condition (something is Employee
        println(employeeTemp.name)
    }

}

class Employee(var name: String, val id: Int)
{
    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return name == obj.name && id == obj.id
        }
        return false
    }

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }
}

fun topLevel(str:String) = println("Top Level Function called with $str ")