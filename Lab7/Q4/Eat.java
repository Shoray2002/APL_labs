package Lab7.Q4;

public class Eat extends Thread {

  Person person;

  Eat(Person person) {
    this.person = person;
  }

  public void run() {
    synchronized (person) {
      System.out.println(person.name + " intends to eat now...");
      if (!person.completedWork) {
        System.out.println(
          person.name + " first needs to complete work before eating."
        );
        try {
          person.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      System.out.println(person.name + " is starting to eat...");
      System.out.println(person.name + " has completed eating.");
      person.notify();
    }
  }
}
