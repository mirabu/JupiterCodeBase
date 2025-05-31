package String;

import java.util.*;

public class StringBuffPractice {
    public static void main(String[] args) {

        String team= "manchester";
        StringBuffer stringBuffer = new StringBuffer();
        HashMap<Object, Object> hashMap =new HashMap<>();
        for (int i=0; i<=team.length();i++){
            hashMap.put(team.substring(0,i),i);
        }

        System.out.println(hashMap);

    }
}
