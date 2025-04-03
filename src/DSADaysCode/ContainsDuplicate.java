package DSADaysCode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
      int[] Duplicates = {4, 15, 4, 11, 7, 11, 15, 15, 4, 7};

        Set<Integer> integers= new HashSet<>();

        for (int numbers : Duplicates){
            integers.add(numbers);
        }

        System.out.println(integers);

    }
}
