package Mathematics;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class IntersectionOfArray {
    public static void main(String[] args) {

        int[] firstArray = { 4, 2, 3, 1, 6 };
        int[] secondArray =  { 6, 7, 8, 4 };

        int[] setOfAll = IntStream.concat(IntStream.of(firstArray),IntStream.of(secondArray)).toArray();
        Set<Integer> integerSet =new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        for(int integerList : firstArray){
            integerSet.add(integerList);
        }

        for (int integerList2 :secondArray ){
            if (integerSet.contains(integerList2)){
                intersection.add(integerList2);
            }
        }

        System.out.println(intersection);






    }
}
