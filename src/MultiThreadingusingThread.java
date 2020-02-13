public class MultiThreadingusingThread {
    public static void main(String[] args) {
        StartThread st1 = new StartThread();
        st1.start();
    }
}

class StartThread extends Thread {
    public void run() {
        System.out.println("thread is working");
    }
}