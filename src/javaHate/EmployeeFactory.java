package javaHate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeFactory {
    public static List<EmployeeDatabase> getSampleEmployees() {
        return Arrays.asList(
                new EmployeeDatabase("Bachelors", 2017, "Bangalore", 3, 34, "Male", "No", 0, 0,"Aman"),
                new EmployeeDatabase("Bachelors", 2014, "New Delhi", 3, 38, "Female", "No", 2, 0,"Suman"),
                new EmployeeDatabase("Masters", 2016, "Bangalore", 3, 27, "Male", "No", 5, 1,"Duman"),
                new EmployeeDatabase("Masters", 2017, "Pune", 3, 24, "Male", "Yes", 2, 1,"Baman"),
                new EmployeeDatabase("Bachelors", 2016, "Bangalore", 3, 22, "Male", "No", 0, 0,"Chaman"),
                new EmployeeDatabase("Bachelors", 2015, "New Delhi", 3, 38, "Male", "No", 0, 0,"Laman"),
                new EmployeeDatabase("Bachelors", 2016, "Bangalore", 3, 34, "Female", "No", 2, 1,"Ram"),
                new EmployeeDatabase("Bachelors", 2016, "Pune", 3, 23, "Male", "No", 1, 0,"sham"),
                new EmployeeDatabase("Masters", 2017, "New Delhi", 2, 37, "Male", "No", 2, 0,"pallavi"),
                new EmployeeDatabase("Masters", 2012, "Bangalore", 1, 45, "Female", "Yes", 10, 1,"shila"),
                new EmployeeDatabase("PhD", 2015, "Mumbai", 2, 41, "Male", "No", 7, 1,"munni"),
                new EmployeeDatabase("Bachelors", 2018, "Hyderabad", 3, 25, "Female", "No", 1, 0,"sunni"),
                new EmployeeDatabase("Masters", 2019, "Bangalore", 2, 26, "Male", "No", 3, 0,"guni"),
                new EmployeeDatabase("Bachelors", 2020, "Chennai", 3, 24, "Female", "Yes", 2, 1,"asha"),
                new EmployeeDatabase("Bachelors", 2021, "Pune", 2, 23, "Male", "No", 1, 0,"shobha"),
                new EmployeeDatabase("Masters", 2015, "Noida", 3, 39, "Female", "No", 8, 1,"maria"),
                new EmployeeDatabase("Bachelors", 2013, "Kolkata", 1, 36, "Male", "Yes", 4, 0,"loa"),
                new EmployeeDatabase("Masters", 2016, "Ahmedabad", 2, 32, "Male", "No", 5, 1,"leo"),
                new EmployeeDatabase("Bachelors", 2017, "Delhi", 3, 28, "Female", "No", 3, 0,"paula")
        );


    }
}
