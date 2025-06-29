package javaHate;

import java.util.*;
import java.util.stream.Collectors;

public class AsciiValues {
    public static void main(String[] args) {
        List<Integer> asciiValues = new ArrayList<>();
        Map<Integer, Character> characterMap =new LinkedHashMap<>();
        for (int i = 0; i <= 122; i++) {
            asciiValues.add(i);
            characterMap.put(i, (char) i);
        }

        List<Character> characterList = asciiValues.stream().map(c -> (char) (int) c)
                .collect(Collectors.toList());
        System.out.println(characterList);
        System.out.println();
        System.out.println("***********************");
        System.out.println();
        for (var mapData: characterMap.entrySet()){
            System.out.println(mapData.getKey()+"->"+ mapData.getValue());
        }
        someMethod(null);

    }

    private static void someMethod(Object o) {
        System.out.println("object explorer");
    }

    private static void someMethod(String name) {
        System.out.println("string explorer");
    }
}
