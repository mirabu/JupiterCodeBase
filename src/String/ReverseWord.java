package String;

public class ReverseWord {
    public static void main(String[] args) {
        String slogan= "Manchester united is my fav team";
        String[] sloganArray=slogan.split(" ");
        for (String words: sloganArray){
            System.out.print(words+" ");
        }
        System.out.println("****");
        for (int i= sloganArray.length-1;i>=0; i--){
            System.out.print(sloganArray[i]+" ");
        }
    }
}
