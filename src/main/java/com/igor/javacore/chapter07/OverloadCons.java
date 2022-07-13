package main.java.com.igor.javacore.chapter07;

class OverloadCons {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myBox3 = new Box(7);
        double vol;

        vol = myBox1.volume();
        System.out.println("Volume of myBox1 equals " + vol);

        vol = myBox2.volume();
        System.out.println("Volume of myBox2 equals " + vol);

        vol = myBox3.volume();
        System.out.println("Volume of myBox3 equals " + vol);
    }
}
