package main.java.com.igor.javacore.chapter05;

public class NoBody {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;
        while (++i < --j) ;     // there is no body in the WHILE loop
        System.out.println("Average value equals: " + i);
    }
}
