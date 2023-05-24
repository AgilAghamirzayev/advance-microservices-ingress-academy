package behavior.strategy2;

public class PublicTransportStrategy implements RouteStrategy{

  @Override
  public void buildRoute() {
    System.out.println("PublicTransportStrategy");
  }
}
