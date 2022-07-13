package main.java.com.igor.javacore.chapter08;

class Triangle extends Figure {

    public Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside triangle");
        return dim1 * dim2 / 2;
    }
}
