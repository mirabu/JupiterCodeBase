package String;

public class Permutation {
    public static void main(String[] args) {
        String slogan= "Manchester united is my fav team";
        String newSlogan= slogan.replace(" ","");
        char[] sloganChar = newSlogan.toLowerCase().toCharArray();
        System.out.println(newSlogan);

        String[] newSlogan1=slogan.split(" ");
        for(String n:newSlogan1){
            System.out.println(n);
        }


    }
}
