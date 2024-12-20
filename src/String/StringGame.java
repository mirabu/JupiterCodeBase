package String;

public class StringGame {
    public static void main(String[] args) {
        String name="Jugal";
        String name2="Jugal";
        String name3="Jugal";

        System.out.println(name==name2);
        System.out.println(name2==name3);


        String city1 = new String("London");
        String city2 = new String("London");
        String city3= new String("Jugal");

        System.out.println(city1==city2);
        System.out.println(city3==name3);
        System.out.println(city3.equals(name3));
    }
}
