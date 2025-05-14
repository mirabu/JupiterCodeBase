package javaHate;


import java.time.LocalDate;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private double salary;
    private LocalDate joiningDate;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }


    public Employee(int id, String name, int age,
                    String department, double salary,
                    LocalDate joiningDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    public Employee() {

    }

    @Override
    public String toString() {
        return String.format("Employee{id=%d, name='%s', age=%d, dept='%s', salary=%.2f, joined=%s}",
                id, name, age, department, salary, joiningDate);
    }

    // getters, setters, toString()...
}

