package Arrays;

public class PalidromStringTwoPointer {
    public static void main(String[] args) {
        String fname="jugjdjd";
        char[] nameArray = fname.toCharArray();
        int left=0; int right =fname.length()-1;
        boolean isPalid=true;
        while (left < right){
            if (nameArray[left] != nameArray[right]){
                isPalid = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalid){
            System.out.println("its palidrom");
        }else {
            System.out.println("not");
        }
    }
}
