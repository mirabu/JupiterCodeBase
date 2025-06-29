package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MaxMiniO {
    public static void main(String[] args) {

        int[] dummyData = {
                1, 3, 2, 4, 5, 3, 4, 3,
                21, 3, 2, 3, 4, 5, 6, 8,
                7, 6, 45, 6, 5, 4, 3, 2,
                3, 3, 5, 4, 5, 4, 3, 3,
                2, 1
        };

        Map<Integer,Integer> integerMap = new HashMap<>();
        for (var data: dummyData){
            integerMap.put(data,integerMap.getOrDefault(data,0)+1);
        }

        for (var mapData : integerMap.entrySet()){
            System.out.println(mapData.getKey()+" ->"+ mapData.getValue());
        }



    }
}
