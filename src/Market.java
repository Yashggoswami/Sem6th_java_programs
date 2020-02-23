//Producer-Consumer Problem

import java.util.LinkedList;
import java.util.Queue;

public class Market {
    public static void main(String[] args) {
        Mark target = new Mark();
        new Farmer(target);
        new Consumer(target);
    }
}

class Mark {

    Queue<String> que = new LinkedList<>();
    boolean valset = false;

    synchronized void put(String item) {
        while (valset) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        que.offer(item);
        System.out.println("Items available " + que);

        valset = true;
        notify();
    }

    synchronized void get(String str) {
        while (!valset) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        if (que.contains(str)) {
            que.remove(str);
            System.out.println(str + " Item is sold");
        } else {
            System.out.println("Item is not Available");
        }
        valset = false;
        notify();

    }

}

class Farmer implements Runnable {
    Mark m;
    String[] str = {"Apple", "Orange", "Graphes", "Apple", "Mango", "Strawberry"};

    Farmer(Mark m) {
        this.m = m;
        new Thread(this, "Farmer").start();
    }

    public void run() {
        for (String st : str) {
            m.put(st);
        }
    }
}

class Consumer implements Runnable {
    Mark m;
    String[] str = {"Apple", "Orange", "Graphes", "Apple", "Mango", "Strawberry"};

    Consumer(Mark m) {
        this.m = m;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        for (String st : str) {
            m.get(st);
        }
    }
}