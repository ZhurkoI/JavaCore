package main.java.com.igor.javacore.chapter06;

class BoxDemo7 {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(3, 6, 9);
        double vol;

        vol = myBox1.volume();
        System.out.println("Volume of first box equals " + vol);

        vol = myBox2.volume();
        System.out.println("Volume of second box equals " + vol);
    }
}
