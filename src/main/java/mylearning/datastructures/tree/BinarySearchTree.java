package mylearning.datastructures.tree;


import java.util.*;

public class BinarySearchTree {
    Node rootNode = null;
    class Node {
        Node left ;
        Node right;
        int data;
        Node(int data){
            this.data = data;
        }
    }
    private Node getNewNode(int data){
        return new Node(data);
    }

    private Node insert(Node rootNode, int data){
        if(rootNode == null){
            rootNode = getNewNode(data);
            System.out.println(data);
            return rootNode;
        }
        if(rootNode.data > data){
            rootNode.left = insert(rootNode.left, data);
        }else if(rootNode.data < data){
            rootNode.right = insert(rootNode.right, data);
        }
        return rootNode;
    }

    public Node insertIterativeApproach(Node node, int data){
        if(node == null){
            node = getNewNode(data);
            return node;
        }
        Node tempNode = node;
        while(tempNode!=null){
            if(tempNode.data > data){
                tempNode = tempNode.left;
            }else if(tempNode.data < data){
                tempNode = tempNode.right;
            }
        }
        tempNode = getNewNode(data);
        return rootNode;
    }
    public int findMin(Node rootNode){
        int min = 0;
        if(rootNode == null){
            return -1;
        }
        if(rootNode.left == null){
            return rootNode.data;
        }
        if(rootNode.left !=null){
            min = findMin(rootNode.left);
        }
        return min;
    }
    public int findMax(Node rootNode){
        int max = -1;
        if(rootNode == null){
            return max;
        }
        if(rootNode.right == null){
            return rootNode.data;
        }
        if(rootNode.right !=null){
            max = findMax(rootNode.right);
        }

        return max;
    }
    public int findHeight(Node rootNode){
        int height = 0;
        if(rootNode==null){
            return 0;
        }
        height = Math.max(findHeight(rootNode.left), findHeight(rootNode.right)) + 1;

        return height;
    }
    public void levelOrderTraversal(Node root){
        System.out.println("Here is the Level Order traversal");
        if(root ==null ){
            return;
        }
        Deque<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node tempNode = queue.poll();
            System.out.print(","+tempNode.data);
            if(tempNode.left !=null) queue.add(tempNode.left);
            if(tempNode.right !=null) queue.add(tempNode.right);
        }
        System.out.println("=========End of Level order Traversal==============");
    }
    public void preOrder(Node node){
        System.out.println("I am going to print in PreOrder Mode");
        Stack<Node>  helperStack = new Stack<>();
        if(node==null){
            System.out.println("Root is null buddy");
            return;
        }
        helperStack.push(rootNode);
        while(!helperStack.isEmpty()){
            Node topNode = helperStack.pop();
            System.out.println(topNode.data);

            if(topNode.right !=null){
                helperStack.push(topNode.right);
            }
            if(topNode.left!=null){
                helperStack.push(topNode.left);
            }

        }
        System.out.println("=========End of Pre order Traversal==============");
    }
    public void preOrder_Recursive(Node rootNode){
        if(rootNode == null){
            return;
        }
        System.out.println(rootNode.data);
        preOrder_Recursive(rootNode.left);
        preOrder_Recursive(rootNode.right);
    }
    public void inOrder_Recursive(Node rootNode){
        if(rootNode == null){
            return;
        }
        inOrder_Recursive(rootNode.left);
        System.out.println(rootNode.data);
        inOrder_Recursive(rootNode.right);
    }
    public void postOrder_Recursive(Node rootNode){
        if(rootNode == null){
            return;
        }
        postOrder_Recursive(rootNode.left);
        postOrder_Recursive(rootNode.right);
        System.out.println(rootNode.data);
    }

    public static void main(String arg[]){
        
        int[] array = {15, 9, 14, 8, 3, 2, 1, 18, 19, 17};
        //int[] array = {15, 5, 15};
        BinarySearchTree bst = new BinarySearchTree();
        for(int i : array){
            bst.rootNode = bst.insert(bst.rootNode, i);
        }
        System.out.println("Min element of the tree is : "+bst.findMin(bst.rootNode));
        System.out.println("Max elemtn of the tree is :  "+bst.findMax(bst.rootNode));
        System.out.println("Height of the tree is :  "+bst.findHeight(bst.rootNode));
        bst.levelOrderTraversal(bst.rootNode);
        bst.preOrder(bst.rootNode);
        bst.preOrder_Recursive(bst.rootNode);
        System.out.println("I am going to print in InOrder Mode");
        bst.inOrder_Recursive(bst.rootNode);
        System.out.println("I am going to print in InOrder Mode-- ends..");
        System.out.println("I am going to print in PostOrder Mode");
        bst.postOrder_Recursive(bst.rootNode);
        System.out.println("I am going to print in PostOrder Mode-- ends..");
        int a = array.length;
    }
}
