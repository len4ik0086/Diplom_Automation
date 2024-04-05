package diplom.pages;

import diplom.pages.components.HeaderComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinksPage {

    private final WebDriver webDriver;

    public HeaderComponent headerComponent;

    public LinksPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        headerComponent = new HeaderComponent(webDriver);
    }

    public void consentForm() {
        webDriver.findElement(By.xpath("//p[@class='fc-button-label']")).click();
    }

    public String actualTitle() {
        return webDriver.getTitle();
    }

}
