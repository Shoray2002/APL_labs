package Lab7.Q4;

public class Drink extends Thread {

  Person person;

  Drink(Person person) {
    this.person = person;
  }

  public void run() {
    synchronized (person) {
      System.out.println(person.name + " intends to drink water now...");
      if (!person.completedWork) {
        System.out.println(
          person.name + " first needs to complete work before drinking."
        );
        try {
          person.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      System.out.println(person.name + " is starting to drink water...");
      System.out.println(person.name + " has completed drinking water.");
      person.notify();
    }
  }
}
