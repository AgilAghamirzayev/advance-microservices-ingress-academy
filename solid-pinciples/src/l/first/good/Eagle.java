package l.first.good;

public class Eagle implements FlyingBird{

  @Override
  public void eat() {
    System.out.println("OMG! I can eat chocolate!");
  }

  @Override
  public void fly() {
    System.out.println("I'm eagle I can fly!");
  }
}
