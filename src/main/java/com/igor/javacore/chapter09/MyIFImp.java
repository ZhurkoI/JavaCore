package main.java.com.igor.javacore.chapter09;

class MyIFImp implements MyIF {

    int defNum = MyIF.getDefaultNumber();   // call static method of the interface

    public int getNumber() {
        return 100;
    }

    // It is not necessary to override getString() method from interface
}
