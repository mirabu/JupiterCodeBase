package TreeColl;

import java.util.Scanner;



public class BinarySearchTree {
    static Node root;
    static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       BinarySearchTree binarySearchTree=new BinarySearchTree();
        System.out.println("Enter your data:");
        while (true){
            int data=scanner.nextInt();
            if (data==-1) break;
           binarySearchTree.insert(data);
        }

        System.out.println("Inorder traversal :");
        binarySearchTree.inOrderTraversal(root);
    }

    //LDR
    private void inOrderTraversal(Node root) {
        if (root==null)return;
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }

    private void insert(int data) {
        root=createTrueBinaryTree(root,data);
    }

    private Node createTrueBinaryTree(Node root,int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data){
            root.left=createTrueBinaryTree(root.left,data);
        }
        if (data> root.data){
            root.right=createTrueBinaryTree(root.right,data);
        }
        return root;
    }
}
