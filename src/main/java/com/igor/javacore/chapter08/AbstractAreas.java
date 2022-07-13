package main.java.com.igor.javacore.chapter08;

public class AbstractAreas {

    public static void main(String[] args) {
        // Figure2 f = new Figure2(10, 10); // illegal
        Rectangle2 r = new Rectangle2(9, 5);
        Triangle2 t = new Triangle2(10, 8);
        Figure2 figref; // this is OK, no object is created
        Object obj;
        obj = r;

        figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Area is " + figref.area());
    }
}
