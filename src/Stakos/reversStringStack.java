package Stakos;

import java.util.Scanner;
import java.util.Stack;

public class reversStringStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string : ");
        String data= scanner.nextLine();
        String reversString = reversStackData(data);
        System.out.println(reversString);
    }

    private static String reversStackData(String data) {
        char[] chars = data.toCharArray();
        Stack<Character> characters =new Stack<>();

        for (char charData : chars){
            characters.push(charData);
        }

        //characters.st
        return characters.toString();
    }
}
