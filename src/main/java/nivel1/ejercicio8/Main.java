package nivel1.ejercicio8;

public class Main {
    public static void main(String[] args) {
        ReverseFunction reverseFunction=str -> {
            //stringbuffer to change the order the string
            StringBuffer rts = new StringBuffer(str);
            rts.reverse();
            return rts.toString();
        };
        //three diff commands: WE NEED {} otherwise for one command we don't need {} like ex 7.
        //if the interface returns string then the lambda that implements the interface has to have RETURN.
        //call the method reverse of the instance of the interface reversefunction that we created using lambda above.
        //functional interface can only have one method.
        System.out.println(reverseFunction.reverse("Laura"));

    }
}
