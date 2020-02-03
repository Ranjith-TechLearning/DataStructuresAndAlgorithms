package mylearning.datastructures.Queue;

import java.util.Arrays;

public class QueueUsingLinkedList {
    private Node front;
    private Node rear;

    class Node {
        int element;
        Node link;

    }

    public void enquue(int element){
        Node newNode = new Node();
        newNode.element = element;

        if(isEmpty()) {
            front = newNode;
            front.link = newNode;
        }else{
            rear.link = newNode;
        }

        rear = newNode;
    }
    public void dqueue(){
        System.out.println("Elemenent deleted from the queue : "+front.element);
        front = front.link;

    }
    public int getFront(){
        int frontElement = rear.element;
        System.out.println(" This is the element in the front : "+frontElement);
        return frontElement;
    }
    public boolean isEmpty(){
        boolean isEmpty = true;
        return isEmpty;
    }

    public static void main(String arg[]){
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.enquue(1);
        queue.getFront();
        queue.enquue(2);
        queue.getFront();
        queue.dqueue();
        queue.getFront();
    }

}
