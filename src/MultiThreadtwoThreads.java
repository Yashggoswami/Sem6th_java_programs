public class MultiThreadtwoThreads {
    public static void main(String[] args) {

    }
}

class ThreadDemo implements Runnable {
    Thread t;

    ThreadDemo() {
        t = new Thread(this, "MyThread");
        System.out.println("Child Thread: " + t);
        t.start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Child Thread: " + t.currentThread() + " " + i);
                t.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }

}