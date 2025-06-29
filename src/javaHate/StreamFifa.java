package javaHate;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamFifa {
    public static void main(String[] args) {

        List<EmployeeDatabase> empData = EmployeeFactory.getSampleEmployees();

        System.out.println("Emp dta grouping ...");

        Map<String,List<EmployeeDatabase>> empGrouping = empData.stream()
                .collect(Collectors.groupingBy(EmployeeDatabase::getName));

        Map<String,EmployeeDatabase> empWuthToMap = empData.stream()
                .collect(Collectors.toMap(EmployeeDatabase::getName,e -> e));

        //Q1. Get names of all employees from Bangalore who are Male and have experience more than 2 years.

        List<String> databaseList = empData.parallelStream()
                .filter(e->e.getCity().equalsIgnoreCase("bangalore"))
                .filter(e->e.getGender().equalsIgnoreCase("male"))
                .filter(e->e.getExperienceInCurrentDomain()>2)
                .map(EmployeeDatabase::getName).collect(Collectors.toList());

        //Q2. Count the number of employees grouped by gender.
        Map<String, Long> mapList = empData.stream()
                        .collect(Collectors.groupingBy(EmployeeDatabase::getGender,Collectors.counting()));

        Map<String, Long> mapList1 = empData.stream()
                .collect(Collectors.groupingBy(EmployeeDatabase::getCity,Collectors.counting()));


        //Q3. Find the average age of employees based on education qualification.

        Map<String,Double> ageAndAverage = empData.stream()
                        .collect(Collectors.groupingBy(EmployeeDatabase::getEducation,Collectors.averagingLong(EmployeeDatabase::getAge)));

       //Youngest employee who get the at least one position
       //sort by year of join and the age
        List<EmployeeDatabase> database = empData.stream()
                .sorted(
                        Comparator.comparing(EmployeeDatabase::getJoiningYear)
                                .thenComparing(EmployeeDatabase::getAge)
                )
                .collect(Collectors.toList());


        //List all employees who are females, above 30 years and are married.

        List<EmployeeDatabase> empValid =empData.stream()
                        .filter(e->e.getGender().equalsIgnoreCase("female") && e.getAge() >30 ).toList();


        System.out.println();
        System.out.println(databaseList);
        System.out.println();
        System.out.println(mapList);
        System.out.println();
        System.out.println(mapList1);
        System.out.println();
        System.out.println(ageAndAverage);
        System.out.println();
        System.out.println(database);
        System.out.println();
        System.out.println(empValid);
    }
}
