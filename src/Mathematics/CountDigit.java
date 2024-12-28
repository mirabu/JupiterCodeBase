package Mathematics;

public class CountDigit {
    public static void main(String[] args) {
        int number =1236563742;
        StringBuilder stringBuilder = new StringBuilder();
        String numString = stringBuilder.append(number).toString();

        char[] chars = numString.toCharArray();

        int numberOfDigit = chars.length;
        System.out.println("Digit of given number : "+ numberOfDigit);



    }
}
