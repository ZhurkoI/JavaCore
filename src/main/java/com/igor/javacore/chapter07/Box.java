package main.java.com.igor.javacore.chapter07;

class Box {
    double width;
    double height;
    double depth;

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box (Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double len) {
        width = height = depth = len;
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
