package mylearning.datastructures.LinkedList;

public class LinkedList {
    Node head = null;

    public static void main(String arg[]) {
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
    }

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


    static class Node {
        int data;
        Node link;

        Node() {

        }
    }
}
