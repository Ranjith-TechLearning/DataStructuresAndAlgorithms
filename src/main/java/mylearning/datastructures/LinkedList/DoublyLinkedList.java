package mylearning.datastructures.LinkedList;

public class DoublyLinkedList {

    public static void main(String arg[]){
        System.out.println("++++++++++++++ADDED AT TAIL +++++++++++++++++++++++");
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertAtTail(4);
        doublyLinkedList.insertAtTail(5);
        doublyLinkedList.insertAtTail(6);
        doublyLinkedList.insertAtTail(8);
        doublyLinkedList.insertAtTail(10);
        doublyLinkedList.print();
        System.out.println("+++++++++++++++ADDED AT HEAD++++++++++++++++++++++");
        DoublyLinkedList listToAddAtHead = new DoublyLinkedList();
        listToAddAtHead.insertAtHead(4);
        listToAddAtHead.insertAtHead(5);
        listToAddAtHead.insertAtHead(6);
        listToAddAtHead.insertAtHead(8);
        listToAddAtHead.insertAtHead(10);
        listToAddAtHead.print();
    }

    Node head;

    public void insertAtTail(int data){

        Node newNode = new Node();
        newNode.data= data;
        newNode.next = null;
        newNode.previous= null;

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp!=null){
            if(temp.next == null){
                newNode.previous = temp;
                temp.next = newNode;
                return;
            }else{
                temp = temp.next;
            }
        }

    }

    public void insertAtHead(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.previous = null;
        newNode.next = null;

        if(head == null){
            head = newNode;
            return;
        }

        head.previous = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void print(){

        Node temp = head;
        while(temp !=null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public void reversePrint(){

    }


    public static  class Node {
        int data;
        Node next;
        Node previous;
    }



}
