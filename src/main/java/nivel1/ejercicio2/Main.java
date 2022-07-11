package nivel1.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        List<String> cities = new ArrayList<>();
        cities.add("Oslo");
        cities.add("Moscow");
        cities.add("Estocolmo");
        cities.add("Paris");
        cities.add("Roma");
        cities.add("Bogotá");
        cities.add("Praga");
        cities.add("Londres");
        System.out.println(citiesWithO(cities));

    }

    public static List<String> citiesWithO(List<String> cities) {
        //FILTER METHOD: ALLOWS ME TO PICK A STREAM OF ELEMENTS THAT ACCOMPLISH A PREDICATE(TAKES ONE INPUT & RETURN T O F.
//I create a stream with all the objects of a list:  Stream<String> streamVariable = list.stream()
        Stream<String> streamVariable = cities.stream();
        //Stream<String> filteredCitiesWithO = streamVariable.filter(element -> element.contains("o")).filter(city -> city.length() > 5);
        Stream<String> filteredCitiesWithO = streamVariable.filter(element -> element.contains("o") && element.length() > 5);
        //I convert the stream into a list to obtain the values needed for RETURN.
        return filteredCitiesWithO.toList();
    }
}

