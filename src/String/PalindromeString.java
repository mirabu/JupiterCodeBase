package String;

public class PalindromeString {
    public static void main(String[] args) {
        String name= "Naman";
        boolean check = palindromeStringChecker(name);
        System.out.println(check);

    }

    private static boolean palindromeStringChecker(String name) {
         name=name.toLowerCase();
        char nameChar[]=name.toCharArray();
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=nameChar.length-1;i>=0;i--){
            stringBuilder.append(nameChar[i]);
        }
        if (name.equals(stringBuilder.toString())){
            return true;
        }else{
            return false;
        }

    }
}
