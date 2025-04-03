package LoveBabber.Arrayy;

public class ReverseArray {
    public static void main(String[] args) {
        String[] arr={"a","b","c","d","e","f"};
        String[] reverseArray = reversArrayFunction(arr);
        for (String stringData : reverseArray){
            System.out.print(stringData.toString()+" ");
        }
    }

    private static String[] reversArrayFunction(String[] arr) {
        String[] newArr=new String[arr.length];
        for(int i=0;i< arr.length;i++){
            newArr[i]=arr[arr.length-1-i];
        }
        return newArr;
    }
}
