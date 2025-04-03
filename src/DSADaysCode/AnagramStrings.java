package DSADaysCode;


import java.util.Arrays;

public class AnagramStrings {
    public static void main(String[] args) {
        String first="lISTEN";
        String second="silent";

        boolean checkAnagrams= anagramsChecker(first,second);
        System.out.println(checkAnagrams);

    }

    private static boolean anagramsChecker(String first, String second) {
        char[] firstArray = first.toLowerCase().toCharArray();
        char[] secondArray = second.toLowerCase().toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
       return Arrays.equals(firstArray,secondArray);

    }
}
