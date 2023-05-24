package behavior.strategy2;

public class WalkingStrategy implements RouteStrategy{

  @Override
  public void buildRoute() {
    System.out.println("WalkingStrategy");
  }
}
