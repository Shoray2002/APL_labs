package Lab7.Q1;

class Second {

  synchronized void print(int n) {
    synchronized (this) {
      for (int i = 1; i <= 5; i++) {
        System.out.print(i + n + " ");

        try {
          Thread.sleep(4500);
        } catch (Exception e) {
          System.out.println(e);
        }
      }

      System.out.println();
    }
  }
}

class MTT1 extends Thread {

  Second t;

  MTT1(Second t) {
    this.t = t;
  }

  public void run() {
    t.print(5);
  }
}

class MTT2 extends Thread {

  Second t;

  MTT2(Second t) {
    this.t = t;
  }

  public void run() {
    t.print(15);
  }
}

public class S_block {

  public static void main(String[] args) {
    Second obj = new Second();
    MTT1 t1 = new MTT1(obj);
    MTT2 t2 = new MTT2(obj);
    t1.start();
    t2.start();
  }
}
