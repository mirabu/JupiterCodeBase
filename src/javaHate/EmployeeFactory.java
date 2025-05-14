package javaHate;


import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeFactory {
    private static final String[] FIRST_NAMES = {
            "Alice", "Bob", "Carol", "David", "Eva",
            "Frank", "Grace", "Hank", "Ivy", "Jack",
            "Kathy", "Leo", "Mona", "Nathan", "Olivia",
            "Paul", "Quinn", "Rachel", "Steve", "Tracy",
            "Uma", "Vince", "Wendy", "Xavier", "Yara", "Zack"
    };
    private static final String[] DEPARTMENTS = {
            "HR", "Finance", "IT", "Sales", "Marketing", "Operations"
    };
    private static final Random rnd = new Random();

    public static List<Employee> create50Employees() {
        LocalDate startDate = LocalDate.now().minusYears(10);
        long startEpochDay = startDate.toEpochDay();
        long todayEpochDay = LocalDate.now().toEpochDay();

        return IntStream.rangeClosed(1, 50)
                .mapToObj(id -> {
                    String name = FIRST_NAMES[rnd.nextInt(FIRST_NAMES.length)]
                            + " " + (char)('A' + rnd.nextInt(26)) + ".";
                    int age = 21 + rnd.nextInt(40); // 21–60
                    String dept = DEPARTMENTS[rnd.nextInt(DEPARTMENTS.length)];
                    double salary = 30_000 + rnd.nextDouble() * 70_000; // 30k–100k
                    long randomDay = startEpochDay + rnd.nextLong() % (todayEpochDay - startEpochDay + 1);
                    LocalDate joiningDate = LocalDate.ofEpochDay(randomDay);

                    return new Employee(id, name, age, dept, salary, joiningDate);
                })
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Employee> employees = create50Employees();
        employees.forEach(System.out::println);
    }
}
