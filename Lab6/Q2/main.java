public class ThreadMethods {
    public static void main(String[] args) {
        Thread sania = new Thread() {
            public void run() {
                System.out.println("Sania is : RUNNING");
                try {
                    System.out.println("Sania will now sleep for 100ms");
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        Thread maria = new Thread() {
            public void run() {
                System.out.println("Maria is : RUNNING");
                try {
                    System.out.println("Maria will now sleep for 200ms");
                    Thread.sleep(200);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        Thread serena = new  Thread() {
            public void run() {
                System.out.println("Serena is : RUNNING");
                try {
                    System.out.println("Serena will now sleep for 300ms");
                    Thread.sleep(300);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("\nCalling yield() method on Serena");
                Thread.yield();
                System.out.println();
            }
        };
        sania.setName("Sania");
        maria.setName("Maria");
        serena.setName("Serena");
        sania.setPriority(4);
        maria.setPriority(8);
        serena.setPriority(6);
        System.out.println("\nCalling run() method on Sania, Maria and Serena");
        sania.run();
        maria.run();
        serena.run();
        System.out.println("\nCalling start() method on Sania, Maria and Serena");
        sania.start();
        maria.start();
        serena.start();
        System.out.println("\nPriority of Sania : " + sania.getPriority());
        System.out.println("\nPriority of Maria : " + maria.getPriority());
        System.out.println("\nPriority of Serena : " + serena.getPriority());
        System.out.println("\nCalling suspend() method on Sania");
        sania.suspend();
        try {
            System.out.println("\nCalling join() on Maria");
            maria.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\nCalling resume() method on Sania");
        sania.resume();
    }
}
