package tests;

import baseclasses.TestBase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pageobjects.Article;
import pageobjects.Homepage;
import pageobjects.Searchresult;

public class TestSearch extends TestBase {

    private Homepage homepage;
    private Searchresult searchresult;
    private Article article;

    @Before
    public void setUp() {
        //Create a Page object for every page in the testcase
        homepage = new Homepage(driver);
        searchresult = new Searchresult(driver);
        article = new Article(driver);
    }

    @Test
    public void testSearch(){
        //Visit website at www.aoe.com
        //Use the search field to search for "blog" via form submit
        homepage.openSearch();
        homepage.typeSearch("blog");
        homepage.submitSearch();

        //Open the first entry which is displayed on the search result page
        searchresult.openFirstArticle();

        //Check that the content of this article is being displayed
        Assert.assertTrue(article.checkContent());
    }
}
