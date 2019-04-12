package academy.learnprogramming.declarations

import java.time.Year

fun main() {
    println(companyCommunication.getCopyRightLine())
    println(companyCommunication.getTagLine())

    println(SomeClass.accessPrivateValue())

    //println(SomeClass("Check-Create Instance").someString) // error to instantiate SomeClass object

    var someClassObj = SomeClass.justAssign("Baskar")
    println("someClassObj is SomeClass instance : ${someClassObj is SomeClass}")
    println(someClassObj.someString)
    var someClassObjTwo = SomeClass.upperOrLowerCase("baskar k s", true)
    println(someClassObjTwo.someString)
    val intLocal = 999
    needInterfaceAsParam(object : SomeInterface {
        override fun mustImplement(num: Int): String = "passed num => doubled => ${num * 2} and IntLocal $intLocal"
    })

    println(Department.ACCOUNTS.getDeptInfo())
    println(Department.IT.getDeptInfo())
    println(Department.SALES.getDeptInfo())
    println(Department.CLEANING.getDeptInfo())
    println(Department.CLEANING is Department)
}
enum class Department(val fullname: String, val noOfEmp: Int) {
    HR("Human Resources", 5), IT("Information Tech", 10), ACCOUNTS("Accounting", 3),
    SALES("Sales Executives", 20), CLEANING("Cleaning", 20);

    fun getDeptInfo() = "The $fullname dept has $noOfEmp employees"
}

interface SomeInterface {
    fun mustImplement(num: Int): String
}

fun needInterfaceAsParam(inter: SomeInterface) {
    println("Printing from SomeInterface => ${inter.mustImplement(100)}")
}

//Singleton Class
object companyCommunication : Printer("ImplementClass"), MyInterface {
    override val number: Int
        get() = 10 //Default Val

    override fun myFunction(str: String): String = "Nothing"
    override fun bestSellingPrice() = 20.0

    val currentYear: Int = Year.now().value
    fun getTagLine() = "Our Company Sucks"
    //internal fun getCopyRightLine() = "CopyRight \u00A9 $currentYear. All Rights Reserved"
    fun getCopyRightLine() = "CopyRight \u00A9 $currentYear. All Rights Reserved"
}


/*
class SomeClass {
    val someString: String
    private constructor(someString: String) {
        this.someString = someString
    }
    companion object {
        private var privateVar = 10
        fun accessPrivateValue(): String = "privateVar value is : $privateVar"

        fun justAssign(str: String) = SomeClass(str)

        fun upperOrLowerCase(str: String, case: Boolean)  = {
            if (case) SomeClass(str.toUpperCase())
            else SomeClass(str.toLowerCase())
        }
    }
}*/

//class SomeClass(val someString: String){
class SomeClass private constructor(val someString: String) {
    /*    val someString: String
    private constructor(someString: String) {
        this.someString = someString
    }*/
    companion object {
        private var privateVar = 10
        fun accessPrivateValue(): String = "privateVar value is : $privateVar"

        fun justAssign(str: String) = SomeClass(str)

        fun upperOrLowerCase(str: String, case: Boolean): SomeClass {
            if (case) return SomeClass(str.toUpperCase())
            else return SomeClass(str.toLowerCase())
        }
    }
}



