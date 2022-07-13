package main.java.com.igor.javacore.chapter09;

public interface MyIF {

    int getNumber();  // regular method w/o implementation

    // method with default implementation
    default String getString() {
        return "String by default";
    }

    static int getDefaultNumber() {
        return  0;
    }
}
