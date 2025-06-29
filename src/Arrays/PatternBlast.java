package Arrays;

public class PatternBlast {

    private static void OrderStar(int rows) {
        for (int i= 1 ;i<= rows;i++){
            for (int j=1; j<= i ; j++){
                System.out.print("* ");
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
    private static void reverOrderStar(int rows) {
        for (int i= rows ; i >= 1;i--){
            for (int j=i; j >=1;j--){
                System.out.print(j+" ");
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void OrderAllRowStar(int rows) {
        for (int i= 1 ;i<= rows;i++){
            for (int j=1; j<= i ; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    private static void reverAllRowOrderStar(int rows) {
        for (int i= rows ; i >= 1;i--){
            for (int j=i; j >=1;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    private static void spaceStarSpace(int rows) {

        for (int i=0; i< rows; i++){

            //space
            for (int j= 0 ;j< rows-i-1; j++ ){
                System.out.print(" ");
            }

            //star
            for (int j=0; j< 2*i+1;j++){
                System.out.print("*");
            }

            //space
            for (int j= 0 ;j< rows-i-1; j++ ){
                    System.out.print(" ");
                }

            System.out.println();

        }
    }
    private static void spaceNumberSpace(int rows) {

        for (int i=0; i< rows; i++){

            //space
            for (int j= 0 ;j< rows-i-1; j++ ){
                System.out.print(" ");
            }

            //star
            for (int j=0; j< 2*i+1;j++){
                System.out.print(j);
            }

            //space
            for (int j= 0 ;j< rows-i-1; j++ ){
                System.out.print(" ");
            }

            System.out.println();

        }
    }
    private static void spaceStarSpaceReverse(int rows) {

        for (int i=0; i< rows; i++){

            //space
            for (int j=0  ;j< i; j++ ){
                System.out.print(" ");
            }

            //star
            for (int j=0; j< 2*(rows-i)-1;j++){
                System.out.print("*");
            }

            //space
            for (int j= 0 ;j< i; j++ ){
                System.out.print(" ");
            }

            System.out.println();

        }
    }

    private static void charPyramid(int rows){
        for (int i= 1 ; i<=rows ; i++ ){
            for (char ch='a' ; ch < 'a'+i; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }


    }


    public static void main(String[] args) {
        int rows = 5;
        OrderStar(rows);
        System.out.println();
        OrderAllRowStar(rows);
        System.out.println();
        reverOrderStar(rows);
        System.out.println();
        reverAllRowOrderStar(rows);
        System.out.println();
        spaceStarSpace(rows);
        System.out.println();
        spaceNumberSpace(rows);
        System.out.println();
        spaceStarSpaceReverse(rows);
        System.out.println();
        System.out.println("character pyramid :");
        charPyramid(rows);




    }




}
