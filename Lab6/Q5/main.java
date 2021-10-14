import P1.ThreadClass1;
import P2.ThreadClass2;
import P3.ThreadClass3;

public class ThreadPollOrGroup {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("Thread Group 1");
        Thread t1 = new ThreadClass1(threadGroup, "Thread-1");
        Thread t2 = new ThreadClass2(threadGroup, "Thread-2");
        Thread t3 = new ThreadClass3(threadGroup, "Thread-3");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("The number of active thread in the thread group are : " + threadGroup.activeCount());
        System.out.println("Name of the thread group : " + threadGroup.getName());
        threadGroup.setMaxPriority(4);
        System.out.println("Maximun priority : " + threadGroup.getMaxPriority());
        System.out.println("Is the thread group Daemon : " + threadGroup.isDaemon());
        threadGroup.list();
        System.out.println("String equivalent of the thread group : " + threadGroup.toString());
        threadGroup.destroy();
        System.out.println("Is the thread group destroyed : " + threadGroup.isDestroyed());
    }
}