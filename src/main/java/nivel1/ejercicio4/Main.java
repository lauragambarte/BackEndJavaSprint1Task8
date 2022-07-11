package nivel1.ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> monthsYear = new ArrayList<String>();
        monthsYear.add("January");
        monthsYear.add("February");
        monthsYear.add("March");
        monthsYear.add("April");
        monthsYear.add("May");
        monthsYear.add("June");
        monthsYear.add("July");
        monthsYear.add("August");
        monthsYear.add("September");
        monthsYear.add("October");
        monthsYear.add("November");
        monthsYear.add("December");
        //using the interface Consumer that takes one parameter as input and returns void.
        //Consumer<String>: variable type
        //lambda: (n) -> { System.out.println(n) is stored in a variable
        Consumer<String> method = (n) -> { System.out.println(n); };
        monthsYear.forEach( method );
    }
}
