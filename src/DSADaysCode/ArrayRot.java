package DSADaysCode;


import static Arrays.ArrayRotation.reverseArray;

public class ArrayRot {
    public static void main(String[] args) {
        int[] arr = {3,6,9,12,15,18,21,24,27,30};
        int rotation =4;

        System.out.println("Before array: ");
        printArrayData(arr);

        System.out.println();
        System.out.println("After array: ");
        arrayMakeRotation(arr,rotation);
        printArrayData(arr);


    }

    private static void arrayMakeRotation(int[] arr, int rotation) {
        int length= arr.length;
        rotation=rotation%10;

        reverseArray(arr,0,rotation-1);
        reverseArray(arr,rotation,length-1);
        reverseArray(arr,0,length-1);


    }

    private static void printArrayData(int[] arr) {
        for (int data: arr){
            System.out.print(data+" ");
        }
    }
}
