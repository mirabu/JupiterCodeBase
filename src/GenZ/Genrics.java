package GenZ;

import javax.swing.*;

class Country<T,U>{

    T obj1;
    U obj2;



    public Country(T i, U england) {
        this.obj1=i;
        this.obj2=england;
    }

    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }

}




public class Genrics {
    public static void main(String[] args) {
       Country<Integer,String> country = new Country<Integer,String>(1,"England");
       country.print();


    }
}
