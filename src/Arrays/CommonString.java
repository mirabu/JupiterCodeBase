package Arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class CommonString {
    public static void main(String[] args) {

        String mama = "harshal";
        String mami = "snehal";
        Set<Character> set = new HashSet<>();
        Stack<Character> stack=new Stack<>();

        for (char ma : mama.toCharArray()){
            set.add(ma);
            stack.push(ma);
        }

        Set<Character> common = new HashSet<>();
        Stack<Character> commonWord = new Stack<>();
        for(char c : mami.toCharArray()){

            if(set.contains(c)){
                common.add(c);
                commonWord.push(c);
            }

        }

        System.out.println("set :");
        System.out.println("common word in mama-mami :"+common);
        System.out.println();
        System.out.println("*********");
        System.out.println("stack : ");
        System.out.println("common in stack way :"+commonWord);


    }
}
