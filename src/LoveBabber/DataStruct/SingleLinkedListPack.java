package LoveBabber.DataStruct;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class SingleLinkedListPack {
    Node head;
    public static void main(String[] args) {
        SingleLinkedListPack listPack=new SingleLinkedListPack();

        //reverseLinkedList
        //mergeTwoLinkedList
        //searchingInList
        //intersection
        listPack.insertFront(4);
        listPack.insertFront(5);
        listPack.insertFront(2);
        listPack.insertFront(7);
        listPack.insertFront(9);
        System.out.println("Befor sort the list :");
        listPack.printLinkedList();
        System.out.println();
        System.out.println("After sort of the list :");
        listPack.sortList();
        listPack.printLinkedList();



    }

    private void sortList() {
        Node current=head;
        Node index=null;
        int temp;

        if(head ==null){
            return;
        }else{

            while (current !=null){
                index=current.next;

                while (index !=null){
                    if (current.data > index.data){

                        temp=current.data;
                        current.data=index.data;
                        index.data=temp;
                    }
                    index=index.next;
                }
                current=current.next;
            }
        }

    }

    private void printLinkedList() {
        Node current=head;
        while (current != null){
            System.out.print(current.data+"-> ");
            current=current.next;
        }
    }

    private void insertFront(int data) {
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }
}
