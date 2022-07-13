package main.java.com.igor.javacore.chapter07;

class VarArgs2 {

    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " Content: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("One VARARGS parameter: ", 10);
        vaTest("Three VARARGS parameters: ", 1, 2, 3);
        vaTest("Without VARARGS parameters: ");
    }
}
