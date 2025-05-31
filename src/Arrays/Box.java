package Arrays;

public class Box {
    public static void main(String[] args) {
        System.out.println(sumOfNumbers(10,20));
        System.out.println(sumOfNumbers(10,20,3));
        System.out.println(sumOfNumbers(10,20,5,6));
        System.out.println(sumOfNumbers(10,20,7,8,9,5));
        System.out.println(sumOfNumbers(10,20,1,2,3,4,5,6,7,8,9));

    }

    private static int sumOfNumbers(int ...numbers) {
       int sum=0;
       for (var data:numbers){
           sum=sum+data;
       }

       return sum;
    }
}
