package ObjectOriented;

public interface Animal {
    void eat();
    void walk();
    void behaviour();

    static void myLand(){
        System.out.println("static method of animal in interface..");
    }
}
