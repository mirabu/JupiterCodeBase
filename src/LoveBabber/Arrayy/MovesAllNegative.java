package LoveBabber.Arrayy;

import java.util.Arrays;

public class MovesAllNegative {
    public static void main(String[] args) {
        int[] data= {5,7,6,-2,2,-7,4,6,5,-6,-8,-3,4,2,-1,0,10};
        Arrays.sort(data);
        for (int arrData : data){
            System.out.print(arrData+" ");
        }
    }
}
