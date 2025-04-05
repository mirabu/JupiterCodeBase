package Stakos;

class StackData{

    int capacity;
    int[] stackArray;
    int top;

    StackData(int capacity){
        this.capacity=capacity;
        stackArray=new int[capacity];
        this.top=-1;
    }

    boolean isEmpty(){
        return (top==-1);
    }

    boolean isFull(){
        return (top==capacity-1);
    }

    void push(int data){
        if (isFull()){
            System.out.println("stack is full.......");
        }else{
            stackArray[++top]=data;

        }
    }

     int pop(){
        if (isEmpty()) System.out.println("already empty, you can't pop ...... ");
        return stackArray[top--];
    }

    int peek(){
       return stackArray[top];
    }

    public void displayStack() {
        for(int i=top;i>=0;i--){
            System.out.print(stackArray[i]+" ");
        }
    }
}




public class StackDataImpl {
    public static void main(String[] args) {
        StackData stackData=new StackData(10);
        stackData.push(21);
        stackData.push(22);
        stackData.push(23);
        stackData.push(24);
        stackData.push(25);
        stackData.displayStack();
        System.out.println();
        System.out.println("peek element is :"+stackData.peek());
        System.out.println();
        System.out.println("After pop :");
        stackData.pop();
        stackData.displayStack();
        System.out.println();
        System.out.println("peek element is :"+stackData.peek());
    }
}
