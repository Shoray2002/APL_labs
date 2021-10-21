package Lab7;

public class Q3 {
    public static void main(String[] args) {
        final String qsn1 = "Question : 800 rated";
        final String qsn2 = "Question : 1000 rated";
        final String qsn3 = "Question : 1200 rated";
        final String qsn4 = "Question : 1400 rated";

        Thread t1 = new Thread() {
            public void run() {
                synchronized (qsn1) {
                    System.out.println("t1 : locked or choosen question 1");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    synchronized (qsn2) {
                        System.out.println("t1 : locked or choose question2");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized (qsn2) {
                    System.out.println("t2 : locked or choosen question 2");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    synchronized (qsn3) {
                        System.out.println("t2 : locked or choose question 3");
                    }
                }
            }
        };

        Thread t3 = new Thread() {
            public void run() {
                synchronized (qsn3) {
                    System.out.println("t3 : locked or choosen question 3");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    synchronized (qsn4) {
                        System.out.println("t3 : locked or choose question 4");
                    }
                }
            }
        };

        Thread t4 = new Thread() {
            public void run() {
                synchronized (qsn4) {
                    System.out.println("t4 : locked or choosen question 4");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    synchronized (qsn1) {
                        System.out.println("t4 : locked or choose question 1");
                    }
                }
            }
        };

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
