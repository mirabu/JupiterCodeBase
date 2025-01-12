package Stakos;

import java.util.Scanner;
import java.util.Stack;

public class validParanthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter brackets : ");
        String paranThesisData = scanner.nextLine();

        boolean isValidParanThesis = validParanthesisChecker(paranThesisData);
        System.out.println(isValidParanThesis);
    }

    private static boolean validParanthesisChecker(String paranThesisData) {
        char[] chars = paranThesisData.toCharArray();

        Stack<Character> characterStack =new Stack<>();

        for (char charsData : chars){
            if ( charsData=='(' || charsData=='{'){
                characterStack.push(charsData);
            } else if (charsData==')' || charsData=='}') {
                if (characterStack.isEmpty()) return false;
                characterStack.pop();

            }


        }


       return characterStack.isEmpty();
     }
}
