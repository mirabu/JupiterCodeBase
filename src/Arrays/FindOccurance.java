package Arrays;

import java.util.HashMap;
import java.util.Map;

public class FindOccurance {
    public static void main(String[] args) {
        int array[]={1,3,2,4,5,3,4,3,21,3,2,3,4,5,6,8,7,6,45,6,5,4,3,2,3,3,5,4,5,4,3,3,2,1};

        findOccurance(array);
    }

    private static void findOccurance(int[] arrayData) {
        Map<Integer,Integer> integerMap =new HashMap<>();

        //count occ
        for (int num: arrayData){
            integerMap.put(num, integerMap.getOrDefault(num,0)+1);
        }
        System.out.println("Duplicates and there counts : ");
       //print
        for (Map.Entry<Integer, Integer> entry : integerMap.entrySet()){
            if (entry.getValue() > 1) {
                System.out.println( entry.getKey()+" - > "+ entry.getValue());
            }
        }


    }
}
