package DesignPattern;

public class SinglePattern {


    private static SinglePattern instance;

    private SinglePattern() {
        System.out.println("Singleton instance created!");
    }


    public static SinglePattern getInstance() {
        if (instance==null){
            instance = new SinglePattern();
        }
        return  instance;

    }
}


//avoid to breaking singelton in java
// enum, use synchronized

//break singleton functionalty through
// cloning, deserialization , reflection

