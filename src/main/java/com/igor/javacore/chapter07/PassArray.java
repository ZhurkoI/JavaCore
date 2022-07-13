package main.java.com.igor.javacore.chapter07;


/**
 * Class to demonstrate an approach to pass into a method different numbers of arguments via an array
 * (prior to JDK 5)
 * */
class PassArray {

    static void vaTest(int v[]) {
        System.out.println("Number of arguments is " + v.length + ". Content: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int n1[] = {10};
        int n2[] = {1, 2, 3};
        int n3[] = {};

        vaTest(n1);
        vaTest(n2);
        vaTest(n3);
    }
}
