package Lab7.Q4;

public class run {

  public static void main(String[] args) {
    Person person = new Person("Palak", false);
    Work w = new Work(person);
    Eat e = new Eat(person);
    Drink d = new Drink(person);
    e.start();
    d.start();
    w.start();
  }
}
