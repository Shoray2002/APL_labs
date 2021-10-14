public class StartVsRun implements Runnable 
{
    public void run() 
    {
        System.out.println("Thread running is " + Thread.currentThread().getName()+" has priority "+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) 
    {
        Runnable ob = new third();
        Thread t1 = new Thread(ob, "Sania");
        Thread t2 = new Thread(ob, "Maria");
        Thread t3 = new Thread(ob, "Serena");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        System.out.println("Calling run method from the main method");
        t1.run();
        t2.run();
        t3.run();
        System.out.println(
                "\nWe get the above output because run method goes on current call stack rather than beginning of the new call stack\n");
        System.out.println("NOW->Calling start method from the main method");
        t1.start();
        t2.start();
        t3.start();
    }

}