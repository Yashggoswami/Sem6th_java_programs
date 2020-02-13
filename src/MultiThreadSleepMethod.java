
class Starthread implements Runnable {
    public void run() {
        for (int i = 1; i < 6; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.print(i + " ");
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class MultiThreadSleepMethod {
    public static void main(String[] args) {
        Starthread t1 = new Starthread();
        Starthread t2 = new Starthread();
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        th1.start();
        th2.start();
    }
}
