package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int sumArray[]= {2,7,11,15};
        int target=13;

        System.out.println(Arrays.toString(twoSumOfArray(sumArray,target)));


    }

    private static int[] twoSumOfArray(int[] sumArray,int target) {

        Map<Integer,Integer> integerMap = new HashMap<>();

        for (int i=0;i<sumArray.length;i++){
            int comp = target - sumArray[i];
            if (integerMap.containsKey(comp)){
                return new int[]{integerMap.get(comp),i};
            }
            integerMap.put(sumArray[i],i);
        }
        throw new IllegalArgumentException("No sum");
    }
}
