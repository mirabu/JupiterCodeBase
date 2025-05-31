package Arrays;

import java.util.HashMap;

public class MaxMiniFind {
    public static void main(String[] args) {
        int array[] = {1, 3, 2, 4, 5, 3, 4, 3, 21, 3, 2, 3, 4, 5, 6, 8, 7, 600, 45, 6, 5, 4, 3, 2, 3, 3, 5, 4, 5, 4, 3, 3, 2,100};
        maxMiniOccurrence(array);
    }

    private static void maxMiniOccurrence(int[] array) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i=0;i< array.length;i++){
            hashMap.put(array[i], hashMap.getOrDefault(array[i],0)+1 );
        }

        for (var mapData : hashMap.entrySet()){
            System.out.println(mapData.getKey()+"->"+ mapData.getValue());
        }

        int miniKey = 0, maxKey = -1;
        int maxValue =0;
        int minValue= Integer.MAX_VALUE;

        for (var data: hashMap.entrySet()){
            int count = data.getValue();

            if ( count > maxValue){
                maxValue =count;
                maxKey = data.getKey();

            }

            if ( count < minValue){
                minValue= count;
                miniKey= data.getKey();
            }
        }
        System.out.println(" ");
        System.out.println("***************");
        System.out.println("maximum available : "+ maxKey);
        System.out.println("minimum available  : "+ miniKey);

    }
}
