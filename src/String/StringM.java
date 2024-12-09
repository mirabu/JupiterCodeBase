package String;

import java.util.HashMap;
import java.util.Map;

public class StringM {
    public static void main(String[] args) {

        String name = "AvinashA";
        Map<Character,Integer> integerMap = new HashMap<>();



        for (char c:name.toUpperCase().toCharArray()){

            integerMap.put(c, integerMap.getOrDefault(c,0)+1);
        }
        System.out.println(integerMap);



    }
}
