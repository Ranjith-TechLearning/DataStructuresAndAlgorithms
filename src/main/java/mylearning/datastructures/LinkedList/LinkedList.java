package mylearning.datastructures.LinkedList;

public class LinkedList {
    Node head = null;

   /* public static void main(String arg[]) throws Exception{

        LinkedList list = new LinkedList();
        System.out.println(list.head != null ? list.head.data : "Head is Empty on List");
        for (int i = 0; i < 5; i++) {
            list.insertAtFirst(i);
        }
        list.print();

        LinkedList list1 = new LinkedList();

        System.out.println(list1.head != null ? list1.head.data : "Head is Empty on List1");

        for (int i = 0; i < 5; i++) {
            list1.addAtLast(i);

        }
        list1.print();
        list1.reverseUsingIterativeApparoch();
        list1.print();
        System.out.println(list1.head);

        *//*list1.print();

        LinkedList listAddAtPosition = new LinkedList();
        listAddAtPosition.addAt(1, 2);
        listAddAtPosition.addAt(2, 3);

        listAddAtPosition.addAt(3,4);
        listAddAtPosition.addAt(2,10);
        listAddAtPosition.print();

        listAddAtPosition.delete(1);
        listAddAtPosition.print();
        listAddAtPosition.delete(2);
        listAddAtPosition.print();
        listAddAtPosition.delete(1);
        listAddAtPosition.print();*//*
    }
*/
    private void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.link;
        }
    }

    private void insertAtFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.link = null;

        if (head == null) {
            head = newNode;
        } else {
            newNode.link = head;
            head = newNode;
        }

        System.out.println("Item inserted at First : " + newNode.data);
    }

    private void addAtLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.link = null;


        if (head == null) {
            head = newNode;
            System.out.println("Item inserted at Last : " + newNode.data);
            return;
        }
        Node temp = head;

        while (temp.link != null) {
            temp = temp.link;
        }

        temp.link = newNode;

        System.out.println("Item inserted at Last : " + newNode.data);
    }


    public void addAt(int position, int data){
        Node newNode = new Node();
        newNode.data=data;
        newNode.link=null;

        //when Head is is null
        if(position ==1){
            if(head == null) {
                head = newNode;
            }else{
                newNode.link = head;
                head = newNode;
            }
            return;
        }

        //traverse through linkedList to insert
        Node temp = head;
        for(int i =1 ; i<= position-2; i++){
            temp = temp.link;
        }
        if(temp.link != null) {
            Node temp1 = temp.link;
            newNode.link = temp1;
            temp.link = newNode;

        }else{
            temp.link = newNode;
        }
    }

    public void delete(int position){

        if(head == null){
            System.out.println(" The Linked list is empty... Nothing to delete");
            return;
        }
        if(position ==1 ){
            Node temp = head;
            if(temp.link ==null){
                head = null;
            }else{
                head = temp.link;
            }
        }else{
            //go to n-1 th position..
            Node temp = head;
            for(int i=0; i<=position-2; i++){
                temp = temp.link;
            }
            Node temp1 = temp.link;
            if(temp1 !=null){
                temp.link = temp1.link;
            }else{
                System.out.println("No Element in the Nth position... ");
            }

        }
    }

    private void reverseUsingIterativeApparoch(){

        Node current= null;
        Node previous=null;
        Node next = null;

        current = head;

        while(current !=null){
           next = current.link;
           current.link = previous; // break the link or relink
            previous = current;
            current = next;
        }
        head= previous;

    }

    static class Node {
        int data;
        Node link;

        Node() {

        }
    }
}
