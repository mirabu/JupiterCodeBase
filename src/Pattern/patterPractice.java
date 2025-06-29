package Pattern;

class Master{
    int a;

    Master(){
        a=11;
        System.out.println("const called");
    }

    class masterBody{
        int a=10;
        int b=7;

        void messasge(){
            System.out.println(a+" "+b+" ");
        }

    }
}


public class patterPractice {
    public static void main(String[] args) {


    }
}
