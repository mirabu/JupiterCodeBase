package Mathematics;

public class Vowels {
    public static void main(String[] args) {

        //String name="Jugal";
        String name="Tv";
        boolean vow = vowelsPresent(name);
        System.out.println(vow);
    }

    private static boolean vowelsPresent(String name) {
        return name.toLowerCase().matches(".*[aeiou].*");
    }
}
