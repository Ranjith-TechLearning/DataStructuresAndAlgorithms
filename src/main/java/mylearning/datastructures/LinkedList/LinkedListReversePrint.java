package mylearning.datastructures.LinkedList;

public class LinkedListReversePrint {


    public void print(LinkedList.Node next){

        if(next == null){
            return;
        }
            print(next.link);
            System.out.println(next.data);

    }


    public static void main(String arg[]){
        LinkedListReversePrint reversePrint = new LinkedListReversePrint();
        LinkedList list = new LinkedList();
        list.addAt(1,1);
        list.addAt(2,2);
        list.addAt(3,3);
        list.addAt(4,4);
        list.addAt(5,5);
        reversePrint.print(list.head);


    }
}
