package DSADaysCode;

import java.util.ArrayList;
import java.util.List;

public class ProductOfArrayItself {
    public static void main(String[] args) {
        int[] array={1,2,3,4};
        int[] result = productOfArray(array);
        for(int num:result){
            System.out.print(num+" ");
        }


}

    private static int[] productOfArray(int[] array) {
        int n=array.length;
        int[] result=new int[n];

        result[0]=1;

        for (int i=1;i<n;i++){
            result[i]=result[i-1]*array[i-1];
        }

        int suffix=1;
        for(int i=n-1;i>=0;i--){
             result[i]=result[i]*suffix;
             suffix=suffix*array[i];
        }

       return result;
      }
}
