package Arrays;

import java.util.HashMap;
import java.util.Map;

public class ThreeSumOptimized {
    public static void main(String[] args) {
        String name= "navinash";

        Map<Character,Integer> stringIntegerMap = new HashMap<>();
        char[] chars =name.toCharArray();
   for (var data: chars){
       stringIntegerMap.put(data, stringIntegerMap.getOrDefault(data,0)+1);
   }

   for (var newData: stringIntegerMap.entrySet()){
       if (newData.getValue() >1){
           System.out.println("This is the character : "+newData.getKey()+" is repeating "+newData.getValue()+" times");
       }
   }

   if (1>1){
       System.out.println("true");
   }else{
       System.out.println("false");
   }


        




    }
}
