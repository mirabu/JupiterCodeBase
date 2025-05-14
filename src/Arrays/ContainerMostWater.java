package Arrays;

public class ContainerMostWater {
    public static void main(String[] args) {

        int[] arr = {2, 1, 8, 6, 4, 6, 5, 5};
        int maxWater = findMaxWaterCapcity(arr);
        System.out.println(" Max capacity of tank is : "+maxWater);


    }

    private static int findMaxWaterCapcity(int[] arr) {

        int left=0;
        int right=arr.length-1;
        int res=0;
//        for (int i=0;i<arr.length;i++){
//            for (int j=i+1;j<arr.length;j++){
//
//                int amount= Math.min(arr[i],arr[j])*(j-i);
//                res= Math.max(amount,res);
//            }
//
//        }

        while (left<right){
            int amount= Math.min(arr[left],arr[right])*(right-left);
            res=Math.max(amount,res);

            if (right > left){
                left++;
            }else{
                right--;
            }
        }

        return res;
    }
}
