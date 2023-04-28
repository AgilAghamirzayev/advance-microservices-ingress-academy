package creation.prototype.first;

public class HomePage implements Page {

  private String title;
  private String content;

  public HomePage(String title, String content) {
    this.title = title;
    this.content = content;
  }

  @Override
  public void render() {
    System.out.println("Rendering home page with title: " + title + " and content: " + content);
  }

  @Override
  public Page clone() {
    return new HomePage(title, content);
  }
}