package Arrays;

import java.util.Arrays;

public class TwoDimetions {
    public static void main(String[] args) {
        int[][] two=new int[4][];
        int k=0;
        for (int i=0;i<4;i++){
            two[i] = new int[i + 1];
            for (int j=0;j<i+1;j++){
                two[i][j]=k;
                k++;
            }
        }
        //String data=Arrays.deepToString(two);
        //System.out.print(data);

        for (int[] row : two) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }
}
