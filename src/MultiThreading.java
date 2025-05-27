public class MultiThreading {

  static class printTask implements Runnable{
      private final int start;
      private final int last;

      printTask (int start, int last){
          this.start=start;
          this.last=last;
      }

      @Override
      public void run() {
          for (int i =0;start<=last; i++){
              System.out.println(Thread.currentThread().getName()+" prints : "+i);
          }
      }
  }

    public static void main(String[] args) {

       Thread thread1 =new Thread(new printTask(0,25));
        Thread thread2 =new Thread(new printTask(26,50));
        Thread thread3 =new Thread(new printTask(51,75));
        Thread thread4 =new Thread(new printTask(76,100));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


    }
}
