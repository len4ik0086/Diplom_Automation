package diplom.tests;

import diplom.pages.JobPage;
import diplom.pages.BlogPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HeaderTests extends BaseTest {

    private JobPage jobPage;

    private BlogPage blogPage;

    @BeforeMethod
    public void setUp() {
        jobPage = new JobPage(webDriver);
        blogPage = new BlogPage(webDriver);
    }

    @Test(priority = 1)
    public void jobPageCheckHeader() {
        jobPage.open();
        jobPage.consentForm();
        jobPage.headerComponent.navigateToJobPage();
        assertEquals(jobPage.actualTitle(), "Работа в Киеве и Украине ", "The actual and expected title don’t match");

    }

    @Test(priority = 1)
    public void blogPageCheckHeader() {
        blogPage.open();
        blogPage.consentForm();
        blogPage.headerComponent.navigateToBlogPage();
        assertEquals(blogPage.actualTitle(), "Блоги - I.UA ", "The actual and expected title don’t match");

    }

}
