package String;

public class StringComprassion {
    public static void main(String[] args) {

        String word="aaaabbbccddd";
        String compressedString = stringCompressionAlgorithm(word);
        System.out.println(compressedString);
    }

    private static String stringCompressionAlgorithm(String word) {

        int count=1;
        StringBuilder stringBuilder=new StringBuilder();

        for (int i=1; i<word.length();i++){
            if (word.charAt(i)==word.charAt(i-1)){
                count++;
            }else{
                stringBuilder.append(word.charAt(i-1));
                if (count>1){
                    stringBuilder.append(count);
                }
                count=1;
            }
        }

        //last character handle
        stringBuilder.append(word.charAt(word.length()-1));
        if (count>1){
            stringBuilder.append(count);
        }

        return stringBuilder.toString();
    }
}
