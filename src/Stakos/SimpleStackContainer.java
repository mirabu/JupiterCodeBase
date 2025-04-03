package Stakos;

class Stack{
    int capacity;
    int top;
    int arr[];

    Stack(int size){
        arr=new int[size];
        top=-1;
        capacity =size;
    }

    public boolean isFull(){
        return top==capacity-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public void push(int data) {
        if (isFull()) System.out.println("Stack is full");

        System.out.println("Inserting :"+data);
        arr[++top]=data;

    }

    public void printStackos() {
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

    public int pop() {
        if (isEmpty()) System.out.println("stack is empty");
        return arr[top--];
    }

    public int peek(){
        return arr[top];
    }
}



public class SimpleStackContainer {
    public static void main(String[] args) {
        Stack stack= new Stack(10);

        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);
        stack.push(10);
        stack.push(11);
        System.out.println("After pushing :");
        stack.printStackos();
        System.out.println();
        stack.pop();
        System.out.println("After pop :");
        stack.printStackos();
        System.out.println();
        System.out.println("This is top element: "+stack.peek());

    }
}
