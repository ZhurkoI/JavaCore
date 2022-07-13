package main.java.com.igor.javacore.chapter05;

public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("Goes before 'break' operator.");
                    if (t) break second;
                    System.out.println("This operator will not be executed.");
                }
                System.out.println("This operator will not be executed.");
            }
            System.out.println("This operator goes after the block 'second'.");
        }
    }
}
