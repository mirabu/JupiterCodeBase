package DSADaysCode;

import java.util.ArrayList;
import java.util.List;

public class primeNumbers {

    //primeNumber formula 6*n+1 exception only for 5 multiple
    private static boolean checkPrime(int number) {
        if (number % 2 ==0 || number % 3 ==0 || number % 5 ==0 || number % 7 ==0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] firstRange={2,3,5,7};
        List<Integer> integerList=new ArrayList<>();

        for (int firstPrimes  :firstRange){
            integerList.add(firstPrimes);
        }
        for(int i=10;i<=100;i++){
            if (checkPrime(i)){
                integerList.add(i);
            }
        }


        System.out.println(integerList);


    }
}
