package main.java.com.igor.javacore.chapter09;

class Client implements Callback {

    @Override
    public void callback(int p) {
        System.out.println("Callback() called with parameter " + p);
    }

    void nonInterfaceMeth() {
        System.out.println("It is a method in the class that implements interface");
    }
}
