package main.java.com.igor.javacore.chapter05;

public class Return {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("Before RETURN operator.");

        if (t) return;

        System.out.println("This operator cannot be reached");
    }
}
