package Arrays;

import java.util.HashMap;
import java.util.Map;

public class EncryptionString {
    public static void main(String[] args) {
        String data = "aaaaabbbbccdfffggerwww";
        System.out.println("Original string : "+data);

        char[] chars= data.toCharArray();
        Map<Character,Integer> map=new HashMap<>();

        for (var charData:  chars){
            map.put(charData,map.getOrDefault(charData,0)+1);
        }

        System.out.print("Encrypted string : ");
        for (var mapData:map.entrySet()){
            System.out.print(mapData.getKey()+""+mapData.getValue());

        }



    }
}
