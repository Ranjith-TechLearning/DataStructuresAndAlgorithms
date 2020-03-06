package mylearning.problems.string;

public class ReverserPrint {
    public static void main (String arg[]){
        reversePrint("abcdefghijklmnopqrstuvwxyz");

        int[] numbers1 = new int[] {11, 11, 12, 13, 4, 5, 6, 7, 8, 9,10};
        int[] number2 = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        System.out.println(printNumbersss(numbers1));
        System.out.println(printNumbersss(number2));

    }

    public static String printNumbersss (int[] numbers){
        int rEven = numbers[0];
        int rOdd = numbers[1];
        int length = numbers.length;

        int evenIndex = 0;
        int oddIndex = 1;

        while(evenIndex + 2 < length || oddIndex + 2 < length) {

            if(evenIndex +  2  < length) {
                evenIndex += 2;
                rEven  = rEven * numbers[evenIndex];
            }
            if(evenIndex + 2 < length) {
                evenIndex += 2;
                rEven = rEven + numbers[evenIndex];
            }
            if(oddIndex +  2  < length) {
                rOdd = rOdd * numbers[oddIndex + 2];
                oddIndex = oddIndex + 2;
            }
            if(oddIndex + 2 < length) {
                rOdd = rOdd +numbers[oddIndex + 2];
                oddIndex = oddIndex + 2;
            }

        }

        int evenNumber = rEven %2;
        int oddNumber = rOdd %2;

        if(oddNumber > evenNumber){
            return "ODD";
        }else if(evenNumber > oddNumber){
            return "Even";
        }

        return "NUTERAL";
    }

    private static void reversePrint(String hello) {
        char[] arra = hello.toCharArray();
        int length = arra.length;
        for(int i = 0 ; i< length/2; i ++){
            char temp = arra[i];
            arra[i] = arra[length-i-1];
            arra[arra.length-i-1] = temp;
        }
        System.out.println("Reversed String.. "+new String(arra));
    }




}
