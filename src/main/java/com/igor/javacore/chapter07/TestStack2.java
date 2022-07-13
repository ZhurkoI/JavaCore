package main.java.com.igor.javacore.chapter07;

class TestStack2 {

    public static void main(String[] args) {
        StackImproved myStack1 = new StackImproved(5);
        StackImproved myStack2 = new StackImproved(8);

        // put numbers into the stack
        for (int i = 0; i < 5; i++) myStack1.push(i);
        for (int i = 0; i < 8; i++) myStack2.push(i);

        // retrieve numbers from stack
        System.out.println("MyStack1:");
        for (int i = 0; i < 5; i++) System.out.println(myStack1.pop());

        System.out.println("MyStack2:");
        for (int i = 0; i < 8; i++) System.out.println(myStack2.pop());
    }
}
