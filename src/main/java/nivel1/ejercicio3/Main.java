package nivel1.ejercicio3;

import java.util.ArrayList;
import java.util.List;

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
        monthsYear.forEach(n->
            System.out.println(n));
    }
}
