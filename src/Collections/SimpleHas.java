package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class SimpleHas {
    public static void main(String[] args) {

        List<Integer> array= Arrays.asList(1,2,3,4,5,5,6,4,5,3,4,4,4,6,4,5,3,3,2,32,2,5,4,6,6,4);

        System.out.println();
        System.out.println("Arraylist Data: ");

        for (int i=0;i<5;i++){
            System.out.print(array.get(i)+" ");
        }


        System.out.println();

        HashSet<Integer> hashSet=new HashSet<>(array);
        System.out.println("HashsetData : ");
        for (var data : hashSet){
            System.out.print(data+" ");
        }
        System.out.println();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(array);

        System.out.println("LinkedHashsetData : ");
        for (var data: linkedHashSet){
            System.out.print(data+" ");
        }

    }
}
