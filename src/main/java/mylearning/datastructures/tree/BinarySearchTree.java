package mylearning.datastructures.tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinarySearchTree {


    public static void main(String arg[]){
        BinarySearchTree bst = new BinarySearchTree();
        Node root = null;
        root = bst.insert(root, 10);
        System.out.println("I am root still after insertion of 10 : "+root.data);
        root = bst.insert(root,5);
        System.out.println("I am root still after insertion of 5  : "+root.data);
        root = bst.insert(root,15);
        System.out.println("I am root still after insertion of 15 : "+root.data);
        root = bst.insert(root,8);
        System.out.println("I am root still after insertion of 8  : "+root.data);
        root = bst.insert(root,20);
       // root = bst.insert(root,30);
       // System.out.println("I am root still after insertion of 20 : "+root.data);
        bst.printElementUsingBFSApproach(root);
        System.out.println( "<================ Here is go DFS - PRE ORDER ============>");
        bst.dfsPreOrder(root);
        System.out.println( "\n<================ Here is go DFS - IN ORDER ============>");
        bst.dfsInOrder(root);

        System.out.println("\n<================ ENDS ============>");

        System.out.println("\n<================ Is this a Binary Search Tree ============>");
        bst.isBinarySearchTree(root);
        System.out.println("\n<================ END ============>");

        System.out.println(bst.search(root, 20));
        System.out.println(bst.search(root, 100));

        System.out.println("Minimum value   : "+bst.findMin(root));

        System.out.println("Maximum value   : "+bst.findMax(root));

        System.out.println("Height of a tree" + bst.heightOfaTree(root));
    }

    public boolean search(Node root, int data){
        if(root == null) return false;

        if(root.data == data) return true;

        if(data< root.data){
          //  System.out.println("going Left");
            return (search(root.left, data));
        }else{
           // System.out.println("going right");
           return(search(root.right, data));
        }
    }

    public Node insert (Node root, int data){
    	Node newNode = new Node(data);

    	if(root ==null){
    	    root = newNode;
    	   // System.out.println(data + " New item is created... ");
    	}else{
    		if(data <= root.data ){
            //    System.out.println(data + " is lesser than equal to " + root.data);
                root.left = insert(root.left, data);

    		}else
    		{
            //    System.out.println(data + " is greater than equal to " + root.data);
    			root.right = insert(root.right, data);

    		}
    	}
    	return root;
    }

    public int findMin(Node rootNode){
        if(rootNode == null){
            return -1;
        }
        if(rootNode.left == null){
            return rootNode.data;
        }else{
            return findMin(rootNode.left);
        }
    }

    public int findMax(Node rootNode){
        if(rootNode == null){
            return -1;
        }
        while(rootNode.right != null){
            rootNode = rootNode.right;
        }

        return rootNode.data;
    }

	public static class Node {
		Node left;
		Node right;
		int data;

		Node(int data){
		    this.data = data;
        }
        Node(Node left, Node right, int data){
		    this.left = left;
		    this.right = right;
		    this.data = data;
        }
	}

	public int heightOfaTree(Node rootNode){
        if(rootNode ==null){
            return -1;
        }
        //System.out.println("Hello I am processing node : "+ rootNode.data);
       // System.out.println(heightOfaTree(rootNode.left));
       // return Math.max(heightOfaTree(rootNode.left), heightOfaTree(rootNode.right))+1;

        int leftCount =-1;

        Node temp = new Node(rootNode.left, rootNode.right, rootNode.data);
        while(temp !=null){
            temp = temp.left;
            leftCount ++;
        }
        int rightCount = -1 ;
        while(rootNode!=null ){
            rootNode = rootNode.right;
            rightCount ++;
        }

        return(Math.max(leftCount,rightCount));

    }

    public void printElementUsingBFSApproach(Node root){

        System.out.println( "<================ Here is go BFS ============>");
        if(root == null){
            System.out.println("Nothing to display... ");
        }

        Queue<Node> queue = new ArrayDeque();

        queue.add(root);
        while(!queue.isEmpty()){
            Node topElement = ((ArrayDeque<Node>) queue).getFirst();
                if(topElement.right != null){
                    queue.add(topElement.right);
                }
                if(topElement.left != null){
                    queue.add(topElement.left);
                }

           System.out.print(topElement.data+ " , ");
            queue.remove();

        }
        System.out.println();

    }

    public void  dfsPreOrder(Node root){

        if(root == null ){
            return;
        }
        System.out.print(root.data+ ", ");
        dfsPreOrder(root.left);
        dfsPreOrder(root.right);
    }

    public void  dfsInOrder(Node root){

        if(root == null ){
            return;
        }

        dfsPreOrder(root.left);
        System.out.print(root.data+ ", ");
        dfsPreOrder(root.right);
    }

    public void isBinarySearchTree(Node root){
        if(root == null){
            System.out.println("The Given Tree is final");
        }

        Queue<Node> queue = new ArrayDeque();
        queue.add(root);

        while(root != null){

            if(root.left !=null ) {
                if(root.left.data <= root.data){
                queue.add(root.left);
                }else{
                    System.out.println("No it is not a Binary Search Tree");
                    return;
                }
            }

            if(root.right != null) {
                if(root.right.data > root.data){
                    queue.add(root.right);
                }else{
                    System.out.println("No it is not a Binary Search Tree");
                    return;
                }
            }
            queue.poll();
            root = queue.peek();
        }
        System.out.println("Yes it is a Binary Tree... ");

    }


}