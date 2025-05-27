package GenZ;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        int[] array = {5, -2, 10, 3, -7, 5, 8, 1, 0, 4,5,4,4};
        char[] charArray = {'A', 'b', '#', 'Z', 'y', 'a', '@', 'M', 'p', 'Q'};
        String str = "Hello1234!";
        String[] stringArray = {"apple", "banana", "cherry", "date", "elder", "fig", "grape", "honey", "ice", "jam"};


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(12, 7, 3, 12, 9, 4, 6, 3, 15, 8));
        HashSet<Integer> hashSet=new HashSet<>();
        Stack<Integer> stack=new Stack<>();


        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 22);
        map.put("David", 35);
        map.put("Eve", 28);
        map.put("Frank", 40);
        map.put("Grace", 27);
        map.put("Hannah", 33);
        map.put("Ian", 29);
        map.put("Jane", 31);


        var newArr = Arrays.stream(array).sorted().toArray();

        for ( var data : newArr){
            hashSet.add(data);
            stack.push(data);
        }


        boolean check = checkNumbers(array,5);
        System.out.println(stack);
        System.out.println(hashSet);
        System.out.println(check);

    }

    private static boolean checkNumbers(int[] arr, int num) {
        Stack<Integer> stack=new Stack<>();
        for (int data:arr){
            stack.push(data);
        }

        if (stack.contains(num)) return true;
        else return false;

    }
}
