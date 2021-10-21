package Lab7;

class data {
    synchronized void print() {
      int i;
      for (i = 1; i <= 10; i++) System.out.print(i + " ");
      System.out.println(" ");
    }
  }
  
  public class Q2 {
  
    public static void main(String[] args) {
      data d1 = new data();
      data d2 = new data();
      data d3 = new data();
  
      Thread t1 = new Thread() {
        public void run() {
          d1.print();
        }
      };
  
      Thread t2 = new Thread() {
        public void run() {
          d2.print();
        }
      };
  
      Thread t3 = new Thread() {
        public void run() {
          d3.print();
        }
      };
  
      t1.start();
      t2.start();
      t3.start();
    }
  }
  