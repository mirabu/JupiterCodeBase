package LinkedListData;


import java.util.Stack;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}


public class SingleLinkedList {
    Node head;
    public static void main(String[] args) {
       SingleLinkedList linkedList=new SingleLinkedList();
       linkedList.inFront(10);
       linkedList.inFront(20);
       linkedList.inFront(30);
       linkedList.inFront(40);
       linkedList.inLast(100);
       linkedList.inLast(200);
       linkedList.inLast(300);
       linkedList.inLast(400);
       linkedList.inLast(500);
       linkedList.displayList();
       linkedList.deletFront();
        System.out.println();
        System.out.print("*****************");
        System.out.println();
        linkedList.displayList();
        linkedList.deletLast();
        System.out.println();
        System.out.println("ReverseList: ");
       linkedList.reverseList();
       // linkedList.printReverse(linkedList.head);
        linkedList.atPosition(12030,4);
        linkedList.displayList();
       // System.out.println(linkedList.reversedLink(linkedList.head));

    }

    private Node reversedLink(Node head) {
        Node current=head;
        Node prev=null;

        while (current!=null){
            Node temp =current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        return prev;
    }



    private void reverseList() {
        Stack<Integer> stack=new Stack<>();
        Node current=head;
        while (current!=null){
            stack.push(current.data);
            current=current.next;
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop()+"<-");

        }
        System.out.println("null");
    }

    private void atPosition(int data, int pos) {
        Node current=head;
        Node newNode= new Node(data);
        int count=0;



        while (current !=null && count<pos-1){
            current=current.next;
            count++;
        }

        newNode.next=current.next;
        current.next=newNode;

    }

    private void deletLast() {


        if (head==null){
            System.out.println("No head found....");
        }

        if (head.next==null){
            head=null;
            return;
        }

        Node current=head;
        while (current.next.next !=null){
            current=current.next;
        }
        current.next=null;
    }

    private void deletFront() {
        if(head == null){
            System.out.println("No data there....");
            return;
        }
        head=head.next;

    }

    private void inLast(int data) {
        Node newNode=new Node(data);
        while (head == null){
            head=newNode;
        }

        Node current=head;
        while(current.next !=null){
           current=current.next;
        }

        current.next=newNode;
    }

    private void displayList() {
        Node current=head;
        while(current != null){
            System.out.print("<-"+ current.data);
            current=current.next;
        }

    }

    private void inFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }




}
