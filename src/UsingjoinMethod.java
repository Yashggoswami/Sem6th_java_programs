//using join method
public class UsingjoinMethod {
    public static void main(String[] args) {
        strt t1 = new strt();
        strt t2 = new strt();
        strt t3 = new strt();
        t1.start();
        try {
            //next thread will wait until t1 dies
            t1.join(1500);
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }
}

class strt extends Thread {
    public void run() {
        for (int i = 1; i < 6; i++) {
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i + " " + Thread.currentThread().getName());

        }
    }
}
