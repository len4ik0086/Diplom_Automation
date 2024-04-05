package diplom.tests;

import diplom.pages.BlogPage;
import diplom.pages.JobPage;
import diplom.pages.LinksPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HeaderTests extends BaseTest {

    private JobPage jobPage;

    private BlogPage blogPage;

    private LinksPage linksPage;

    @BeforeMethod
    public void setUp() {
        jobPage = new JobPage(webDriver);
        blogPage = new BlogPage(webDriver);
        linksPage = new LinksPage(webDriver);
    }

    @Test(priority = 1)
    public void jobPageCheckHeader() {
        open();
        consentForm();
        jobPage.headerComponent.navigateToJobPage();
        assertEquals(jobPage.actualTitle(), "Работа в Киеве и Украине ", "The actual and expected title don’t match");

    }

    @Test(priority = 1)
    public void blogPageCheckHeader() {
        open();
        consentForm();
        blogPage.headerComponent.navigateToBlogPage();
        assertEquals(blogPage.actualTitle(), "Блоги - I.UA ", "The actual and expected title don’t match");

    }

    @Test(priority = 1)
    public void linksPageCheckHeader() {
        open();
        consentForm();
        linksPage.headerComponent.navigateToLinksPage();
        assertEquals(linksPage.actualTitle(), "Закладки - I.UA ", "The actual and expected title don’t match");
    }

}
