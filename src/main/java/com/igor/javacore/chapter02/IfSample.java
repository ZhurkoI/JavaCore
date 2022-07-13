package main.java.com.igor.javacore.chapter02;

public class IfSample {
    public static void main(String[] args) {
        int x, y;

        x = 10;
        y = 20;

        if (x < y) System.out.println("x is less than y");

        x = x * 2;
        if (x == y) System.out.println("Now x equals y");

        x = x * 2;
        if (x > y) System.out.println("Now x is greater than y");

        // Operator doesn't print anything
        if (x == y) System.out.println("You won't see this");
    }
}
