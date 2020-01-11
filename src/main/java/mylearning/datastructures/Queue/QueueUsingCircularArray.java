package mylearning.datastructures.Queue;

public class QueueUsingCircularArray {
    private final int[] queue ;
    int rear = -1;
    int front = -1;
    int SIZE = 0;

    QueueUsingCircularArray(int size){
        queue = new int[size];
        SIZE = size;
    }
    public void enqueue(int element){
        if(isEmpty()){
            front ++ ;
        }
        rear = (rear+1) % SIZE;
        if(rear == front){
            dqueue();
        }
        queue[rear] = element;

        //handle overflow case...
    }
    public void dqueue(){
        System.out.println("Element Removed... : "+ queue[front]);
        front = (front+1)%SIZE ;
    }
    public boolean isEmpty(){
        return(rear == -1 && front ==-1);
    }

    public int front(){
        System.out.println("Front in the element : "+ queue[front]);
        return queue[front];
    }

    public void print(){
        System.out.println("Total Elements : ====> ");
        for(int i = front; i<rear ; i++){
            System.out.println(queue[i]);
        }
    }
    public static void main(String arg[]){
        QueueUsingCircularArray queue = new QueueUsingCircularArray(10);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(12);
        queue.front();


    }
}
