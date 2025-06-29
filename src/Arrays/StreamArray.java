package Arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class StreamArray {
    public static void main(String[] args) {
        List<String> a1 = List.of("a", "b", "c", "d", "d");
        List<String> a2 = List.of("e", "f", "g","g", "h");
        List<String> a3 = List.of("i", "j", "k", "l", "l");


        List<String> merge = Stream.of(a1,a2,a3)
                .flatMap(List::stream).collect(Collectors.toList());

        System.out.println(merge);

        Map<String, Integer> map= new HashMap<>();
        for (var data: merge){
            map.put(data,map.getOrDefault(data,0)+1);
        }

        for (var dataMap : map.entrySet()){

            if(dataMap.getValue()>1 ){
                System.out.println(dataMap.getKey());
                System.out.println(dataMap.getKey()+"->"+dataMap.getValue());
            }
        }

        String result = null;
        int maxFreq = 1;

        for(var stringData : merge){
            int freq = map.get(stringData);
            if (freq >1 && freq >maxFreq){
                result=stringData;
                maxFreq=freq;
            }
        }
        System.out.println("very first :"+result);
    }


}
