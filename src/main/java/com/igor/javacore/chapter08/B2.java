package main.java.com.igor.javacore.chapter08;

class B2 extends A2 {

    int i; // this fields hides field 'i' in superclass A2

    B2(int a, int b) {
        super.i = a;    // field 'i' of class A2
        i = b;          // field 'i' of class B2
    }

    void show() {
        System.out.println("i in superclass is " + super.i);
        System.out.println("i in subclass is " + i);
    }
}
