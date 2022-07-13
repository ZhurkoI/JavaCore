package main.java.com.igor.javacore.chapter09.p2;

class OtherPackage {

    OtherPackage() {
        main.java.com.igor.javacore.chapter09.p1.Protection p = new main.java.com.igor.javacore.chapter09.p1.Protection();
        System.out.println("other package constructor");
//         System.out.println("n = " + p.n);            // class or package only
        // System.out.println("n_pri = " + p.n_pri);    // class only
        // System.out.println("n_pro = " + p.n_pro);    // class, subclass or package only
        System.out.println("n_pub = " + p.n_pub);
    }
}
