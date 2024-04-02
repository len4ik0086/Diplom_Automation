package diplom.tests;

import diplom.components.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTests extends diplom.components.CustomWebDriver {

    private LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        loginPage = new LoginPage(webDriver);
    }

    @Test(priority = 1)
    public void wrongPasswordLoginTest() {
        loginPage.open();
        loginPage.consentForm();
        loginPage.loginForm();
        loginPage.enterUserName("panivchnyn@gmail.com");
        loginPage.enterPassword("wrongPassword");
        loginPage.clickLogin();
        assertEquals(loginPage.actualTitle(), "Паспорт - I.UA ", "The actual and expected title don’t match");
    }

    @Test(priority = 1)
    public void wrongLoginNameLoginTest() {
        loginPage.open();
        loginPage.consentForm();
        loginPage.loginForm();
        loginPage.enterUserName("wrongname");
        loginPage.enterPassword("Pass2210");
        loginPage.clickLogin();
        assertEquals(loginPage.actualTitle(), "Паспорт - I.UA ", "The actual and expected title don’t match");
    }

    @Test(priority = 1)
    public void wrongLoginNameWrongLoginTest() {
        loginPage.open();
        loginPage.consentForm();
        loginPage.loginForm();
        loginPage.enterUserName("wrongName");
        loginPage.enterPassword("wrongPassword");
        loginPage.clickLogin();
        assertEquals(loginPage.actualTitle(), "Паспорт - I.UA ", "The actual and expected title don’t match");
    }

    @Test(priority = 1)
    public void blankLoginNameLoginTest() {
        loginPage.open();
        loginPage.consentForm();
        loginPage.loginForm();
        loginPage.enterUserName("");
        loginPage.enterPassword("Pass2210");
        loginPage.clickLogin();
        assertEquals(loginPage.actualTitle(), "І.UA - твоя пошта ", "The actual and expected title don’t match");
    }

    @Test(priority = 1)
    public void loginNameBlankLoginTest() {
        loginPage.open();
        loginPage.consentForm();
        loginPage.loginForm();
        loginPage.enterUserName("panivchnyn@gmail.com");
        loginPage.enterPassword("");
        loginPage.clickLogin();
        assertEquals(loginPage.actualTitle(), "І.UA - твоя пошта ", "The actual and expected title don’t match");
    }

    @Test(priority = 1)
    public void blankLoginNameBlankLoginTest() {
        loginPage.open();
        loginPage.consentForm();
        loginPage.loginForm();
        loginPage.enterUserName("");
        loginPage.enterPassword("");
        loginPage.clickLogin();
        assertEquals(loginPage.actualTitle(), "І.UA - твоя пошта ", "The actual and expected title don’t match");
    }

    @Test(priority = 2)
    public void successfulLoginTest() {
        loginPage.open();
        loginPage.consentForm();
        loginPage.loginForm();
        loginPage.enterUserName("panivchnyn@gmail.com");
        loginPage.enterPassword("Pass2210");
        loginPage.clickLogin();
        assertEquals(loginPage.actualTitle(), "І.UA - твоя пошта ", "The actual and expected title don’t match");
    }

}