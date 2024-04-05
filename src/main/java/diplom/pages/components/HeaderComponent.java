package diplom.pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderComponent {
    private final WebDriver webDriver;

    public HeaderComponent(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void navigateToJobPage() {
        webDriver.findElement(By.xpath("//a[contains(@href,'/job')]")).click();
    }

    public void navigateToBlogPage() {
        webDriver.findElement(By.xpath("//a[contains(@href,'/blog')]")).click();
    }
    public void navigateToLinksPage() {
        webDriver.findElement(By.xpath("//a[contains(@href,'/links')]")).click();
    }

}
