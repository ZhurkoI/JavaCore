package main.java.com.igor.javacore.chapter08;

class Rectangle extends Figure {

    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside rectangle.");
        return dim1 * dim2;
    }
}
