public class MultithreadgetPriority extends Thread {
    public static void main(String[] args) {
        MultithreadgetPriority m1 = new MultithreadgetPriority();
        MultithreadgetPriority m2 = new MultithreadgetPriority();
        m1.start();
        m2.start();

        m1.setPriority(MIN_PRIORITY);
        System.out.println(m1.getPriority());
        System.out.println(m2.getPriority());
    }

    public void run() {
        System.out.println("Current thread is -" + Thread.currentThread().getName());
    }
}
