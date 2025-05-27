package BattleField;

public class ContinMostWater {
    public static void main(String[] args) {
        int[] arr = {2, 1, 8, 6, 4, 6, 5, 5};
        int maxCapacity =findMaxwaterLevel(arr);
        System.out.println(maxCapacity);
    }

    private static int findMaxwaterLevel(int[] arr) {
        int left=0;
        int right =arr.length-1;
        int level=0;

        while (left<right){
            int capacity =Math.min(arr[left],arr[right])*(right-left);
            level=Math.max(level,capacity);

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }

        }
        return level;

    }
}
