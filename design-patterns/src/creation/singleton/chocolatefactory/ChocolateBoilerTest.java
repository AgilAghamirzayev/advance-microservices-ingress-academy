package creation.singleton.chocolatefactory;

public class ChocolateBoilerTest {

  public static void main(String[] args) {
    ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
    chocolateBoiler.fill();
    chocolateBoiler.boil();
    chocolateBoiler.drain();
  }
}
