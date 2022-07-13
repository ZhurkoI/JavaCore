package main.java.com.igor.javacore.chapter08;

class Triangle2 extends Figure2 {

    Triangle2(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}
