package mylearning.datastructures.LinkedList;

public class LinkedList {
    Node head = null;

    public static void main(String arg[]) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 5; i++) {
            list.insertAtFirst(i);
        }
        list.print();
    }

    private void print() {
        Node temp = head;
        System.out.println(head.data + " fdfdfd " + head.link);
        while (temp.link != null) {
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

        System.out.println("Item Inserted : " + newNode.data);
    }


    static class Node {
        int data;
        Node link;

        Node() {

        }
    }
}
