class MyThread implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is : RUNNING");
        try {
            Thread.sleep(1400);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ThreadCycle {
    public static void main(String[] args) {
        MyThread runnable = new MyThread();
        Thread sachin = new Thread(runnable, "Sachin");
        Thread virat = new Thread(runnable, "Virat");
        Thread sehwag = new Thread(runnable, "Sehwag");
        System.out.println("Sachin is : " + sachin.getState());
        System.out.println("Virat is : " + virat.getState());
        System.out.println("Sehwag is : " + sehwag.getState());
        sachin.start();
        System.out.println("After starting, Sachin is : " + sachin.getState());
        virat.start();
        System.out.println("After starting, Virat is : " + virat.getState());
        sehwag.start();
        System.out.println("After starting, Sehwag is : " + sehwag.getState());
        System.out.println("Now, Sachin is : " + sachin.getState());
        System.out.println("Now, Virat is : " + virat.getState());
        System.out.println("Now, Sehwag is : " + sehwag.getState());
        try {
            sehwag.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("At last, Sachin is : " + sachin.getState());
        System.out.println("At last, Virat is : " + virat.getState());
        System.out.println("At last, Sehwag is : " + sehwag.getState());

    }
}

