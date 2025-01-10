package Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Zomato{
    private String name=null;

    Zomato(String name){
        this.name=name;
    }

    private String nameOfTeam(String name){
        return name;

    }
}

public class ReflectClass {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Zomato zomato = new Zomato("Jugal");
        Field field =zomato.getClass().getDeclaredField("name");
        field.setAccessible(true);

        Method reflectMethod = zomato.getClass().getDeclaredMethod("nameOfTeam", String.class);
        reflectMethod.setAccessible(true);

        String returnName = (String) reflectMethod.invoke(zomato,null);
        System.out.println(returnName);


    }
}
