package Arrays;

public class PatternStar {
    public static void main(String[] args) {
        for (int i=0; i<=5 ;i++){
            for (int j=0; j<=5 ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("***********************************");
        System.out.println();
        for (int i=1; i<=5 ;i++){
            for (int j=1; j<= i ; j++){
                System.out.print("* ");
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i=1; i<=5 ;i++){
            for (char ch='a'; ch < 'a'+i ; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }


    }
}
