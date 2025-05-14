package Mathematics;

public class Swapping {
    public static void main(String[] args) {
        int a=10;
        int b=40;

        System.out.println("before swap : "+a+" "+b);
        swapNumbersWithoutUsingThirdVariables(a,b);


    }

      //a=a+b;
      //b=a-b;
      //a=b-a;
    private static void swapNumbersWithoutUsingThirdVariables(int first, int second) {
        first= first+second;
        second=first-second;
        first=first-second;

        System.out.println("after swap : "+first+" "+second);


    }
}
