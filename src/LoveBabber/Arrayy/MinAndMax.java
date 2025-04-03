package LoveBabber.Arrayy;

import java.util.Arrays;

public class MinAndMax {
    public static void main(String[] args) {
        int[] intArray={4,6,5,6,8,8,7,56,6,5,3,4,3,2,43,6,6,7,8,9,8,9,6,6,7,5};

        System.out.println("Current Array");
        for (int data:intArray){
            System.out.print(data+" ");
        }

        Arrays.sort(intArray);
        System.out.println();
        System.out.print("Max element is: "+intArray[intArray.length-1]);
        System.out.println();
        System.out.print("Min element is: "+intArray[0]);

    }
}
