import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.glassfish.jersey.simple.SimpleContainerFactory;

import java.io.IOException;
import java.net.URI;
import controller.ProductController;

public class Main {
    public static void main(String[] args) throws IOException {
        String baseUri = "http://localhost:8080/";
        ResourceConfig config = new ResourceConfig(ProductController.class);
        config.property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);

        SimpleContainerFactory.create(URI.create(baseUri), config);
        System.out.println("Server started on " + baseUri);
    }
}
