package Arrays;

import java.util.*;

public class LinkeHashMapData {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,2,3,4,4,4,5,6,7,7,7,7,7,7,8,9,10);
        Map<Integer,Integer> map = new LinkedHashMap<>();

        for (var data : integerList){
            map.put(data,map.getOrDefault(data,0)+1);
        }

        int count=0;
        for (var mapData: map.entrySet()){
          //  System.out.println(mapData.getKey()+" "+mapData.getValue());

            if (mapData.getValue() >1){
                System.out.println(mapData.getKey()+"->"+mapData.getValue());
                count++;

                if (count==2) break;
            }
        }
    }
}
