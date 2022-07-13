package main.java.com.igor.javacore.chapter08;

class B4 extends A4 {
    int k;

    B4(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show();  // this calls A's show()
        System.out.println("k: " + k);
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}
