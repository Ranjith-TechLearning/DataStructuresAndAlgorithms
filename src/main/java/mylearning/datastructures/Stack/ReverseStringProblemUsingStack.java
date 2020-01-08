package mylearning.datastructures.Stack;
import java.util.Stack;

public class ReverseStringProblemUsingStack {


    public String reverse(String input, int length){
        Stack<Character> stack = new Stack();

        for(int i = 0 ; i< input.length() ; i++){
            stack.push(input.charAt(i));
        }

        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0 ;i<length; i ++){
            stringBuffer.append(stack.peek());
            stack.pop();
        }
        return stringBuffer.toString();

    }

    public String reverseUsingTwoPositionWay(String input){
        char[] inputarray = input.toCharArray();
        int min_index = 0;
        int max_index = input.length()-1;
        while(min_index < max_index){
            char temp = inputarray[min_index];
            inputarray[min_index] = inputarray[max_index];
            inputarray[max_index] = temp;
            min_index ++ ;
            max_index -- ;
        }

        return (new String(inputarray));
    }


    public static void main(String[] arg){

        ReverseStringProblemUsingStack reverse = new ReverseStringProblemUsingStack();

        String input = "MOM DAD IS IN THE OFFICE";


        System.out.println("|-------------------------------------------------|");
        System.out.println("|       " + reverse.reverse(input, input.length()));
        System.out.println("|-------------------------------------------------|");

        System.out.println("Reverse Using.. efficient way");
        System.out.println();
        System.out.println("|-------------------------------------------------|");
        System.out.println(reverse.reverseUsingTwoPositionWay("Kanna Lattu Thinna aasaya"));
        System.out.println("|-------------------------------------------------|");



    }
}
