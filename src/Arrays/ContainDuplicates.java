package Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicates {
    public static void main(String[] args) {
        int array[]={1,3,2,4,5,3,4,3,21,3,2,3,4,5,6,8,7,6,45,6,5,4,3,2,3,3,5,4,5,4,3,3,2,1};
        containsDuplicate(array);
    }

    private static void containsDuplicate(int[] arrayData) {
        Set<Integer> integerSet =new HashSet<>();
          for(int i=0;i<arrayData.length;i++){
            integerSet.add(arrayData[i]);
        }
        System.out.println(integerSet);
    }
}
