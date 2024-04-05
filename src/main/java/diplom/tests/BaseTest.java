package diplom.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    public WebDriver webDriver;

    @BeforeMethod
    public void initDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1280,720");

        webDriver = new ChromeDriver(options);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void open() {
        webDriver.get("https://www.i.ua/");
    }

    public void consentForm() {
        webDriver.findElement(By.xpath("//p[@class='fc-button-label']")).click();
    }

    @AfterMethod
    public void destroy() {
        webDriver.quit();
    }

}
