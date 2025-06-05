package Collections;

import javaHate.EmployeeDatabase;
import javaHate.EmployeeFactory;

import java.util.Collections;

public class ComComparat {
    public static void main(String[] args) {
     //   Collections.sort(EmployeeFactory.getSampleEmployees());

        for (EmployeeDatabase database : EmployeeFactory.getSampleEmployees()){
            System.out.println(database);
        }
    }
}
