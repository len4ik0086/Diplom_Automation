package diplom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver webDriver;

    public LoginPage(WebDriver driver) {
        this.webDriver = driver;
    }

    public void loginForm() {
        webDriver.findElement(By.xpath("//a [text()='Вхід']")).click();
    }

    public void enterUserName(String name) {
        webDriver.findElement(By.xpath("//fieldset/p/input[@name='login']")).sendKeys(name);
    }

    public void enterPassword(String pass) {
        webDriver.findElement(By.xpath("//fieldset/p/input[@name='pass']")).sendKeys(pass);
    }

    public void consentForm() {
        webDriver.findElement(By.xpath("//p[@class='fc-button-label']")).click();
    }

    public void clickLogin() {
        webDriver.findElement(By.xpath("//form/input[@value='Увійти']")).click();
    }

    public String actualTitle() {
        return webDriver.getTitle();
    }

}