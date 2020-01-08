package mylearning.datastructures.Stack;

public class Stack {
    int INITIAL_CAPACITY = 10;
    int[] elements = new int[INITIAL_CAPACITY];
    int top = -1;

    public Stack(){


    }
    public void push (int element){
        top++;
        elements[top] = element;
    }
    public void pop(){
        top --;
    }
    public int peek(){
        return elements[top];
    }
    public boolean isEmpty(){
        return top <0;
    }
    public void print(){
        System.out.println("=============================");
        for (int i=0;i<=top;i++){
            System.out.println(elements[i]);
        }
        System.out.println("=============================");;
    }

    public static void main(String arg[]){
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.print();
        stack.pop();
        stack.print();
        stack.push(40);
        stack.print();

    }
}
