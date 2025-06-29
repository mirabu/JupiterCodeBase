package Multihreading;

class Invoice implements Runnable{


    @Override
    public synchronized void run() {

            for (int i=0;i<=50;i++){
                System.out.print(i+" ");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }


    }
}


public class DeathLock {
    public static void main(String[] args) throws InterruptedException {
        Invoice invoice = new Invoice();
        Thread thread1=new Thread(invoice);
        thread1.setName("a");
        Thread thread2= new Thread(invoice);
        thread2.setName("b");
        thread1.start();
        thread1.join(5000);
        thread1.isAlive();
        thread2.start();

    }
}
