package Multihreading;

class Invoice implements Runnable {
    @Override
    public synchronized void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread " + threadName + " entered run()");
        for (int i = 0; i <= 15; i++) {
            System.out.print(threadName + ":" + i + " ");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("\nThread " + threadName + " exiting run()");
    }
}

public class DeathLock {
    public static void main(String[] args) throws InterruptedException {
        Invoice invoice = new Invoice();
        Thread thread1 = new Thread(invoice);
        thread1.setName("A");

        Thread thread2 = new Thread(invoice);
        thread2.setName("B");

        thread1.start();
        System.out.println("Main thread waiting for A to finish (max 5 seconds)");
        thread1.join(5000);  // wait 5 seconds max (not 50 seconds)
        System.out.println("Is thread A still alive? " + thread1.isAlive());

        thread2.start();
    }
}
