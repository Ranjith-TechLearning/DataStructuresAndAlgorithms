package mylearning.datastructures.LinkedList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DoublyLinkedList {
    class Node {
        Node prev;
        int data;
        Node next;
    }
    Node head;
    private static final Logger logger = LogManager.getLogger(LinkedList.class);

    public void insertAtHead(int num){
        Node newNode = getNewNode(num);
       if(head == null){
           head = newNode;
           return;
       }
       newNode.next = head;
       head.prev = newNode;
       head = newNode;
    }

    public void insertAtTail(int num){
        Node newNode = getNewNode(num);

        if(head == null){
            head = newNode;
            return;
        }
        if(head.next == null){
            newNode.prev = head;
            head.next = newNode;
            return;
        }
        Node temp = head;
        while(temp.next !=null){
            temp = temp.next;
        }
        newNode.prev = temp;
        temp.next = newNode;

    }

    private Node getNewNode(int num) {
        Node newNode = new Node();
        newNode.prev = null;
        newNode.data = num;
        newNode.next = null;
        return newNode;
    }

    public void display(){
        if(head == null ){
            return ;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " , ");

            temp = temp.next;
        }
        System.out.println();
    }
    private void reversePrint() {
        if(head == null){
            return;
        }
        Node temp = head;
        //traverse to the last node;
        while (temp.next != null){
            temp = temp.next;
        }
        while(temp != null){
            System.out.print(temp.data + " , ");
            temp = temp.prev;
        }

    }

    public static void main (String arg[]){
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertAtTail(10);
        doublyLinkedList.insertAtTail(20);
        doublyLinkedList.insertAtTail(30);
        doublyLinkedList.insertAtTail(40);
        logger.info("Display after add elements... ");
        doublyLinkedList.display();
        doublyLinkedList.insertAtHead(200);
        doublyLinkedList.insertAtHead(100);
        logger.info("Display after add elements added to head... ");
        doublyLinkedList.display();
        doublyLinkedList.reversePrint();
        logger.info("display after elements reversed");
        //doublyLinkedList.display();

    }
}
