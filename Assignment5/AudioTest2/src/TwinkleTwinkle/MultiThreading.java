package TwinkleTwinkle;

public class MultiThreading {

    public static void main(String[] args) {
        // Creating and starting both threads
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}
