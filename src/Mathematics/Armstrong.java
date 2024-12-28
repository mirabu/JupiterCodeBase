package Mathematics;

public class Armstrong {
    public static void main(String[] args) {
        int number = 153;
        System.out.println(number%10);
        System.out.println(number/10);

        int sum=0,temp, res;

        temp= number;
        while (number>0){
            res = number%10;
            number=number/10;
            sum = sum +(res * res * res );
        }

        if (temp==sum){
            System.out.println(temp+"is armstrong number");
        }else{
            System.out.println(temp+"s not armstrong number");
        }

    }
}
