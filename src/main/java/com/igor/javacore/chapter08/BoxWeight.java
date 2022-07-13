package main.java.com.igor.javacore.chapter08;

class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}
