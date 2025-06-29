package Multihreading;

import java.util.concurrent.locks.ReentrantLock;

class ProcessDate implements Runnable{
    private final ReentrantLock lock=new ReentrantLock();

    @Override
    public void run() {
        lock.lock();

        try {
            for (int i=0;i<=30;i++){
                System.out.print(i+ " ");

                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }finally{
            lock.unlock();
        }



    }
}



public class LockData {
    public static void main(String[] args) throws InterruptedException {
        ProcessDate processDate=new ProcessDate();

        Thread thread1= new Thread(processDate);
        thread1.setName("firstDate");

        Thread thread2=new Thread(processDate);
        thread2.setName("secDate");

        thread1.start();
        thread1.join(10000);
        System.out.print("Threa is still alive ? "+thread1.isAlive());
        thread2.start();

    }
}
