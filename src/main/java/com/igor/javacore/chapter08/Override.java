package main.java.com.igor.javacore.chapter08;

class Override {

    public static void main(String[] args) {
        B4 subOb = new B4(1, 2, 3);
        subOb.show(); // this calls show() in B4 (overridden show() of A4)
        subOb.show("This is k: ");    // overloaded method show() of B4
    }
}
