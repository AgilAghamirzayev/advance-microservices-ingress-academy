package l.first.good;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<FlyingBird> flyingBirds = List.of(new Swan(), new Eagle());
    letBirdsFly(flyingBirds);

    List<Bird> birds = List.of(new Swan(), new Eagle(), new Penguin());
    letBirdsEat(birds);
  }

  private static void letBirdsEat(List<Bird> birds) {
    birds.forEach(Bird::eat);
  }

  public static void letBirdsFly(List<FlyingBird> birds) {
    birds.forEach(FlyingBird::fly);
  }

}