package nivel1.ejercicio7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//Amb la llista de l’exercici anterior, ara ordena-la al revés, de cadena més llarga a més curta.
public class Main {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<String>();
        stringList.add("2");
        stringList.add("30");
        stringList.add("casa");
        stringList.add("departamento");
        stringList.add("rinoceronte");
        stringList.add("gat");
        stringList.add("alce");

        //comparing two strings by comparing the ints (longitud de cada string)
        //variable (String o1, String o2) -> o1.length() - o2.length();
        //Comparator functional interface that has a single fx, takes two parameters of type T and ALWAYS returns INT
        //1.Create a comparator
      Comparator<String> byLength = (String o1, String o2) -> o2.length() - o1.length();
      //2. Sort the list using the comparator in the variable by length.
        Collections.sort(stringList,byLength);
        //Collections.reverse(stringList); SIRVE PARA ORDENAR SEGUN EL ORDEN DE INSERCION EN LA LISTA
        System.out.println(stringList);


    }
}