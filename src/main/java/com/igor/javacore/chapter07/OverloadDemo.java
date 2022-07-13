package main.java.com.igor.javacore.chapter07;

class OverloadDemo {
    void test() {
        System.out.println("There are no parameters.");
    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a & b: " + a + " " + b);
    }

    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}
