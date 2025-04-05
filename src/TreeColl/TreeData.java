package TreeColl;


import java.util.Date;
import java.util.Scanner;

public class TreeData {
    Node root;
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        TreeData tree=new TreeData();
        Node root=creatTree();


        System.out.println("InOrder :");
        inOrder(root);
        System.out.println("PreOrder :");
       // PreOrder(root);
        System.out.println("PostOrder :");
       // PostOrder(root);



    }
   //LDR
    private static void inOrder(Node root) {
       if (root==null) return ;
       inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    private static Node creatTree() {
     Node root=null;
        System.out.println("Enter data:");
        int data=sc.nextInt();

        if (data==-1) return null;

        root=new Node(data);
        System.out.println("Enter data into left:"+ data);
        root.left=creatTree();

        System.out.println("Enter data into right:"+data);
        root.right=creatTree();

        return root;
    }
}
