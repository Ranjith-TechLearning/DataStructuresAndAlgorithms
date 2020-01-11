package mylearning.datastructures.Queue;

class QueueUsingArray {
    private final int[] queue ;
    int rear = -1;
    int front = -1;

    QueueUsingArray(int size){
        queue = new int[size];
    }
    public void enqueue(int element){
        if(isEmpty()){
            front ++ ;
        }
        rear ++;
        queue[rear] = element;

        //handle overflow case...
    }
    public void dqueue(){
        System.out.println("Element Removed... : "+ queue[front]);
        front ++ ;
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
        QueueUsingArray queue = new QueueUsingArray(10);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.print();
        queue.front();
        queue.dqueue();
        queue.front();
        queue.print();



    }

}
