package javaHate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class simplePractice {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> evenNumber = integerList.stream()
                .filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenNumber);

        List<Integer> oddNumbers = integerList.stream()
                .filter(i->i%2!=0).collect(Collectors.toList());

        System.out.println(oddNumbers);



        String name="jugal badgujar is the master";

        Map<Character, Long> frequency = name.chars()
                .mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));

        System.out.println(frequency);

        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        List<Double> list = decimalList.stream().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(list);

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        int max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        int min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Max element is : "+ max+"min element is :"+min);


        String s1 = "RaceCar";
        String s2 = "CarRace";

        s1= Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        s2 =Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        System.out.println(s1);
        System.out.println(s2);

        if(s1.equals(s2)){
            System.out.println("its anagram");
        }else{
            System.out.println("its not anagram");
        }




    }
}
