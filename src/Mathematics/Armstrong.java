package Mathematics;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("enter your number : ");
        Scanner sc =new Scanner(System.in);
        double num=sc.nextDouble();
        double armstrong = getArmestrong((int) num);
        System.out.println("Armestrong Number is : "+armstrong);
    }

    private static double getArmestrong(int num) {

        double sum=0;
        double power = String.valueOf(num).length();
        while (num>0){
            int digit =num%10;
            sum=sum+Math.pow(digit,power);
            num=num/10;

        }
        return sum;
    }
}
