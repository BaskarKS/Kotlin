package academy.learnprogramming.anothermodule

import academy.learnprogramming.declarations.companyCommunication
import academy.learnprogramming.declarations.topLevel
import academy.learnprogramming.declarations.Department as Dept
fun main() {
    topLevel("From Another Module")
    println(companyCommunication.getCopyRightLine())
    println(Dept.IT.getDeptInfo())
}

