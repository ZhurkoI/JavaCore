package main.java.com.igor.javacore.chapter07;

class Outer2 {
    int outer_x = 100;

    void test() {
        for (int i=0; i<10; i++) {
            // Inner class can be defined even in the FOR loop
            class Inner {
                void display() {
                    System.out.println("Out: outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
