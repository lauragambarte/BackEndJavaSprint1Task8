package nivel2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Jordi");
        names.add("Joan");
        names.add("Mercedes");
        names.add("Apu");
        names.add("Pau");
        names.add("Andreu");
        names.add("Antoni");
        names.add("Ana");
        System.out.println(namesWithFilters(names));
    }
   public static List<String> namesWithFilters(List<String> names){
        return names.stream()
                //charat(0) will be a char, that is a primitive type so I can compare using == to another char by using ´A´
                .filter(n->n.charAt(0)=='A'&&n.length()==3)
                .toList();
    }
}
