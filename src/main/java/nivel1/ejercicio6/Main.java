package nivel1.ejercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Crea una lista con números y cadenas de texto y ordena la lista con las cadenas de más corta a más larga.
public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        stringList.add("2");
        stringList.add("30");
        stringList.add("casa");
        stringList.add("departamento");
        stringList.add("rinoceronte");
        stringList.add("alce");
        //https://mkyong.com/java8/java-8-lambda-comparator-example/
        //comparing two strings by comparing the ints (longitud de cada string)
        Comparator<String> byLength=(String o1, String o2)->o1.length()-o2.length();
       Collections.sort(stringList,byLength);
        System.out.println(stringList);


    }
}