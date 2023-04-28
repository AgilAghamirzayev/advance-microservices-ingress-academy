package creation.prototype.first;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Page> pages = new ArrayList<>();
        pages.add(PageFactory.createHomePage());
        pages.add(PageFactory.createAboutPage());

        for (Page page : pages) {
            page.render();
        }
    }
}