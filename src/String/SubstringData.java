package String;

import java.util.*;

public class SubstringData {
    public static void main(String[] args) {
        String team = "abcabcbb";

        List<String> subData = new ArrayList<>();

        for (int i= 0;i< team.length();i++){
            for (int j=i+1;j<=team.length();j++){
                subData.add(team.substring(i,j));
            }
        }

        Collections.sort(subData);
        System.out.print("list data : ");
        System.out.println();
        Set<String> stringHashSet = new LinkedHashSet<>();
        for (var listData : subData){
            System.out.print(listData+" ");
            stringHashSet.add(listData);
        }

        System.out.println("Hash data set");
        for (var hasData : stringHashSet){
            System.out.print(hasData+" ");
        }


       int maxValue = 0;
       String stringData=null;
       for (var finalHash :stringHashSet){

           int count = finalHash.length();
           if (count > maxValue){
               maxValue=count;
               stringData = finalHash;
           }

       }
        System.out.println(" ");
        System.out.println("Max subString : "+ stringData);


    }
}
