package pageobjects;

import baseclasses.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchresult extends Base {


    @FindBy(id = "hs-eu-confirmation-button")
    private WebElement cookieConfirmationButton;
    @FindBy(xpath = "//div[@class='insights-section result-insights ng-scope']/div/div[1]/a")
    private WebElement firstArticle;

    public Searchresult(WebDriver driver) {
        super(driver);
    }

    public void acceptCookie(){
        click(cookieConfirmationButton, 4);
    }

    public void openFirstArticle(){
        click(firstArticle, 4);
    }
}
