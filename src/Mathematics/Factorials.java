package Mathematics;

public class Factorials {
    public static void main(String[] args) {

        int number =5;
        int fact =factorialNumber(number);
        System.out.println("factorials is : "+fact);

    }

    private static int factorialNumber(int number) {

        if(number==0) return 0;

        if (number==1) return 1;

        if (number>1) return number* factorialNumber(number-1);

        return number;
    }
}
