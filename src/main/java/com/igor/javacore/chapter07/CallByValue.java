package main.java.com.igor.javacore.chapter07;

class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 15, b = 20;

        System.out.println("a & b before call: " + a + " " + b);

        ob.meth(a, b);

        System.out.println("a & b after call: " + a + " " + b);
    }
}
