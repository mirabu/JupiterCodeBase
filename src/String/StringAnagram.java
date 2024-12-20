package String;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {

        String school="Baliram";
        String shala="Marlabi";

        boolean value = checkAnagrams(school,shala);
        System.out.println(value);
    }

    private static boolean checkAnagrams(String school, String shala) {
    char[] schoolChar = school.toCharArray();
    char[] shalaChar = shala.toCharArray();

        Arrays.sort(schoolChar);
        Arrays.sort(shalaChar);
        return Arrays.equals(schoolChar,shalaChar);
    }
}
