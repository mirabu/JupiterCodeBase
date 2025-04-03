package DSADaysCode;

public class PrimeCheck {
    public static void main(String[] args) {
        int number=14;
        boolean result= checkPrime(number);
        System.out.println(result);
    }


    //primeNumber formula 6*n+1 exception only for 5 multiple
    private static boolean checkPrime(int number) {
        if (number % 2 ==0 || number % 3 ==0 || number % 5 ==0 || number % 7 ==0){
            return false;
        }
        return true;
    }
}
