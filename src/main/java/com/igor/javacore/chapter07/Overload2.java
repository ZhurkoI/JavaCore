package main.java.com.igor.javacore.chapter07;

class Overload2 {
    public static void main(String[] args) {
        OverloadDemo2 od = new OverloadDemo2();
        int i = 88;

        od.test();
        od.test(10, 20);
        od.test(i);
        od.test(123.2);
    }
}
