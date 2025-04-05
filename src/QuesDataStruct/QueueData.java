package QuesDataStruct;

class QueueStack{
    int capacity;
    int[] qArray;
    int front,rear;

    QueueStack(int  capacity){
        this.capacity=capacity;
        this.qArray=new int[capacity];
        this.front=-1;
        this.rear=-1;
    }


    boolean isFull(){
        if(front==0 && rear==capacity-1){
            return true;
        }
        return false;
    }

    boolean isEmpty(){
        if(front==-1 && rear==-1){
            return true;
        }
        return false;
    }

    void enQueue(int data){

        if (isFull()){
            System.out.println("Queue is full.....please wait for new queue");
        }else{

            if (front==-1){front=0;}
            ++rear;
            qArray[rear]=data;
        }
    }


    int deQueue(){
        return qArray[rear--];
    }

    void displayQueue(){
        for (int i=front;i<=rear;i++){
            System.out.print(qArray[i]+" ");
        }
    }


}




public class QueueData {
    public static void main(String[] args) {
    QueueStack queueStack=new QueueStack(5);
    queueStack.enQueue(10);
    queueStack.enQueue(20);
    queueStack.enQueue(30);
    queueStack.enQueue(40);
    queueStack.displayQueue();
        System.out.println("After deQueue");
        queueStack.deQueue();
        queueStack.displayQueue();

    }
}
