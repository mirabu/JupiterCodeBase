package Multihreading;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class FunctionOne extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("FunctionOne - data: " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

class FunctionTwo implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("FunctionTwo - data: " + i);
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class SimpleThread {

    public static void main(String[] args) {

        FunctionOne one = new FunctionOne();
        FunctionTwo two = new FunctionTwo();
 Thread thread=new Thread(two);

        one.start();
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main - data: " + i);
        }

    }
}
