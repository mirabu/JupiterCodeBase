package Multihreading;

class ClassRoom{


    synchronized void studentDetails(){
        System.out.println("student waiting for homework...");
        try{
            wait(5000);
        }catch (Exception e){

        }
        System.out.println("student got homework!");

    }

    synchronized void masterStudentDetails(){
        System.out.println("master student waiting for homework...");
        try{
            wait(5000);
        }catch (Exception e){

        }
        System.out.println("master student got homework!");

    }

    synchronized void teacherDetails(){
        System.out.println("Teacher is preparing Homework.....");
        try{
            Thread.sleep(5000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("teacher is give the homework...");
        notifyAll();
    }


}


public class SimpleWaitNotify {
    public static void main(String[] args) throws InterruptedException {
      ClassRoom classRoom=new ClassRoom();



//      you can make it like too
//          Runnable studentDetailsRun = ()-> classRoom.studentDetails();
//          or
//          Runnable studentDetailsRun = classRoom::studentDetails;
//          and pass it thread
//          Thread student =new Thread(studentDetailsRun);
//
//
//

      Thread student= new Thread( classRoom::studentDetails );
        Thread teacher= new Thread( classRoom::teacherDetails);
        Thread masterStud= new Thread( classRoom::masterStudentDetails);

        student.start();
        masterStud.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        teacher.start();





    }
}
