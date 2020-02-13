//setName() method

public class GetNameandSetName implements Runnable {
    public static void main(String[] args) {
        GetNameandSetName s1 = new GetNameandSetName();
        Thread t1 = new Thread(s1);
        t1.start();
        System.out.println(t1.getId());
        Thread t2 = new Thread(s1);
        System.out.println(t2.getId());
        t2.start();
        t2.setName("vinay");
        t1.setName("yash");
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
