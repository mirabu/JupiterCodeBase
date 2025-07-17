package javaHate;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenOdd {
    public static void main(String[] args) {

        //odd even sep
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean,List<Integer>> listMap=
                listOfIntegers.stream().collect(Collectors.partitioningBy(i->i%2==0));

        System.out.println(listMap);

        //distinct element
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> stringList = listOfStrings.stream().distinct().toList();
        System.out.println(stringList);


        //frequency of ch
        String inputString = "Java Concept Of The Day";

        List<Character> longMap = inputString.chars()
                .mapToObj(c-> (char)c).filter(c->c != ' ').toList();

        Map<Character,Long> characterLongMap = longMap.stream()
                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(characterLongMap);

        //freq of word
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Map<String, Long> stringLongMap = stationeryList.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(stringLongMap);

        //sort the list with des
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        List<Double> doubleList =decimalList.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(doubleList);

        //multiple by 5
        List<Integer> numbers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer> fiveNumbers = numbers.stream().map(i->i*5).toList();
        System.out.println(fiveNumbers);

        //min max
        List<Integer> num = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        int maxNum= num.stream().max(Comparator.naturalOrder()).get();
        System.out.println(maxNum);

        int minNum = num.stream().min(Comparator.naturalOrder()).get();
        System.out.println(minNum);


        //flatMap
        List<List<String>> names = List.of(
                List.of("Ram", "Shyam"),
                List.of("John", "Jane"),
                List.of("Laksha", "Dss"),
                List.of("Asdadsa", "Wrrre"),
                List.of("Ffdfd", "Ffsfs")
        );

        List<String> namesList = names.stream().flatMap(Collection::parallelStream).toList();
        System.out.println(namesList);

        //max3 and min3
        List<Integer> maxNumb = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer> maxThree = maxNumb.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println(maxThree);
        List<Integer> minThree = maxNumb.stream().sorted(Comparator.naturalOrder()).limit(3).toList();
        System.out.println(minThree);

        //checkAnagram
        String s1 = "RaceCar";
        String s2 = "CarRace";
        String string1 = Stream.of(s1).map(s->s.toLowerCase()).collect(Collectors.joining()).toString();
        String string2 = Stream.of(s2).map(s->s.toLowerCase()).collect(Collectors.joining()).toString();
        if (string1.equals(string2)){
            System.out.println("anagram....");
        }else{
            System.out.println("not anagram");
        }


        String myName ="manchester";
        int data = 15623;
        String stringData= String.valueOf(data);
        String rev = stringData.chars().mapToObj(s->String.valueOf((char) s)).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        int revNum =Integer.parseInt(rev);
        System.out.println(revNum+" ");
        System.out.println(revNum instanceof Integer);


        List<String> listOfStringsData = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        List<String> listOfLength = listOfStringsData.stream().sorted(Comparator.comparing(String::length)).toList();
        System.out.println(listOfLength);

        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        List<Integer> listCommon  = list1.stream().filter(list2::contains).toList();
        System.out.println(listCommon);

        //Object base
        List<EmployeeDatabase> empData = EmployeeFactory.getSampleEmployees();


        //count gender
        Map<String, Long> map = empData.stream()
                .collect(Collectors.groupingBy(EmployeeDatabase::getGender,Collectors.counting()));
        System.out.println(map);

        //employees from banglore
        List<EmployeeDatabase> bangEmp = empData.stream()
                .filter(e->e.getCity().equalsIgnoreCase("Bangalore"))
                .toList();
        System.out.print(bangEmp+" ");
        System.out.println();
        //oldaest admi
        List<EmployeeDatabase> oldMan = empData.stream()
                .sorted((Comparator.comparingInt(EmployeeDatabase::getAge).reversed())).limit(1).toList();

        System.out.println("oldest person : "+oldMan);


    }



}
