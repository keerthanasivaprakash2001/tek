package Threads;


public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(new MyThread());
        t1.start();
    }
}
