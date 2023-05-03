package l.first.bad;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Bird> birds = List.of(new Swan(), new Penguin());
    letBirdsFly(birds);
    letBirdsEat(birds);
  }

  private static void letBirdsEat(List<Bird> birds) {
    birds.forEach(Bird::eat);
  }

  public static void letBirdsFly(List<Bird> birds) {
    birds
        // if we add new type of birds we will add new filters
        // this is not good practice
        .stream().filter(bird -> !(bird instanceof Penguin))
        .forEach(Bird::fly);
  }

}