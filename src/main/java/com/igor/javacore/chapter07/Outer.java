package main.java.com.igor.javacore.chapter07;

class Outer {

    private int outer_x = 100;

    void test() {
        Inner inner = new Inner(); // Inner classes can be created ONLY in context of outer class
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println("Out: outer_x = " + outer_x); // Inner class has access to the fields of the outer class
        }
    }
}
