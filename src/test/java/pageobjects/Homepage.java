package pageobjects;

import baseclasses.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Base {

    @FindBy(xpath = "//a[@data-qa='header-navigation-search-icon']")
    private WebElement searchButton;
    @FindBy(id = "search")
    private WebElement searchTextField;

   public Homepage(WebDriver driver){
       super(driver);
       visit("http://www.aoe.com");
   }

   public void openSearch() {
       click(searchButton,4);
   }

   public void typeSearch(String input) {
        type(searchTextField, 4, input);
   }

   public void submitSearch(){
       submit(searchTextField, 4);
   }
}
