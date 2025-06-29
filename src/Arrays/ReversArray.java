package Arrays;

public class ReversArray {
    public static void main(String[] args) {
        int newArray[] = {1,2,3,4,5,6,7,8,10,11};

        System.out.println("Using for loop : ");
        for (int i=newArray.length-1;i>=0;i--){
            System.out.print(newArray[i]+" ");
        }
        System.out.println();
        System.out.println("********");
        System.out.println("Using while loop : ");
        int right= newArray.length-1;
        while (right >=0 ){
            System.out.print(newArray[right]+" ");
            right--;
        }
    }
}
