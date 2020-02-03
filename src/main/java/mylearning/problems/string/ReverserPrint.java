package mylearning.problems.string;

public class ReverserPrint {
    public static void main (String arg[]){
        reversePrint("abcdefghijklmnopqrstuvwxyz");

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
