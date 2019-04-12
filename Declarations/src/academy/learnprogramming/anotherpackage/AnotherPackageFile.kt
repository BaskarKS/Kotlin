package academy.learnprogramming.anotherpackage
import academy.learnprogramming.declarations.Department
import academy.learnprogramming.declarations.Department.IT
import academy.learnprogramming.declarations.companyCommunication
import academy.learnprogramming.declarations.topLevel
fun main() {
    topLevel(" => Called from Another Package")
    println(companyCommunication.getCopyRightLine())
    println(IT.getDeptInfo())
    println(Department.SALES.getDeptInfo())
}