package main.java.com.igor.javacore.chapter03;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        if (b) System.out.println("This code executes");
        b = false;
        if (b) System.out.println("This code doesn't execute");

        System.out.println("10 > 9 statement is " + (10 > 9));
    }
}
