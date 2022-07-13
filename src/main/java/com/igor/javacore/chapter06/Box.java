package main.java.com.igor.javacore.chapter06;

class Box {
    double width;
    double height;
    double depth;

    Box() {
        System.out.println("Constructing the 'Box' object");
        width = 10;
        height = 10;
        depth = 10;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }

    void setDim (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
