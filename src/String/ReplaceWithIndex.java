package String;

import java.util.Arrays;

public class ReplaceWithIndex {
    public static void main(String[] args) {
        String slogan= "Bharat mata ki jay";
        int index =5;
        char replaceChar = 'z';

        char[] charSlogan = slogan.replace(" ","").toCharArray();


        for(int i=0;i<charSlogan.length;i++){
            if(charSlogan[index]==charSlogan[i]){
                charSlogan[i]= replaceChar;

            }
        }

        for (char charSlog : charSlogan){
            System.out.print(charSlog+" ");
        }




       // String newSlogan = relaceCharInSentace(slogan,index,replaceChar);
    }
/*
    private static String relaceCharInSentace(String slogan, int index, char replaceChar) {

        String[] sloganArray = slogan.split(" ");
        char[][] chars = new char[sloganArray.length][];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = sloganArray[i].toCharArray();
        }

        *//*for(int i=0;i<chars.length;i++){
            if(chars[index]==chars[i]){
                chars[i]= new char[]{replaceChar};

            }
        }

        return chars.toString();
    }*//*
    }*/
}
