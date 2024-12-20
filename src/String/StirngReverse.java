package String;

public class StirngReverse {
    public static void main(String[] args) {
        String country ="Germany";
        char coutryChar[]=country.toCharArray();
        StringBuilder stringBuilder=new StringBuilder();

        for (int i=coutryChar.length-1; i>=0;i--){
            stringBuilder.append(coutryChar[i]);

        }
        System.out.println(stringBuilder.toString());
    }
}
