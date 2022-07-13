package main.java.com.igor.javacore.chapter09;

class AnotherClient implements Callback {
    @Override
    public void callback(int p) {
        System.out.println("One another implementation of callback() ");
        System.out.println("p squared is " + (p * p));
    }
}
