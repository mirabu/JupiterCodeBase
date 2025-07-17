package javaHate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MethodBroker {
    public static void main(String[] args) {

        List<EmployeeDatabase> employeeList = EmployeeFactory.getSampleEmployees();
        Map<String, List<EmployeeDatabase> > empData = employeeList.stream()
                .collect(Collectors.groupingBy(EmployeeDatabase::getCity));
        System.out.println(empData);
        System.out.println();
        List<String> emp= employeeList.stream()
                .filter(e->e.getAge() >30)
                .map(EmployeeDatabase::getName)
                .toList();

        System.out.println(emp);

        Optional<EmployeeDatabase> sorted = employeeList.stream()
                .sorted(  (e1,e2)->Double.compare(
                        e1.getAge(), e2.getAge()
                )).skip(1).findFirst();

        System.out.println(sorted);


        Map<Boolean ,List<EmployeeDatabase>> listMap= employeeList.stream()
                .collect(Collectors.partitioningBy(e->e.getAge()>30));

        System.out.println(listMap);
    }
}
