

public class MainThread {

    public static void main(String[] args) {

        new ThreadDemo();
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread() + " " + i);
                Thread.sleep(1010);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }

        }
        System.out.println("Terminated");
    }
}
