package String;

public class PossibleProbality {
    public static void main(String[] args) {

        String title="abcd";
        probability(title,"",0);

    }

    private static void probability(String title, String perm, int index) {

        if(title.length()==0){
            System.out.print(title+" ");
            return;
        }

        String name=" ";
        for (int i=0;i<title.length();i++){
            char chars =title.charAt(i);
            // name= title.substring(0,3);
            name =title.substring(0,i)+title.substring(i+1);
            probability(name,perm+chars,index+1);
        }
        System.out.print(name);
    }
}
