package main.java.com.igor.javacore.chapter09;

class DefaultMethodDemo {

    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();

        // Can call getNumber(), because it is explicitly implemented by MyIFImp:
        System.out.println(obj.getNumber());

        // Can also call getString(), because of default implementation:
        System.out.println(obj.getString());


        MyIFImp2 obj2 = new MyIFImp2();
        // Can call getNumber(), because it is explicitly implemented by MyIFImp:
        System.out.println(obj2.getNumber());

        //Call default getString() overridden in MyIFImp2
        System.out.println(obj2.getString());
    }
}
