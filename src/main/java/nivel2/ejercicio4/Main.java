package nivel2.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cadenas = new ArrayList<>();
        cadenas.add("789");
        cadenas.add("Laura");
        cadenas.add("elefante");
        cadenas.add("30");
        cadenas.add("entrada");
        cadenas.stream()
                //stream of strings
                //charat0 result is a character ordered by ASCII: numbers, UPP letter, LOWER letters.
                .sorted((s1, s2) -> s1.toLowerCase().charAt(0) - s2.toLowerCase().charAt(0))
                //for each ordered expects a String consumer, a method that takes a String and returns void like println sout::methodname(println)
                .forEachOrdered(System.out::println);
        System.out.println("---------------------------");
        cadenas.stream()
//sorted needs to parameters s1,s2. Ternary condition(x==x1)?true:false;
                .sorted((s1, s2) -> s1.toLowerCase().contains("e") ? -1 : 1)
                .forEachOrdered(System.out::println);
        System.out.println("---------------------------");
        cadenas.stream()
                .map(s1 -> s1.replace('a', '4'))
                .forEachOrdered(System.out::println);//takes the function println as a parameter and runs the fx printing on each element in the stream
        System.out.println("---------------------------");
        //predicate:method that takes (a String, parameter, etc) and returns T o F.


        cadenas.stream()
                //filter will save what is true and create a new stream out of it.
                //before intelliJ:.filter(s->isInteger(s))
                //after:METHOD REFERENCE IS BOTH:Main(class)::isInteger(method name) (Main::isInteger)
                .filter(s -> isInteger(s))
                .forEach(System.out::println);
    }

    public static boolean isInteger(String s) {
        try {
            int number = Integer.parseInt(s);
            return true;
        }
        //if the string cant be converted to an integer
        catch (NumberFormatException ex) {
            return false;
        }

    }
}