package Lab7.Q4;

public class Work extends Thread {

  Person person;

  Work(Person person) {
    this.person = person;
  }

  public void run() {
    synchronized (person) {
      System.out.println(person.name + " intends to work now...");
      System.out.println(person.name + " is starting work...");
      System.out.println(person.name + " has completed work.");
      person.completedWork = true;
      person.notifyAll();
    }
  }
}
