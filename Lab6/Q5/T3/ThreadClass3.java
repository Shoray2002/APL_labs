package P3;

public class ThreadClass3 extends Thread {
    public ThreadClass3(ThreadGroup tg, String name) {
        super(tg, name);
    }
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running..");
    }
}
