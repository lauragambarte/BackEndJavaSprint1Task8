package nivel2.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(2);
        numbers.add(10);
        numbers.add(13);
        numbers.add(16);
        numbers.add(33);
        numbers.add(67);
        System.out.println(EvenOdd(numbers));
    }
   // .filter takes a lambda and removes elements from the stream where the lambda returns false
   // .map takes a lambda and runs that lambda on each element in the stream & the output is a new stream with the result of the lambda
    // applied in each element
    public static String EvenOdd(List<Integer> numbers){
        return numbers.stream()
                //map converts stream of integers to a stream of strings
                .map(n->n%2==0?"e"+n:"o"+n)
                .collect(Collectors.joining(", "));

    }
}
