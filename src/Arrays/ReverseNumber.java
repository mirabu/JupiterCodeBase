package Arrays;

public class ReverseNumber {
    public static void main(String[] args) {
//https://youtu.be/4dkCxpEn2Rc?si=jXPMAAoN9W4YMYzM
        int number=12345;
        int rev = 0;

        while (number !=0){
            int digit = number%10;
            rev =rev*10+digit;
            number=number/10;
        }
        System.out.println(rev);

    }
}
