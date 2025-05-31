package String;

public class MiddleChar {
    public static void main(String[] args) {
        String team = "testr";
        String middleElements = findMiddle(team);
        System.out.println(middleElements);


    }

    private static String findMiddle(String team) {
        int left =0;
        int length=team.length();
        int middle = length/2;

        if (length % 2 ==0 ){
            return team.substring(middle-1,middle+1);

        }else{
            return team.substring(middle,middle+1);
        }

    }
}
