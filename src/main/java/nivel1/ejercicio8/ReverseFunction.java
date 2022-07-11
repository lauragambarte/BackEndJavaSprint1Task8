package nivel1.ejercicio8;
//Crea una Functional Interface que contingui un mètode anomenat reverse(). Aquest mètode ha de rebre i ha de retornar un String.
@FunctionalInterface
public interface ReverseFunction {
    public String reverse(String str);
}
