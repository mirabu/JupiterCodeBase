package Arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class ReverseNumber {
    public static void main(String[] args) {
//https://youtu.be/4dkCxpEn2Rc?si=jXPMAAoN9W4YMYzM
//        int number=12345;
//        int rev = 0;
//
//        while (number !=0){
//            int digit = number%10;
//            rev =rev*10+digit;
//            number=number/10;
//        }
//        System.out.println(rev);

        String sen = "The quick brown fox jumps over the lazy dog.";
        //String sen = "The brown fox jumps over the lazy cat";

        sen = sen.replaceAll("[^a-zA-Z]", "");
        char[] chars= sen.toLowerCase().toCharArray();
        Map<Character, Integer> map = new TreeMap<>();
        for (var data: chars){
            System.out.print(data+" ");
            map.put(data,map.getOrDefault(data,0)+1);

        }
        System.out.println();
        System.out.println();
        System.out.println("key size  :"+ map.keySet().size());

        if (map.keySet().size()==26){
            System.out.println("its panagram");
        }else {
            System.out.println("its not");
        }
        System.out.println();
        System.out.println();

        for (var mapData : map.entrySet()){
            System.out.println(mapData.getKey()+"->"+mapData.getValue());

        }

    }
}
