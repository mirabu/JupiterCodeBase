package Multihreading;

public class Printer {

    public synchronized void printDetails(){
        for (int i=1;i<=40;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(300);

            }catch (Exception exception){

            }
        }
    }
}

