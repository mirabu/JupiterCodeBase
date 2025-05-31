package ObjectOriented;


class Bull implements Animal{


    @Override
    public void eat() {

    }

    @Override
    public void walk() {

    }

    @Override
    public void behaviour() {
        System.out.println("My behaviour ");
    }

}

class Earth extends Galaxy{

    Earth(int a, int b) {
        super(a, b);
    }

    @Override
    int addition() {
        return 5;
    }

    @Override
    int subtraction() {
        return 6;
    }

}


public class Mammel {
    public static void main(String[] args) {
     Bull bull=new Bull();
     bull.behaviour();
     Animal.myLand();

     Earth earth=new Earth(2,3);
        System.out.println(earth.addition());



    }
}