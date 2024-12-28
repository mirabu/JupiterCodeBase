package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateString {
    public static void main(String[] args) {
        String teamNumber = "ManchesterunitedhhohffcafhFH3phihiFfFDNVDANEFNFFLEKKDHDIHAIGGALglregihrfknd";
        char[] charLetters = teamNumber.toLowerCase().toCharArray();
        Set<Character> characters =new HashSet<>();
        Map<Character,Long> characterLongMap = new HashMap<>();

        for(char letters:charLetters){
            characters.add(letters);
            characterLongMap.put(letters,characterLongMap.getOrDefault(letters,0L)+1);

        }

        char mostFrequencyChar = '\0';
        long maxFrequency = 0;

        for (Map.Entry<Character,Long> entry : characterLongMap.entrySet()){
            if(entry.getValue() > maxFrequency){
              mostFrequencyChar= entry.getKey();
              maxFrequency=entry.getValue();
            }
        }



        System.out.println(characters);
        System.out.println(characterLongMap);
        System.out.println("*************************");
        System.out.println("Maximum character : "+mostFrequencyChar +"-"+maxFrequency);
    }
}
