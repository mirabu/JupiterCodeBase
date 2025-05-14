package Mathematics;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        while (true) {
            System.out.println("enter your number : ");
            Scanner sc = new Scanner(System.in);
            double num = sc.nextDouble();

            if (num==-1) return ;

            boolean isPrime = isPrimNumber(num);
            System.out.println(isPrime);
        }
    }

    private static boolean isPrimNumber(double num) {

           for (int i = 2; i < Math.sqrt(num); i++) {
               if (num % i == 0) return false;
           }

           return true;

    }
}
