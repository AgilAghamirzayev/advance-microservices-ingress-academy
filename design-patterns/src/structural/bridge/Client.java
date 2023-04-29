package structural.bridge;

import java.util.Arrays;

public class Client {

  public static void main(String[] args) {
    App[] apps = {
        new Facebook(new Android()),
        new Instagram(new IOS())
    };

    Arrays.stream(apps).forEach(App::runApp);
  }
}
