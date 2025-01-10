package String;


// this is correct code
public class StringCompAlgo {
    public static void main(String[] args) {
        String name ="aabbcddddddd";
        String encryptedName = compressionAlgorithm(name);
        System.out.println(encryptedName);

    }

    private static String compressionAlgorithm(String name) {
        int count=1;
        StringBuilder compString =new StringBuilder();

        for (int i=1;i<name.length();i++){

            if (name.charAt(i)==name.charAt(i-1)){
                count++;
            }else{
                compString.append(name.charAt(i-1));
                compString.append(count);
                count=1;
            }

        }

        compString.append(name.charAt(name.length()-1));
        compString.append(count);

        return compString.toString();
    }
}
