package main.java.com.igor.javacore.chapter07;

class VarArgs3 {

    static void vaTest(int... v) {
        System.out.print("vaTest(int...): Number of arguments is " + v.length + ". Content: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest(boolean...): Number of arguments is " + v.length + ". Content: ");

        for (boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(String msg, int... v) {
        System.out.print("vaTest(String msg, int...): " + msg + v.length + ". Content: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Checking: ", 10, 20);
        vaTest(true, false, false);
    }
}
