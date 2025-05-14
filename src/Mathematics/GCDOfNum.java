package Mathematics;

public class GCDOfNum {
    public static void main(String[] args) {

        int a=12;
        int b=15;
        int num = gcdData(a,b);
        System.out.println(num);
    }

    private static int gcdData(int a, int b) {
        if (b==0) return a;
        return gcdData(b,a%b);
    }
}
