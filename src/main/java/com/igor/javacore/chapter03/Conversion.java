package main.java.com.igor.javacore.chapter03;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("Conversion INT to BYTE.");
        b = (byte) i;
        System.out.println("i & b: " + i + " " + b);

        System.out.println("Convert DOUBLE to INT:");
        i = (int) d;
        System.out.println("d & i: " + d + " " + i);

        System.out.println("Convert DOUBLE to BYTE:");
        b = (byte) d;
        System.out.println("d & b: " + d + " " + b);
    }
}
