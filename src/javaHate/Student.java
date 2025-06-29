package javaHate;

class Student {
    int marks;
    int age;
    String name;

    Student(int marks, int age, String name) {
        this.marks = marks;
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return name + " - Marks: " + marks + ", Age: " + age;
    }
}
