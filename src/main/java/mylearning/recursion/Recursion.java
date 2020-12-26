package mylearning.recursion;

public class Recursion {

    public static void main(String arg[]){
       // printNumberInReverseOrder(5);
        printNumberInRegularOrder(5);
    }

    private static void printNumberInReverseOrder(int number) {
        if(number == 0){
            return;
        }
        System.out.println(number);
        printNumberInReverseOrder(number-1);
    }
    private static void printNumberInRegularOrder(int number) {
        if(number == 0){
            return;
        }
        printNumberInRegularOrder(number-1);
        System.out.println(number);
    }
}
