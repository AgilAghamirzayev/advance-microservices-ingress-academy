package creation.prototype.first;

class PageFactory {

  private static final HomePage homePage =
      new HomePage("Home", "Welcome to our website!");
  private static final AboutPage aboutPage =
      new AboutPage("About", "We are a leading provider of software solutions.");

  public static Page createHomePage() {
    return homePage.clone();
  }

  public static Page createAboutPage() {
    return aboutPage.clone();
  }
}