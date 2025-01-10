package SearchSort;

public class BinarySearchAlgo {
    public static void main(String[] args) {

        int[] array={5,3,2,3,5,54,5,3,4,2,33,5,6,5,6,7,5,4,4,3,4,3,2,2,9};


        int searchThisNumber = 54;
        int indexFoundAt= elementFoundAt(array, searchThisNumber);

        if (indexFoundAt != 1){
            System.out.println("Found at : "+indexFoundAt);
        }else {
            System.out.println("Not Found");
        }

    }

    private static int elementFoundAt(int[] array, int searchThisNumber) {

        int low = 0;
        int high= array.length-1;


        while (low<=high){
            int mid = (low+high)/2;
            if (searchThisNumber==array[mid]) return mid+1;
            else if (searchThisNumber > array[mid]) low=mid+1;
            else high =mid-1;
        }
        return -1;

    }
}
