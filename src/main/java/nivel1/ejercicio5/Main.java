package nivel1.ejercicio5;

public class Main {
    public static void main(String[] args) {


        //instance of the interface is the lambda expression.
        PiSupplier piSupplier = () -> 3.1415;
        System.out.println(piSupplier.getPiValue());
    }
}