package String;

import java.util.ArrayList;
import java.util.List;

public class SubString {
    public static void main(String[] args) {
        String word="Manchester";
        //printAllSubStirng(word);
        List<String> stringList= printAllSubStirng(word);
        System.out.println(stringList);
    }

    private static List<String> printAllSubStirng(String word) {
        List<String> strings =new ArrayList<>();
        for (int i=0;i<word.length();i++){
            for (int j=i+1;j<=word.length();j++){
                strings.add(word.substring(i,j));
            }
        }
        return strings;
    }
}
