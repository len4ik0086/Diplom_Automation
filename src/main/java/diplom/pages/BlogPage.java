package diplom.pages;

import diplom.pages.components.HeaderComponent;
import org.openqa.selenium.WebDriver;

public class BlogPage {

    private final WebDriver webDriver;

    public HeaderComponent headerComponent;

    public BlogPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        headerComponent = new HeaderComponent(webDriver);
    }

    public String actualTitle() {
        return webDriver.getTitle();
    }

}
