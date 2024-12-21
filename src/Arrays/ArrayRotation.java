package Arrays;

public class ArrayRotation {
    public static void main(String[] args) {

        int[] array={1,2,3,4,5,6,7,8,9,10};
        int rotateBy =2;

        System.out.println("Before Rotate");
        arrayPrint(array);

        leftArray(array,rotateBy);
        System.out.println();
        System.out.println("After Rotate");
        arrayPrint(array);


    }

    private static void arrayPrint(int[] array) {
        for(int elements: array){

            System.out.print(elements+" ");
        }
    }

    private static void leftArray(int[] array, int rotateBy) {
        int fact= rotateBy%array.length;
        int len = array.length;
        reverseArray(array,0,fact-1); //reverse first k elements
        reverseArray(array,fact,len-1); //reverse remaining elements
        reverseArray(array,0,len-1); //reverse the whole array


    }

    private static void reverseArray(int[] array, int start, int end) {
        while (start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end]=temp;
            start++;
            end--;

        }
    }
}
