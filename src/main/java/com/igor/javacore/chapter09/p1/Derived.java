package main.java.com.igor.javacore.chapter09.p1;

public class Derived extends Protection {

    Derived() {
        System.out.println("derived constructor");
        System.out.println("n = " + n);
        // System.out.println("n_pri = "4 + n_pri);     // class only
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
