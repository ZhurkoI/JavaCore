package main.java.com.igor.javacore.chapter08;

class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    double area() {
        System.out.println("Area is undefined");
        return 0;
    }
}
