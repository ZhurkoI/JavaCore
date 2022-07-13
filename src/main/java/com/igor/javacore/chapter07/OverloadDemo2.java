package main.java.com.igor.javacore.chapter07;

class OverloadDemo2 {
    void test() {
        System.out.println("There are no parameters.");
    }

    void test(int a, int b) {
        System.out.println("a & b: " + a + " " + b);
    }

    void test(double a) {
        System.out.println("Inner converting upon calling test(double) a: " + a);
    }
}
