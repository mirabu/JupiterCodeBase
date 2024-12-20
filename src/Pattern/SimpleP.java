package Pattern;

public class SimpleP {
    public static void main(String[] args) {

        int n=5;
        pattern1(n);
        System.out.println();
        pattern2(n);
        System.out.println();
        pattern3(n);
        System.out.println();
        pattern4(n);
        System.out.println();
        pattern6(n);
        System.out.println();
        PyramidPattern(n);





    }

    private static void PyramidPattern(int n) {
        for (int i=0;i<n;i++){
             //space
             for (int j=0;j<n-i+1;j++){
                 System.out.print(" ");
             }

             //data
             for (int j=0;j<2*i+1;j++){
                 System.out.print("*");
             }

             //space
             for (int j=0;j<n-i+1;j++){
                 System.out.print(" ");
             }
            System.out.println();

        }
    }

    private static void pattern6(int n) {
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private static void pattern3(int n) {

        System.out.println();
        for (int i2=0;i2<4;i2++){
            for (int j=0;j<=i2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern2(int n) {
        for (int i1=0;i1<4;i1++){
            for (int j=i1+1;j<=4;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void pattern1(int n){
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern4(int n) {
        for (int i2=1;i2<=n;i2++){
            for (int j=1;j<=i2;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
