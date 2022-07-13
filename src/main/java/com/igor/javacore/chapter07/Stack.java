package main.java.com.igor.javacore.chapter07;

class Stack {
    private int stck[] = new int[10];
    private int tos;

    public Stack() {
        tos = -1;
    }

    // put element to the stack
    void push(int item) {
        if (tos == 9)
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }

    //get element from the stack
    int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else
            return stck[tos--];
    }
}
