package DSADaysCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSumSet {
    public static void main(String[] args) {
        int sumArray[]= {2,7,11,15};
        int target=9;

        System.out.println(Arrays.toString(twoSumArrayFunc(sumArray,target)));
    }

    private static int[] twoSumArrayFunc(int[] sumArray, int target) {

        Set<Integer> integerSet=new HashSet<>();

        for (int n:sumArray){
            int keyData= target-n;
            if (integerSet.contains(keyData)){
                return new int[]{keyData,n};
            }

            integerSet.add(n);
        }
        throw new IllegalArgumentException("No sum found");
    }
}
