package String;

public class RecPalidrom {
    public static void main(String[] args) {
        String name= "Naman";
        recursivePalidrom(name);
        
    }

    private static void recursivePalidrom(String name) {
        name=name.toLowerCase();
        char[] chars=name.toCharArray();

    }
}
