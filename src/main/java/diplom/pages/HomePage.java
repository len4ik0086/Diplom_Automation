package diplom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private final WebDriver webDriver;

    public HomePage(WebDriver driver) {
        this.webDriver = driver;
    }

    public WebElement searchField() {
        return webDriver.findElement(By.xpath("//input[@id='searchQ']"));
    }

    public WebElement searchFieldResult() {
        return webDriver.findElement(By.xpath("//div [@ class='gsc-resultsbox-visible']"));
    }

}
