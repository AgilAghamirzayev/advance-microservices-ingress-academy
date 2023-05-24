package behavior.strategy2;

import java.util.function.BiFunction;

public class Navigator {
    private BiFunction<Point, Point, RouteStrategy> routeStrategy;

    public Navigator(BiFunction<Point, Point, RouteStrategy> routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void setRouteStrategy(BiFunction<Point, Point, RouteStrategy> routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public RouteStrategy getRoute(Point a, Point b) {
        return this.routeStrategy.apply(a, b);
    }
}