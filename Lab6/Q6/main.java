
public class JavaShutdownHook {
    public static void main(String[] args) throws Exception{
        Runtime r1 = Runtime.getRuntime();
        r1.addShutdownHook(new Thread(){
            public void run(){
                System.out.println("Shutdown hook 1 completed.....");
            }
        });
        Runtime r2 = Runtime.getRuntime();
        r2.addShutdownHook(new Thread(){
            public void run(){
                System.out.println("Shutdown hook 1 completed.....");
            }
        });
        Runtime r3 = Runtime.getRuntime();
        r3.addShutdownHook(new Thread(){
            public void run(){
                System.out.println("Shutdown hook 1 completed.....");
            }
        });
        System.out.println("Main is sleeping.....press Ctrl + C to exit.");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

