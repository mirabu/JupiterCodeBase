package javaHate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeData {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeFactory.create50Employees();
        employees.forEach(System.out::println);

        System.out.println();
        System.out.println("****************************");
        System.out.println();

        List<Employee> filterByDept= employees.stream().
                filter(e->"Sales".equals(e.getDepartment())).collect(Collectors.toList());

        filterByDept.forEach(System.out::println);
        System.out.println();
        System.out.println("****************************");
        System.out.println();
        List<Employee> sortSalary = employees.stream().
                sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
        sortSalary.forEach(System.out::println);

        System.out.println();
        System.out.println("****************************");
        System.out.println();
        Optional<Employee> HighSalary = employees.stream().max(Comparator.comparing(Employee::getSalary));
       HighSalary.ifPresent(System.out::println);



    }
}
