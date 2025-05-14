package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ThreeSum {
    public static void main(String[] args) {

        int[] input= {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result=new ArrayList<>();

        for (int i=0;i<input.length-3;i++){

            for (int j=1;j<input.length-2;j++){

                for (int k=2;k<input.length-1;k++){
                    if (input[i]+input[j]+input[k]==0){
                        System.out.println(input[i]+" "+input[j]+" "+input[k]);
                    }
                }

            }

        }
    }
}
