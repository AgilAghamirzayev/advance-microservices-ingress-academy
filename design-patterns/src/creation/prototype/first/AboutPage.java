package creation.prototype.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class AboutPage implements Page {

  private String title;
  private String content;

  public AboutPage(String title, String content) {
    this.title = title;
    this.content = content;
  }

  public void render() {
    System.out.println("Rendering about page with title: " + title + " and content: " + content);
  }

  public Page clone() {
    return new AboutPage(title, content);
  }
}