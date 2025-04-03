package Arrays;

import java.util.Scanner;

public class HackerRank {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double val = scan.nextDouble();
        String sentence = scan.nextLine();
        scan.close();



        System.out.println("String: " + sentence.toString());
        System.out.println("Double: " + val);
        System.out.println("Int: " + i );
    }
}