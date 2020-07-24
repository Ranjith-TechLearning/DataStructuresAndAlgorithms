package mylearning.datastructures.Queue;

public class QueueArray {
    int SIZE = 30;
    int[] intArray = new int[SIZE];
    int rear =-1;
    int front=-1;

    public static void main(String arg[]) throws Exception {
        QueueArray queue = new QueueArray();
        queue.enqueue(10);
        System.out.println(queue.peak());
        queue.enqueue(20);
        System.out.println(queue.peak());
        queue.dequeue();
        System.out.println(queue.peak());
        queue.dequeue();
        System.out.println(queue.peak());
        queue.enqueue(30);
        System.out.println(queue.peak());
        queue.dequeue();
        System.out.println(queue.peak());
    }

    private boolean isEmpty(){
        return rear==-1 && front==-1;
    }
    private void enqueue(int item) throws Exception {
        if(rear == SIZE-1){
            System.out.println("The Queue is Empty");
        }
       if(isEmpty()){
           rear = front = 0;
       }else{
           rear = rear+1;
       }
       intArray[rear]= item;
    }

    private void dequeue() throws Exception {
        if(isEmpty()){
            System.out.println("The Queue is Empty");
        }
        if(front == rear){
            front = rear = -1;
        }else{
            rear = rear -1;
        }
    }
    private int peak() throws Exception {
        if(isEmpty()){
            System.out.println("The Queue is Empty");
            return -1;
        }
        return intArray[rear];
    }
}
