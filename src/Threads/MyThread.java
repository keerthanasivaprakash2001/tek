package Threads;


class MyThread implements Runnable {

        @Override
        public void run() {
            System.out.println("Thread is running: " + Thread.currentThread().getName());
        }

    public static void main(String[] args) {

        Thread t1 = new Thread(new MyThread());
        t1.start();
    }
    }



