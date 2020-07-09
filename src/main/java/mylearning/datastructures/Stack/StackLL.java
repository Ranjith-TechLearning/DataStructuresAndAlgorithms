package mylearning.datastructures.Stack;

public class StackLL {
    class Node {
        int data;
        Node link;
        Node(int data, Node link){
            this.data = data;
            this.link = link;
        }
    }
    Node head = null;
    public void push(int element){
        Node newElement = new Node(element,null);

        if(head == null){
            head = newElement;
            return;
        }

        newElement.link = head;
        head = newElement;

    }
    public void pop() throws Exception {
        if(head == null){
            throw new Exception("Stack is already empty");
        }
        if(head.link !=null){
            head = head.link;
        }else{
            head = null;
        }
    }

    public int top(){
        if(head !=null){
            return head.data;
        }
        return -1;
    }

    public static void main (String arg[]) throws Exception {
        StackLL stackLL = new StackLL();
        stackLL.push(10);
        System.out.println(stackLL.top());
        stackLL.push(20);
        stackLL.push(30);
        System.out.println(stackLL.top());
        stackLL.pop();
        System.out.println(stackLL.top());
        stackLL.pop();
        System.out.println(stackLL.top());
        stackLL.pop();
        System.out.println(stackLL.top());


    }
}
