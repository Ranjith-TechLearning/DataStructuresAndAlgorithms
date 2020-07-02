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
        logger.info(String.format("New Elementis added %s", newData.data));

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

    public static void main(String arg[]){
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(10);
        linkedList.insert(15);
        linkedList.display();
    }

}
