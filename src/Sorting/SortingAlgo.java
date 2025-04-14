package Sorting;

import java.util.Arrays;

public class SortingAlgo {
    public static void main(String[] args) {

        int[] arrayData={42, 7, 19, 3,21};
        System.out.println("Array Before Sort :");
        displayArray(arrayData);

        int[] sortedArray= mergeSortAlgo(arrayData);
        System.out.println("sorted array :");
        displayArray(sortedArray);

    }

    private static void displayArray(int[] arrayData) {
        for (int data: arrayData){
            System.out.print(data+" ");

        }
        System.out.println();
    }

    private static int[] mergeSortAlgo(int[] arrayData) {

        if (arrayData.length <=1 )return arrayData;
        int mid =arrayData.length/2;
        int[] left = Arrays.copyOfRange(arrayData,0,mid);
        int[] right = Arrays.copyOfRange(arrayData,mid,arrayData.length);

        return mergeData(mergeSortAlgo(left),mergeSortAlgo(right));
    }

    private static int[] mergeData(int[] left, int[] right) {
        int[] result = new int[left.length+right.length];
        int i =0;
        int j =0;
        int k =0;

        while(i< left.length && j< right.length){

            if (left[i] <= right[j]){
                result[k++]=left[i++];
            }else{
                result[k++]=right[j++];
            }
        }

        while(i< left.length) result[k++] =left[i++];
        while (j< right.length) result[k++] = right[j++];

        return result;
    }
}
