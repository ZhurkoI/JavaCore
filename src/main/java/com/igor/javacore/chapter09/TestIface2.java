package main.java.com.igor.javacore.chapter09;

class TestIface2 {

    public static void main(String args[]) {
        Callback c = new Client();
        c.callback(42);

        c = new AnotherClient();; // c now refers to AnotherClient object
        c.callback(42);
    }
}
