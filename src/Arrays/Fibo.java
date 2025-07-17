package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        System.out.println("Factorial of 5 is: " + fact(5)); // Output: 120
        System.out.println("Factorial of 6 is: " + fact(10)); // Reuses fact(5)


        for (var data : memo.entrySet()) {
            System.out.println(data.getKey() + " = " + data.getValue());
        }
    }
    static Map<Integer, Long> memo = new HashMap<>();
    private static Long fact(int number) {
        if (number <= 1) return 1L;

        if (memo.containsKey(number)) return memo.get(number);

        long result = number * fact(number - 1);
        memo.put(number, result);
        return result;
    }
}
