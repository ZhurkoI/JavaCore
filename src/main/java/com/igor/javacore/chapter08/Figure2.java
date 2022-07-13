package main.java.com.igor.javacore.chapter08;

abstract class Figure2 {
    double dim1;
    double dim2;

    Figure2(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}
