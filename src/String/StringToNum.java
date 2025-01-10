package String;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringToNum {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in) ;
        System.out.println("Enter Number :");
        String numberData = scanner.nextLine();

        int number = numberConversion(numberData);
        System.out.println(number);

    }

    private static int numberConversion(String numberData) {

        Map<String,Integer> doubleDigit=new HashMap<>();
        doubleDigit.put("ten",10);
        doubleDigit.put("twenty",20);
        doubleDigit.put("thirty",30);
        doubleDigit.put("fourty",40);
        doubleDigit.put("fifty",50);
        doubleDigit.put("sixty",60);
        doubleDigit.put("seventy",70);
        doubleDigit.put("eighty",80);
        doubleDigit.put("ninety",90);
        doubleDigit.put("hundrade",100);

        Map<String,Integer> integerMap = new HashMap<>();
        integerMap.put("one",1);
        integerMap.put("two",2);
        integerMap.put("three",3);
        integerMap.put("four",4);
        integerMap.put("five",5);
        integerMap.put("six",6);
        integerMap.put("seven",7);
        integerMap.put("eight",8);
        integerMap.put("nine",9);

        int resultNum=0;

        String[] numData = numberData.toLowerCase().split(" ");
        for (String string : numData){
            System.out.print(string+" ");
        }

        System.out.println();
        for (String words : numData){
            if (doubleDigit.containsKey(words)){
                resultNum =resultNum+ doubleDigit.get(words);
            } else if (integerMap.containsKey(words)) {
                resultNum=resultNum+integerMap.get(words);
            }else {
                System.out.println("Invalid Input : ");
                return -1;
            }
        }




        return  resultNum;

    }
}
