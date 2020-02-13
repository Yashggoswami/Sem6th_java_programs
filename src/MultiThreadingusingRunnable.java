public class MultiThreadingusingRunnable {
    public static void main(String[] args) {
        StrtThread st = new StrtThread();
        Thread thread = new Thread(st);
        thread.start();
    }
}

class StrtThread implements Runnable {
    public void run() {
        System.out.println("Thread is working");
    }
}
