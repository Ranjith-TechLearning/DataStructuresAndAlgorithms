package mylearning.datastructures.Stack;


import java.util.Stack;

public class BalancedParanthesesProblem {

    public static void main(String[] str){
        BalancedParanthesesProblem obj = new BalancedParanthesesProblem();
        System.out.println(obj.isBalancedParantheses("[(a+B)()]}"));

    }

    private boolean isPair(char open, char close){
      return  (open == '{' && close == '}'
        || open == '[' && close == ']'
        || open == '(' && close == ')') ? true : false;

    }

    private boolean isBalancedParantheses(String s) {
        Stack<Character> stack = new Stack();
        for(int i=0 ; i<s.length(); i++){
            if(s.charAt(i) == '{' ||  s.charAt(i) == '[' || s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }else if(s.charAt(i) == '}' ||  s.charAt(i) == ']' || s.charAt(i) == ')'){
                if(stack.empty() || !isPair(stack.peek() , s.charAt(i))){
                    return false;
                }else{
                    stack.pop();
                }
            }

        }
        return stack.empty() ? true : false;
    }
}
