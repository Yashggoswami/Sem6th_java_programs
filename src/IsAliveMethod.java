public class IsAliveMethod extends Thread {
    public static void main(String[] args) {
        IsAliveMethod m1 = new IsAliveMethod();
        System.out.println("Before Start method " + m1.isAlive());
        m1.start();
        System.out.println("After thread is completed execution " + m1.isAlive());
    }

    public void run() {

        try {
            Thread.sleep(500);
            System.out.println(Thread.currentThread().isAlive());
        } catch (InterruptedException e) {
            System.out.println("Exceptions" + e);
        }


        System.out.println(Thread.currentThread().isAlive());
    }

}
