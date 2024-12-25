package Mathematics;

public class ReverseNumber {
    public static void main(String[] args) {
        int number=123456789;
        StringBuilder stringBuilder=new StringBuilder();
        String numberIntoInt = String.valueOf(number);
        //System.out.println(numberIntoInt);

        stringBuilder.append(numberIntoInt);
        stringBuilder.reverse();


        int reverseInteger = Integer.parseInt(stringBuilder.toString());
        System.out.println(reverseInteger);




    }
}
