package mylearning.datastructures.Stack;

import java.lang.reflect.Array;

//Array based..
//Insert O(1)
//Retrival O(1)
public class Stack {
    int MAX = 10;
    int[] intArray = new int[MAX];
    int top = -1 ;
    public void push(int number){
        if(top==MAX-1){

            int[] tempArray = new int[MAX*2];
            System.arraycopy(intArray, 0 , tempArray, 0, MAX);
            intArray = tempArray;
        }
        top ++;
        intArray[top] = number;
    }
    public void pop(){
        if(top<0){
            System.out.print("Stack is empty");
        }
        top --;

    }
    public int top(){
        return top;
    }

    public static void main(String arg[]){
        Stack stack = new Stack();
        for(int i=0 ; i<20 ; i++){
            stack.push(i+1);
            System.out.print(i+1+ " , ");
        }
        for(int i=10 ; i>0  ; i--){
            stack.pop();
            System.out.print(i);
        }
        //stack.push(10);
    }

}
