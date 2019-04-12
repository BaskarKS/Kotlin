package academy.learnprogramming.accessmodifers

fun main() {
/*
    val emp = Employee("Baskar")
    println(emp.firstName)
    emp.firstName = "jaasritha"
    println(emp.firstName)

    val emp1 = Employee("Ramani", false)
    println(emp1.firstName)
    println(emp1.fullTime)
    emp.fullTime = true
    println(emp1.fullTime)
*/
    val car = Car("Red", "Honda", 2019)
    val car1 = Car("Black", "Honda", 2019)
    car1.fit = "Its not"
    println(car)
    println(car.fit)
    println(car1)
    println(car1.fit)
    println("Hi " + "You There")
    println(car.color + car.fit + car.model + car.year)
    println(car == car1)

    val car2 = car.copy()
    println(car2)
}

/*
class Employee constructor (firstName: String)  {
    val firstName: String
    init    {
        this.firstName = firstName
    }
}
*/

/*
class Employee constructor (firstName: String)  {
    val firstName: String = firstName
}
*/
/*
class Employee constructor (val firstName: String)  {

}
*/

/*
class Employee (var firstName: String)  {

}
*/

/*
class Employee (var firstName: String)  {
    var fullTime: Boolean = true
    constructor(firstName: String, fullTime:Boolean): this(firstName)    {
        this.fullTime = fullTime
    }
}
*/

/*
class Employee(var firstName: String, var fullTime: Boolean = false)    {

}
*/

/*
class Employee  {
    var firstName: String
    var fullTime: Boolean
    constructor(firstName: String)  {
        this.firstName = firstName
        this.fullTime = false
    }
    constructor(firstName: String, fullTime: Boolean)   {
        this.firstName = firstName
        this.fullTime = fullTime
    }
}
*/
/*
class Employee (firstName: String, fullTime: Boolean = true)   {
    var fullTime: Boolean = fullTime
    get()   {
        println("Calling custom getter")
        return field
    }
    set(value)  {
        println("Calling custom Setter")
        field = value
    }
    var firstName: String = firstName
    get()   {
        println("Calling custom name getter")
        return field
    }
    set(value)   {
        println("calling custom name setter")
        field = value.toUpperCase()
    }
}
*/

/*
data class Car(var color: String = "Blue", var model: String = "Toyota", var year: Int = 1999) {

}
*/
data class Car(var color: String, var model: String, var year: Int) {
    var fit: String = "Its Fit"
}