package academy.learnprogramming.nullreferences

fun main(args: Array<String>) {
    val str1: String? = "isn't NULL"
    // since str1 is considered nullable string type,
    //have to check safety either using if() block
    // str1.toUpperCase(); //Error
    if (str1 != null) {
        str1.toUpperCase()
    }

    // to avoid explicit null checks which cause lot of code
    // below uses SAFE-ACCESS expression
    var str: String? = null
    println("string null, using safe access => " + str?.toUpperCase()) // no if() null check needed cause if str?.
    //str = "String is Available"
    println("string not null, using safe access => " + str?.toUpperCase())

    val str3: String? = null
    val str2 = str ?: "default Value"
    println(str2)
    println("using safe-access and elvis => " + (str3?.toUpperCase() ?: "default"))

    val str4: String = "Testing safe-access for normal String"
    println(str4?.toUpperCase())

    val array: Any = arrayOf(1,2,3,4)
    // if we have used safe-cast(as?) operator, str5 will be infer by compiler as
    // nullable String. Hence forth safe-access(?) should be used to access
    val str5 = array as? String
    println(str5)

    val str6: String? = "This isn't null"
    println(str6?.toUpperCase()) //? should be used for nullable string type
    // (not-null assert operator !!) override saying compiler that sure about value
    println(str6!!.toUpperCase())

    val str7: String? = null
    //val str8: String = str7!! // exception thrown even if str7 not invoked
    //println(str8!!.toUpperCase()) //NullPointerException

    var str9: String? = "check Let = This isn't null"
    //solved str9 is nullable string, printText() expects String
    //printText(str9) //Error
    //1. can be solved by instructing compiler to ignore
    printText(str9!!)
    //or 2. having if() check
    if(str9 != null)
        printText(str9)
    str9?.let { printText(it)}
    str9 = null
    //but if str9 somehow becomes null because of large code above
    str9?.let { printText(it)} //if str9 is not null let the function execute, don't exec

    val str10: String? = null
    val str11 = "is not nullable"
    println(str10 == str11) // == is safe operator
}

fun printText(text: String)
{
    println(text)
}