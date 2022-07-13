package main.java.com.igor.javacore.chapter08;

class RefDemo {

    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        Box plainBox = new Box();
        double vol;

        vol = weightBox.volume();
        System.out.println("Volume of weightBox is " + vol);
        System.out.println("Weight of weightBox is " + weightBox.weight);
        System.out.println();

        plainBox = weightBox;
        vol = plainBox.volume();
        System.out.println("Volume of plainBox is " + vol);
        // The operator bellow will not work
        // System.out.println("Weight of plainBox is " + plainBox.weight);
    }
}
