package main.java.com.igor.javacore.chapter07;

class PassObjRe {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);
        System.out.println("ob.a & ob.b before call: " + ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("ob.a & ob.b after call: " + ob.a + " " + ob.b);
    }
}
