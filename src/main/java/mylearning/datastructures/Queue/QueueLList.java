package mylearning.datastructures.Queue;

public class QueueLList {
    Node front= null;
    Node rear = null;

    public static void main(String arg[]){
        QueueLList queue = new QueueLList();
        queue.enqueue(10);
        System.out.println(queue.peak());
        queue.enqueue(20);
        System.out.println(queue.peak());
        queue.enqueue(30);
        System.out.println(queue.peak());
        queue.dequeue();
        System.out.println(queue.peak());
        queue.dequeue();
        System.out.println(queue.peak());
        queue.dequeue();
        System.out.println(queue.peak());

    }

    private void dequeue() {
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        front = front.link;
        if(front == rear){
            rear =null;
        }
    }

    private int peak() {
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }else{
        return front.data;}
    }

    private void enqueue(int i) {
        Node newNode = new Node();
        newNode.data = i;

        if(isEmpty()){
            front = rear = newNode;
        }else{
            rear.link = newNode;
            rear = newNode;
        }
    }
    private boolean isEmpty(){
        if(front == null && rear == null){
            return true;
        }
        return false;
    }

    class Node {
        int data;
        Node link;
    }
}
