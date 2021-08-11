package Lab1;
class Main {
    Main() {
      System.out.println("Constructor of Main class.");
    }
   
    public static void main(String[] args) {
        new Main();
        System.out.print("Adding 10, 20 : ");
        new Addition(10,20);
        System.out.print("Adding 10, 20, 30 : ");
        new Addition(10, 20, 30);
        System.out.print("Adding 10, 20, 30, 40 : ");
        new Addition(10, 20, 30, 40);
    }
  }

  class Addition {

    Addition(int a, int b) {
        System.out.println(a + b);
    }
    Addition(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    Addition(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }
  }

