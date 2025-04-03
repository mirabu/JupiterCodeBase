package DSADaysCode;

import java.util.*;

public class AnagramGroup {
    public static void main(String[] args) {
        String[] words = {"listen", "silent", "enlist", "tinsel", "inlets",
                "rat", "tar", "art",
                "evil", "vile", "live", "veil",
                "stone", "notes", "tones", "onset"};

        System.out.print(anagramGroupFormation(words));
    }

    private static List<List<String>> anagramGroupFormation(String[] words) {
        Map<String, List<String>> stringListMap = new HashMap<>();
        for(String noWords : words){
            String key = getSortedWord(noWords);
            stringListMap.computeIfAbsent(key,k->new ArrayList<>()).add(noWords);
        }

       return new ArrayList<>(stringListMap.values());
    }

    private static String getSortedWord(String noWords) {
        char[] chars = noWords.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
