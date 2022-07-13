package main.java.com.igor.javacore.chapter03;

public class Light {
    public static void main(String args[]) {
        int lightspeed;
        long days;
        long seconds;
        long distance;
        lightspeed = 186000; //miles per second
        days = 1000;

        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;

        System.out.print("For " + days);
        System.out.print(" days light runs ");
        System.out.println(distance + " miles approx.");
    }
}
