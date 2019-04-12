package academy.learnprogramming.javacode;

public class DummyClass {
/*
    public String isVacation(boolean onVacation)    {
        return onVacation ? "I am on Vacation" : "I am Working";
    }

*/
    public String isVacation(boolean onVacation)    {
        return onVacation ? "I am on Vacation" : "I am Working...";
    }

    public void printNumbers(int[] numbers)
    {
        for(int num : numbers)
        {
            System.out.println(num);
        }
    }
}
