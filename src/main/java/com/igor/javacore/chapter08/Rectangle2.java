package main.java.com.igor.javacore.chapter08;

class Rectangle2 extends Figure2 {

    Rectangle2(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}
