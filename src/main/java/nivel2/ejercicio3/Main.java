package nivel2.ejercicio3;

public class Main {
    public static void main(String[] args) {
        //creating a lambda in this way we are creating an object of type operation and the lambda implements the only method in the
        //funcional interface. 4 diff objects of type Operation and each has diff implementation of method operation.
        //the implementation is the lambda
        Operation suma=(n1, n2)->n1+n2;
        Operation resta=(n1,n2)->n1-n2;
        Operation multi=(n1, n2) -> n1*n2;
        Operation divi=(n1, n2) -> n1/n2;
        System.out.println(resta.operation(7,3));
        System.out.println(suma.operation(4,6));
        System.out.println(multi.operation(22,3));
        System.out.println(divi.operation(6,3));
    }
}
