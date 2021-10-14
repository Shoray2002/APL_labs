package P2;

public class ThreadClass2 extends Thread {
    public ThreadClass2(ThreadGroup tg, String name) {
        super(tg, name);
    }
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running..");
    }
}
