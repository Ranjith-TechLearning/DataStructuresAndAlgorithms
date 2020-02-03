package mylearning.problems.LinkedList;

public class AddTwoNumbers {

public static void main(String arg[]){
    ListNode node1 = new ListNode(2);
    ListNode node2=  new ListNode(4);
    node1.next = node2;
    ListNode node3 = new ListNode(3);
    node2.next = node3;

    ListNode node4 = new ListNode(5);
    ListNode node5=  new ListNode(6);
    node4.next = node5;
    ListNode node6 = new ListNode(4);
    node6.next = node5;

    Solution sol = new Solution();
    sol.addTwoNumbers(node1, node4);

}

}
/**
 * Definition for singly-linked list. */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }



class Solution {

    /*

    * */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null){
            return null;
        }
        if(l2== null) {
            return null;
        }

        ListNode headNode = new ListNode(0);

        ListNode currentNodePointer = headNode;

        int carryForward = 0 ;

        while (l1 != null || l2!=null){

            if(l1!=null){
                carryForward = carryForward+ l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carryForward = carryForward + l2.val;
                l2 = l2.next;
            }

            carryForward = carryForward /10 ;

            ListNode newNode = new ListNode(carryForward % 10 );

            currentNodePointer.next = newNode ;
            currentNodePointer = currentNodePointer.next;

        }
        return headNode.next;

    }
}