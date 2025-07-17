package Multihreading;

class InvoicePrinter implements Runnable{

    Printer printer;

    InvoicePrinter(Printer printer){
        this.printer=printer;
    }

    @Override
    public void run() {
      printer.printDetails();
    }
}


public class MainTask {
    public static void main(String[] args) throws InterruptedException {

        Printer printer=new Printer();
        Thread thread1= new Thread(new InvoicePrinter(printer),"first");
        Thread thread2= new Thread(new InvoicePrinter(printer), "second" );
        thread1.start();
        thread2.start();
        thread1.join(10000);
        thread1.isAlive();


    }
}
