package Arrays;

import java.util.Scanner;

public class maxNumberHeight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Test=sc.nextInt();

        for(int i=0;i<Test;i++){
            int size=sc.nextInt();
            int[] array=new int[size];

            for(int j=0;j<size;j++){
                array[j]=sc.nextInt();
            }

            int maxHight=array[0];
            for(int k=0;k<size;k++){
                if (maxHight<array[k])
                    maxHight=array[k];
            }

            System.out.println(maxHight);
        }

    }
}
