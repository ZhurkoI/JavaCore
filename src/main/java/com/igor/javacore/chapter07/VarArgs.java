package main.java.com.igor.javacore.chapter07;


/**
 * Class to demonstrate an approach to pass into a method different numbers of arguments via 'varargs'
 * (starting with JDK 5)
 */
class VarArgs {

    static void vaTest(int... v) {
        System.out.println("Number of arguments is " + v.length + ". Content: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        /* Method vaTest() can be invoked with any number of parameters. These parameters are put into the array
         * under the hood.
         */
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest(); // no arguments
    }
}
