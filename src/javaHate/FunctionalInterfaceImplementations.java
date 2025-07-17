package javaHate;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FunctionalInterfaceImplementations {
    public static void main(String[] args) {

        FunkoInterMilan funkoInterMilan = (message)->{
            System.out.println("This is my functional interface "+message);
        };

        funkoInterMilan.displayMessage("master");

        List<EmployeeDatabase> employeeList = EmployeeFactory.getSampleEmployees();

        Map<String,List<EmployeeDatabase>> empName = employeeList.stream()
                .collect(Collectors.groupingBy(EmployeeDatabase::getName));
        System.out.println(empName);

        List<String> empNameList= employeeList.stream()
                .map(EmployeeDatabase::getName).toList();

        List<String> empDaata= employeeList.stream()
                .map(e->e.getName().toUpperCase()).toList();

        System.out.println(empDaata);

    }
}
