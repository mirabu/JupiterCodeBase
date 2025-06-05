package javaHate;

public interface Investment {

    default void balance(){
        System.out.println("investment balance...");
    }
}
