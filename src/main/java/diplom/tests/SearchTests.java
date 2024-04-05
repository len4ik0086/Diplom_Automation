package diplom.tests;

import diplom.pages.HomePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchTests extends BaseTest {

    private HomePage homePage;

    @BeforeMethod
    public void setUp() {
        homePage = new HomePage(webDriver);
    }

    @Test(priority = 1)
    public void searchFieldIsAvailable() {
        open();
        consentForm();
        boolean isDisplayed = homePage.searchField().isDisplayed();
        Assert.assertTrue(isDisplayed, "Search field is absent");
    }

    @Test(priority = 2)
    public void searchWithEmptyValue() {
        String searchValue = "";

        open();
        consentForm();

        WebElement input = homePage.searchField();
        input.clear();
        input.sendKeys(searchValue);
        input.sendKeys(Keys.ENTER);

        boolean isElementDisplayed = false;
        try {
            isElementDisplayed = homePage.searchFieldResult().isDisplayed();
        } catch (NoSuchElementException ne) {
        }

        Assert.assertFalse(isElementDisplayed, "No result expected, search value should be input");
    }

    @DataProvider(name = "searchSymbols")
    public Object[][] searchSymbolData() {
        return new Object[][]{
                {"#"},
                {"@"},
                {"%"},

        };
    }

    @Test(dataProvider = "searchSymbols", priority = 2)
    public void searchWithSpecialSymbols(String searchValue) {

        open();
        consentForm();

        WebElement input = homePage.searchField();
        input.clear();
        input.sendKeys(searchValue);
        input.sendKeys(Keys.ENTER);

        boolean isElementDisplayed = false;
        try {
            isElementDisplayed = homePage.searchFieldResult().isDisplayed();
        } catch (NoSuchElementException ne) {
        }

        Assert.assertTrue(isElementDisplayed, "Should not search with: " + searchValue);
    }

}