package DSADaysCode;

public class swapWithout {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        System.out.print("before swap");
        System.out.println();
        System.out.print("value of a:"+a+" "+"value of b:"+b);

        a=b+a;
        b=a-b;
        a=a-b;
        System.out.println();
        System.out.print("after swap");
        System.out.println();
        System.out.print("value of a:"+a+" "+"value of b:"+b);
    }
}
