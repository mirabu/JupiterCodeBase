package Arrays;

import java.util.Arrays;
import java.util.List;

public class ArraySecHighestNumber {
    public static void main(String[] args) {
        List<Integer> array= Arrays.asList(12, 45, 2, 41, 31, 10, 56, 78);
        int first = Integer.MIN_VALUE;
        int second= Integer.MIN_VALUE;

        if (array.size() <=2){
            throw new RuntimeException("array size must be greater than two");
        }

        if (array.get(0) > array.get(1)){
            first=array.get(0);
            second=array.get(1);
            System.out.println("first highest number : "+first);
            System.out.println("sec highest number : "+second);
        }else{
            first=array.get(1);
            second=array.get(0);
            System.out.println("first  : "+first);
            System.out.println("sec : "+second);
        }

        for (int num : array) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        System.out.println("First highest number: " + first);
        System.out.println("Second highest number: " + second);





    }
}
