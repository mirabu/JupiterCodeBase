package Collections;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailsData {
    public static void main(String[] args) {


        CopyOnWriteArrayList<Integer> intData = new CopyOnWriteArrayList<>();
        intData.add(10);
        intData.add(20);
        intData.add(30);
        intData.add(40);
        intData.add(50);

        System.out.println("Fail Safe...");
        for (var num: intData){
            if (num.equals(40)){
                intData.remove(num);

            }

        }
        System.out.print(intData+" ");








    }
}
