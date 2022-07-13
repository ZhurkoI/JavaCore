package main.java.com.igor.javacore.chapter07;

class Overload {
    public static void main(String[] args) {
        OverloadDemo od = new OverloadDemo();
        double result;

        od.test();
        od.test(10);
        od.test(10, 20);
        result = od.test(123.25);
        System.out.println("Result of od.test(123.25): " + result);
    }
}
