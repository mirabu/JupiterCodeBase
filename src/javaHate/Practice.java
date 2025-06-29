package javaHate;

import java.util.*;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<String> stringList = names.stream()
                .map(n->n.toUpperCase()).toList();

        List<Integer> integers = integerList.stream()
                        .map(numbers->numbers*5).toList();
        Map<String, Integer> map = Map.of("c", 3, "a", 1, "b", 2);

        Map<String,Integer> integerMap = map.entrySet().stream()
                        .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(a,b)->a ,TreeMap::new));


        String input = "harshal";
        String sentence = "java is fun";

        List<String> strings = Arrays.stream(sentence.split(" ")).toList();
        List<String> revString = strings.reversed();
        System.out.println(revString);



        Map<Character,Long> map1= sentence.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()));



        Map<Character, Long> characterMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        LinkedHashMap::new,       // maintains insertion order
                        Collectors.counting()     // counts each char
                ));
        System.out.println(integerMap);
        System.out.println(integers);
        System.out.println(stringList);
    }
}
