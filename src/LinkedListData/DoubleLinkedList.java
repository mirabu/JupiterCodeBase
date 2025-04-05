package LinkedListData;

public class DoubleLinkedList {
    static DoubleNode head;
    public static void main(String[] args) {
        DoubleLinkedList linkedList=new DoubleLinkedList();
        System.out.println("Front data : ");
        linkedList.insertDataFront(50);
        linkedList.insertDataFront(49);
        linkedList.insertDataFront(48);
        linkedList.displayList();
        System.out.println("Last Data:");
        linkedList.insertAtLast(51);
        linkedList.insertAtLast(52);
        System.out.println("Normal Display :");
        linkedList.displayList();
        System.out.println();
        System.out.println("Next statement Display:");
        linkedList.displayListWithNextStatment();
        System.out.println("Reverse List:");
        linkedList.displayReverseList();
    }

    private void displayReverseList() {
        DoubleNode temp=head;
        while(temp.next!=null){
          //  temp=temp.next;
        }


        while(temp !=null){
            System.out.print(temp.data+"->");
            temp=temp.prev;
        }

    }

    private void displayListWithNextStatment() {
        DoubleNode current=head;

        while(current.next!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
    }

    private void insertDataFront(int data) {
         DoubleNode newNode=new DoubleNode(data);

         if (head==null){
             head=newNode;
             return;
         }

         head.prev=newNode;
         newNode.next=head;
         head=newNode;

    }
    void displayList(){
        DoubleNode current=head;

        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
    }
    void insertAtLast(int data){
        DoubleNode newNode=new DoubleNode(data);
        DoubleNode current=head;

        while (current.next!=null){
            current=current.next;
        }

        current.next=newNode;
        newNode.prev=current;

    }


}
