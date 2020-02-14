

public class MainThread {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("current " + t);
        t.setName("MyThread");
        System.out.println("changed " + t);
        for (int i = 0; i < 5; i++) {
            try {
                t.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            System.out.println(t.getName() + " " + i);
        }
        System.out.println("Terminated");
    }
}
