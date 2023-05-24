package behavior.strategy2;

import java.util.function.BiFunction;

public class RouteStrategyFactory {
    public BiFunction<Point, Point, RouteStrategy> create(Type type) {
        return switch (type) {
            case  ROAD -> (p1, p2) -> new RoadStrategy();
            case WALK -> (p1, p2) -> new WalkingStrategy();
            case PUBLIC_TRANSPORT -> (p1, p2) -> new PublicTransportStrategy();
        };
    }
}