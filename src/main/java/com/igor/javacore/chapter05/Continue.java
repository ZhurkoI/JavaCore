package main.java.com.igor.javacore.chapter05;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) continue;  // goes to the end of current iteration of the FOR loop
            System.out.println("");
        }
    }
}
