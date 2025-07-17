package Arrays;

import static java.util.Collections.reverse;

public class TwoDimMatrix {
    public static void main(String[] args) {
        int[][] twoMatrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("Original matrix....");
        displayMatrix(twoMatrix);

        rotateIn90Degree(twoMatrix);
        System.out.println();
        System.out.println("After rotation...");
        displayMatrix(twoMatrix);

    }

    private static void rotateIn90Degree(int[][] twoMatrix) {
     int length =twoMatrix.length;

     //transpose
     for (int i=0;i<length;i++){
         for (int j=i;j<length;j++){
             int temp = twoMatrix[i][j];
             twoMatrix[i][j]=twoMatrix[j][i];
             twoMatrix[j][i]=temp;
         }
     }

     //reverse
     for (int i=0;i<length;i++){
         reverseArr(twoMatrix[i]);
     }

    }

    private static void reverseArr(int[] twoMatrix) {
        int left = 0; int right =twoMatrix.length-1;
        while (left<right){

            int temp= twoMatrix[left];
            twoMatrix[left]=twoMatrix[right];
            twoMatrix[right]=temp;
            left++;
            right--;
        }
    }

    private static void displayMatrix(int[][] twoMatrix) {

        for (var row : twoMatrix){
            for (var val : row){
                System.out.print(val+" ");
            }
            System.out.println(" ");
        }
    }
}
