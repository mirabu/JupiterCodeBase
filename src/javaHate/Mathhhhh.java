package javaHate;

public class Mathhhhh {
    public static void main(String[] args) {
        double epsilon = 1e-9;
        System.out.println(Math.abs(0.1*2 - 0.2) < epsilon);
        System.out.println(Math.abs(0.1*3 - 0.3) < epsilon);
        System.out.println(Math.abs(0.1*4 - 0.4) < epsilon);
        System.out.println(Math.abs(0.1*5 - 0.5) < epsilon);
        System.out.println(Math.abs(0.1*6 - 0.6) < epsilon);
        System.out.println(epsilon);

        System.out.println(1.0/0.0);
        String name= String.valueOf(1.0/0.0);
        System.out.println("my name is: "+name);


    }
}
