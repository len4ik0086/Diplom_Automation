package diplom.pages;

import diplom.pages.components.HeaderComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlogPage {

    private final WebDriver webDriver;

    public HeaderComponent headerComponent;

    public BlogPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        headerComponent = new HeaderComponent(webDriver);
    }

    public void open() {
        webDriver.get("https://www.i.ua/");
    }

    public void consentForm() {
        webDriver.findElement(By.xpath("//p[@class='fc-button-label']")).click();
    }

    public String actualTitle() {
        return webDriver.getTitle();
    }

}
