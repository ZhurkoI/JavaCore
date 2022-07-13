package main.java.com.igor.javacore.chapter08;

class Dispatch {

    public static void main(String[] args) {
        A5 a = new A5();
        B5 b = new B5();
        C5 c = new C5();

        A5 r;

        r = a;
        r.callMe();     // calls A's version of callMe()

        r = b;
        r.callMe();     // calls B's version of callMe()

        r = c;
        r.callMe();     // calls C's version of callMe()
    }
}
