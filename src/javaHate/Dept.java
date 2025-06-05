package javaHate;

public interface Dept {
    default void balance(){
        System.out.println("Dept balance...");
    }
}
