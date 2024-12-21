package Arrays;

public class MaxMini {
    public static void main(String[] args) {

        int max =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int array[]={1,3,2,4,5,3,4,3,21,3,2,3,4,5,6,8,7,6,45,6,5,4,3,2,3,3,5,4,5,4,3,3,2,1};

        for (int i=0;i<array.length;i++){
            if (max < array[i]){
                max=array[i];

            }
        }
        System.out.println(max+" ");
    }
}
