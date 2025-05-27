package javaHate;

import java.util.*;
import java.util.stream.Collectors;



public class EmployeeData {
    public static void main(String[] args) {

        List<EmployeeDatabase> employeeList = EmployeeFactory.getSampleEmployees();

       //get all employee who are not in bench
        List<EmployeeDatabase> activeEmp = employeeList.stream()
                .filter(emp->"No".equalsIgnoreCase(emp.getEverBenched()))
                .collect(Collectors.toList());
        System.out.print(activeEmp+" ");


        System.out.println();
        System.out.println("********");
      //get male employee and those are from banglore
        List<EmployeeDatabase> empCity =employeeList.stream()
                .filter(emp->emp.getGender().equalsIgnoreCase("Male")
                && emp.getCity().equalsIgnoreCase("Bangalore")).collect(Collectors.toList());
        System.out.println(empCity+" ");

        System.out.println();
        System.out.println("********");
       //emp List who are taking the leave list
        long leaveEmpList = employeeList.stream()
                .filter(emp->emp.getLeaveOrNot()==1)
                .count();
        System.out.println("No of emp of taking leave: "+leaveEmpList);

        System.out.println();
        System.out.println("********");
        //emp List my city groping
        Map<String,List<EmployeeDatabase>> listMap=employeeList.stream()
                .collect(Collectors.groupingBy(EmployeeDatabase::getCity));

        System.out.println(listMap+" ");

        System.out.println();
        System.out.println("********");
        //Average age of emp
        double aveAge = employeeList.stream()
                .mapToInt(EmployeeDatabase::getAge)
                .average().orElse(0);
        System.out.println(aveAge);

        System.out.println();
        System.out.println("********");
        //Average age of emp
        EmployeeDatabase miniAge = employeeList.stream()
                        .min(Comparator.comparing(EmployeeDatabase::getAge))
                                .orElse(null);
        System.out.println(miniAge);

        System.out.println();
        System.out.println("********");
        //distinct age of education
        List<String> allCourse = employeeList.stream()
                .map(EmployeeDatabase::getEducation)
                .distinct().collect(Collectors.toList());
        System.out.println(allCourse);

        System.out.println();
        System.out.println("********");
        //partiion by leave
        Map<Boolean,List<EmployeeDatabase>> part = employeeList.stream()
                .collect(Collectors.partitioningBy(e->e.getLeaveOrNot()==1));


        System.out.println();
        System.out.println("********");
        //after join 2025 by leave
        List<EmployeeDatabase> databases= employeeList.stream()
                .filter(emp->emp.getJoiningYear()<2025)
                .collect(Collectors.toList());
        System.out.println(databases);


        System.out.println();
        System.out.println("********");
        //sort emp by descending
        //for finding sec most
        //used skip(1) or findFirst()
        List<EmployeeDatabase> sorted = employeeList.stream()
                .sorted(Comparator.comparingInt(EmployeeDatabase::getAge).reversed())
                .collect(Collectors.toList());
        System.out.println(sorted);

    }
}
