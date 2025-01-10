package String;

import java.util.HashSet;
import java.util.Stack;

public class StringPanagram {
    public static void main(String[] args) {

        char[] alphabet = {
                'a', 'b', 'c', 'd', 'e',
                'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o',
                'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y',
                'z'
        };

        String panama1 = "The quick brown fox jumps over the lazy dog";
        String panama2 = "A big box of mixed nuts jumps quickly over the lazy dog";
        String modPanama1 = panama1.replace(" ","").toLowerCase();
        String modPanama2 = panama2.replace(" ","").toLowerCase();

        char[] charsPanama1 = modPanama1.toCharArray();
        char[] charsPanama2 = modPanama2.toCharArray();

        Stack<Character> stack=new Stack<>();
        System.out.println("Before set");
        for (char ch : charsPanama1){
            stack.add(ch);
        }
        System.out.println(stack);
        System.out.println();

        HashSet<Character> characterStack = new HashSet<>();
        for (char ch : charsPanama1){
            characterStack.add(ch);
        }
        System.out.println(characterStack);
        System.out.println(characterStack.size());


        System.out.print("****************************");
        System.out.println();
        System.out.print("Panama2");
        System.out.println();
        System.out.print("****************************");
        System.out.println();


        Stack<Character> stack1=new Stack<>();
        System.out.println("Before set");
        for (char ch : charsPanama2){
            stack1.add(ch);
        }
        System.out.println(stack1);
        System.out.println();

        
        HashSet<Character> hashSet =new HashSet<>();
        for (char ch : charsPanama1){
            hashSet.add(ch);
        }
        System.out.println(hashSet);
        System.out.println(hashSet.size());



    }
}
