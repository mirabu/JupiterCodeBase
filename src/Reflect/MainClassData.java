package Reflect;

import java.lang.reflect.Field;

public class MainClassData {
    public static void main(String[] args) {

        Student student=new Student();
        student.setStudentId(1);
        student.setAge(23);
        student.setCourse("java");
        student.setEmail("infosys.com");
        student.setEnrolled(true);
        student.setGender("male");
        student.setFirstName("Jugal");
        student.setLastName("Badgujar");
        student.setPhoneNumber("1234567585");

        Field[] catFields = student.getClass().getDeclaredFields();

        for (Field field: catFields){
            System.out.println(field.getName());
        }



    }
}
