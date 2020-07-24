package mylearning.datastructures.Stack;

import java.util.Stack;

public class BalancedExpression {

    public static boolean isExpressionBalanced(String expression){
        Stack<Character> stack = new Stack();
        for(int i=0 ; i< expression.length(); i++) {
            char charAtCurrentIndex = expression.charAt(i);
            if (charAtCurrentIndex == '{' || charAtCurrentIndex == '[' || charAtCurrentIndex == '(') {
                stack.push(charAtCurrentIndex);
            } else if (charAtCurrentIndex == '}' || charAtCurrentIndex == ']' || charAtCurrentIndex == ')') {
                if (stack.empty()
                        || (charAtCurrentIndex == '}' && stack.peek() != '{')
                        || (charAtCurrentIndex == ']' && stack.peek() != '[')
                        || (charAtCurrentIndex == ')' && stack.peek() != '(')
                ) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main (String arg[]){
        System.out.println(" [A+B]*(a+(a*b))) : "+isExpressionBalanced("[A+B]*(a+(a*b)))"));
    }
}
