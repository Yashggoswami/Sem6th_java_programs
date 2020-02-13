public class MultiThreadingusingRunnable {
    public static void main(String[] args) {
        StartThread st = new StartThread();
        Thread thread = new Thread(st);
        thread.start();
    }
}

class StrtThread implements Runnable {
    public void run() {
        System.out.println("Thread is working");
    }
}
