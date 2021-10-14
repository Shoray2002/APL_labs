package P1;

public class ThreadClass1 extends Thread {
    public ThreadClass1(ThreadGroup tg, String name) {
        super(tg, name);
    }
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running..");
    }
}