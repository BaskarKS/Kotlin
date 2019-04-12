package academy.learnprogramming.declarations

fun main() {
    stringTemplates()
}
fun stringTemplates() {
    println("String Templates")
    val employeeString = Employee("Baskar", 11400)
//prints Employee object reference "academy.learnprogramming.declarations.Employee@5e2de80c"
    println(employeeString)
    //Inorder to print Employee items need to override toString() method of Employee class
    //After Overriding we get => Employee(name=Baskar, id=11400)
    val change = 4.22
    println("to print the value of $change")
    println("to print the variable name using $ symbol need to escape \$change")
    println("to print the variable name using $ symbol $$change")

    val numer = 10.99
    val denom = 20.0
    println("Value of Numerator is $numer and Denominator is $denom and result is ${numer / denom}")
    println("To print employee object name " +
            "" +
            "" +
            "using string templates : ${employeeString.name}")




}



