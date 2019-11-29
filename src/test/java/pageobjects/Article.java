package pageobjects;

import baseclasses.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Article extends Base {


    @FindBy(xpath = "//div[@id='c29299']/div/div/p")
    private List<WebElement> texts;

    public Article(WebDriver driver) {
        super(driver);
    }

    //Takes a list of webelements and checks whether they are empty
    public boolean checkContent(){
        boolean result = true;
        for (int i=0; i<texts.size();i++){
            if(!textIsVisible(texts.get(i), 1)){
                result = false;
            }
        }
        return result;
    }
}
