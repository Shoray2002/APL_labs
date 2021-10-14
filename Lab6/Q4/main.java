
public class DeamonThread extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Thread: "+Thread.currentThread().getName());
            System.out.println("Daemon: "+Thread.currentThread().isDaemon());
        }
        else{
            System.out.println("Thread: "+Thread.currentThread().getName());
            System.out.println("Daemon: "+Thread.currentThread().isDaemon());
        }
    }
    public static void main(String[] args) {
        Q4_DeamonThread t1 = new Q4_DeamonThread();
        Q4_DeamonThread t2 = new Q4_DeamonThread();
        Q4_DeamonThread t3 = new Q4_DeamonThread();
        t2.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Daemon: "+t2.getState());
        try {
            t1.join();
            t3.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Thread1: "+t1.getState());
        System.out.println("Thread2: "+t3.getState());
        System.out.println("Daemon: "+t2.getState());
    }
}

