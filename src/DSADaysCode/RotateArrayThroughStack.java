package DSADaysCode;

import java.util.*;

public class RotateArrayThroughStack {
    public static void main(String[] args) {
        int[] arr = {3,6,9,12,15,18,21,24,27,30};
        int shift =4;

        Stack<Integer> stack= new Stack<>();
        for (int i=0;i<4;i++){
            stack.push(arr[i]);
        }
        //shift
        for (int i= shift; i<arr.length;i++){
            arr[i-shift]=arr[i];
        }

        int index= arr.length-shift;
        while (!stack.isEmpty()){
            arr[index++]=stack.pop();
        }

        System.out.println("Rotate : "+Arrays.toString(arr));



    }
}
