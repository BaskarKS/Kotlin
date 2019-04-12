package academy.learnprogramming.javacode;

public class SomeClass {
    private static int val = 999;
    public String printSome(float val) {
        return val > 0 ? "Its True" : "Its false";
    }

    public void checkPrimArray(int[] arr) {
        for(int each : arr) {
            System.out.println(each);
        }
    }
    public static void main(String[] args) {
        System.out.println(getValue());
    }

    public static int getValue() {
        return val;
    }
}
