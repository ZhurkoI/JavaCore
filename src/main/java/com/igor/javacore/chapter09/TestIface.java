package main.java.com.igor.javacore.chapter09;

class TestIface {

    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);


        Client cc = new Client();
        cc.nonInterfaceMeth();
    }
}
