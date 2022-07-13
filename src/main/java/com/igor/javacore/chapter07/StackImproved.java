package main.java.com.igor.javacore.chapter07;

class StackImproved {

    private int stck[] = new int[10];
    private int tos;

    public StackImproved(int size) {
        stck = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stck.length-1)
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack is not full.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
