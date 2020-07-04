package mylearning.datastructures.LinkedList;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LinkedList {
    class Node {
        int data;
        Node link;
    }

    Node head = null;
    private static final Logger logger = LogManager.getLogger(LinkedList.class);


    public void insert(int number){
        Node newData = new Node();
        newData.data = number;
        newData.link = null;
       // logger.info(String.format("New Elements added %s", newData.data));

        if(head == null){
            head  = newData;
            return;
        }
        if(head.link == null){
            head.link = newData;
            return;
        }

        Node temp = head.link;
        while(temp.link != null ){
            temp = temp.link;
        }
        temp.link = newData;

    }
    public void display(){
        if(head == null){
            logger.info("No elements found");
            return;
        }
        Node temp = head;

        while(temp !=null){
            logger.info(String.format("Data is at : %d", temp.data));
            temp = temp.link;
        }
    }

    public void insertAtFirst(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(head == null){
            head = newNode;
            return;
        }
        newNode.link= head;
        head = newNode;
    }
    public void insertAt(int data, int position){
        Node newNode = new Node();
        newNode.data = data;
        if(position ==1 ){
            newNode.link = head;
            head = newNode;
            return;
        }
        Node prev = head;
       // Node next = head;
        for(int i=1; i<position-1; i++ ){
            prev = prev.link;
           // next = next.link;
        }
        newNode.link = prev.link;
        prev.link = newNode;

    }

    public void deleteAt(int position){
        if(position == 1){
            head = head.link;
            return;
        }
        Node prev = head;
        for(int i=1 ; i< position-1 ; i++){
            prev = prev.link;
        }
        Node nodeAtN = prev.link;
        prev.link = nodeAtN.link;
    }

    public static void main(String arg[]){
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(10);
        linkedList.insert(15);
        linkedList.insertAtFirst(30);
        linkedList.insertAt(100,1);
        linkedList.insertAt(200, 2);
        linkedList.insertAt(500, 5);
        linkedList.deleteAt(2);
        linkedList.display();
    }

}
