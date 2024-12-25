package Arrays;

public class FactorialNumber {
    public static void main(String[] args) {
        int number= 10;
        int result = factosOfNumber(number);
        System.out.println(result);
    }

    private static int factosOfNumber(int number) {
        if(number!=0){
            return number * factosOfNumber(number-1);

        }else{
           return 1;
        }
    }
}
