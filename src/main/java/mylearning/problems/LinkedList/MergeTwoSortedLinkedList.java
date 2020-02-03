package mylearning.problems.LinkedList;

public class MergeTwoSortedLinkedList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode header = new ListNode(0);
        // if(l1 == null && l1 == null)
        //   return new int[0];
        ListNode currentPointer = header;

        while(l1!=null || l1!=null){

            if(l1!=null){
                ListNode newNode= new ListNode (l1.val);
                currentPointer.next = newNode;
                currentPointer = currentPointer.next;
                l1 = l1.next;
            }
            if(l2!=null){
                ListNode newNode= new ListNode (l2.val);
                currentPointer.next = newNode;
                currentPointer = currentPointer.next;
                l2 = l2.next;
            }


        }
        return header.next;


    }
}

