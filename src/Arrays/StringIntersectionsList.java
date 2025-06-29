package Arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Stack;

public class StringIntersectionsList {
    public static void main(String[] args) {
        String mama = "harshal";
        String mami = "snehal";

        Stack<Character> mamaStack = new Stack<>();
        List<Character> characterList  = new ArrayList<>();
        for (var stackData : mama.toCharArray()){
            mamaStack.push(stackData);
        }

        for (var data : mami.toCharArray()){
            if (mamaStack.contains(data)){
                characterList.add(data);
            }

        }
        for (var list: characterList){
            System.out.print(list+" ");
        }
    }
}
