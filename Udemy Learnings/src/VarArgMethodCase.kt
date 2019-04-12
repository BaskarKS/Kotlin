object VarargMethodCases {

    @JvmStatic
    fun main(args: Array<String>) {
        sum()
        sum(100)
        sum(100, 200)
        sum(10, 20, 30)
        prod("Two Values Passed", 10, 20)
        prod("FOUR Values Passed", 10, 20, 10, 10)

        //CASE 4
        methodOne(10)
        methodOne(*intArrayOf(10, 20))
        //CASE 5:
        //Whereever One dimen array present we can replace with var-Arg parameter => m1(int[] x) => m1(int... x)

        //CASE 6
        //Wherever Var-Arg parameter present we cannot replace with single dimen array => m1(int... x) => m1(int[] x)

        //CASE 7
        val firstArray = intArrayOf(10, 20)
        val secondArray = intArrayOf(30, 40, 50, 60, 70)
        twoDimenArrayPassed(firstArray, secondArray, intArrayOf(80, 90))
    }

    //CASE 2
    fun prod(
        toBeShown: String,
        vararg prodValues: Int
    ) // if other params are also passed along with vararg params, then vararg
    // should be the last param to be passed, also we cant have more than one
    //var-Arg parameter
    {
        println("in Var-Arg of Prod Method : $toBeShown")
        var totalProdResult = 1
        for (value in prodValues)
            totalProdResult *= value
        println("Product of Numbers is : $totalProdResult")
    }

    //CASE 1
    fun sum(vararg intArgs: Int) //intArgs is single Dimen array of the type int
    {
        var totalSum = 0
        println("in Var-Arg of Sum Method " + intArgs.size)
        for (value in intArgs)
            totalSum += value
        println("Total Sum : $totalSum")
    }

    //CASE 3
    //error: cannot declare both singleDimenArray(int[]) and singleDimenArray(int...) in Var-Arg MethodCases
    // Leads to Ambiguity Problem below methods are not overloaded, both appears same signature (int... x) == (int[] x)
    /*
	public static void singleDimenArray(int... var_arg)
	{
		System.out.println("singleDimenArray - Var-Arg Method");
	}
	public static void singleDimenArray(int[] singleDimenArray)
	{
		System.out.println("singleDimenArray - singleDimenArray");
	}
	*/

    //CASE 4
    fun methodOne(vararg arg: Int) {
        println(" methodOne var-Arg method")
    }

    //if methodOne(10) called below method has more priority than methodOne(int...) method. Var-Arg methods have least priority
    fun methodOne(arg: Int) {
        println("methodOne  Single argument method")
    }

    //CASE 7
    fun twoDimenArrayPassed(vararg twoDimenArray: IntArray) {
        val tempArry: IntArray? = null
        for (singleDimenArray in twoDimenArray)
            for (intValue in singleDimenArray)
                println("In VarArg method of TwoDimen Array Passed : $intValue")
    }
}