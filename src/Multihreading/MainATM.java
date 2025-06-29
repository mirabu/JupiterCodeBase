package Multihreading;


import javax.sound.midi.Soundbank;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class MainATM {

    public static Semaphore semaphore = new Semaphore(2);



    static class Person extends Thread{
        String name;

        Person(String name){
            this.name=name;
        }
        public void run(){

            try {
                System.out.println(name + " is waiting to access ATM...");
                semaphore.acquire(); // Thread waits if no ATM available

                System.out.println(name + " is using ATM");
                Thread.sleep(2000); // Simulate ATM usage
                System.out.println(name + " is done using ATM");

                semaphore.release(); // Free up an ATM
            } catch (InterruptedException e) {
                System.out.println(name + " was interrupted.");
            }
        }
    }

    public static void main(String[] args) {

        for(int i=0;i<10;i++){
            new Person("Name"+i).start();
        }


    }
}
