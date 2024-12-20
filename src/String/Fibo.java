package String;

public class Fibo {
    public static void main(String[] args) {
        int number = 5;
        printFibo(number);
    }

    private static void printFibo(int number) {
        int a=0;int b=1;
        if (number<=0) System.out.println("enter the greater than 0");
        if (number >= 1) System.out.println(" ");
        if (number >=2) System.out.println( " ");

        for (int i=3;i<=number;i++){
            int next= a+b;
            System.out.println(next +" ");
            a=b;
            b=next;
        }
    }
}
