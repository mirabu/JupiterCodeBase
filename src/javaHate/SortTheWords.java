package javaHate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheWords {
    public static void main(String[] args) {
        String str ="java is the fun loving lang and he hall of blame";
        List<String> stringList = Arrays.stream(str.split(" ")).map(String::toLowerCase).distinct().sorted().collect(Collectors.toList());
        System.out.println(stringList);
    }
}
