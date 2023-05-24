package behavior.strategy2;

import java.util.function.BiFunction;
//https://medium.com/@lucapelosi/essential-design-patterns-strategy-b603eb5c9e77
public class Client {
    public static void main(String[] args) {
        Point a = new Point(0,0);
        Point b = new Point(3,4);

        // we can create inline strategies
        BiFunction<Point, Point, RouteStrategy> simpleStrategy =
            (p1, p2) -> (RouteStrategy) () -> System.out.println("Simple route strategy");

        Navigator nav = new Navigator(simpleStrategy);
        RouteStrategy simpleRoute = nav.getRoute(a, b);
        simpleRoute.buildRoute();

        // Or we can rely on Strategy Factory
        RouteStrategyFactory factory = new RouteStrategyFactory();
        nav.setRouteStrategy(factory.create(Type.ROAD));
        RouteStrategy roadRoute = nav.getRoute(a, b);
        roadRoute.buildRoute();
    }
}