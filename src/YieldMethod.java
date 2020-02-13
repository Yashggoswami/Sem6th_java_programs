public class YieldMethod extends Thread {
    public static void main(String[] args) {
        YieldMethod m1 = new YieldMethod();
        YieldMethod m2 = new YieldMethod();
        YieldMethod m3 = new YieldMethod();
        m1.setName("yash");
        m2.setName("rahul");
        m3.setName("vinsy");

        m1.start();
        m2.start();
        m2.suspend();
        m3.start();

        m1.yield();
        for (int i = 0; i < 3; i++) {

            System.out.println(Thread.currentThread().getName() + " in control");
        }
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                System.out.println("error");
            }

            System.out.println("Name of the thread is " + Thread.currentThread().getName() + " " + i);
        }
    }

}
