package baseclasses;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Base {

    private WebDriver driver;

    public Base(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    //Driver opens url
    public void visit(String url){
        try {
            driver.get(url);
        }
        catch (WebDriverException wde) {
            System.out.println(wde);
            Assert.fail();
        }
    }

    //Click on buton(webelement)
    public void click(WebElement element, int timeout) {
            try {
                new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element)).click();
            }
            catch (WebDriverException wde) {
                System.out.println(wde);
                Assert.fail();
            }
    }

    //Set inputText in textbox(webelement)
    public void type(WebElement element, int timeout, String inputText) {
        try {
            new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element)).sendKeys(inputText);
        }
        catch (WebDriverException wde) {
            System.out.println(wde);
            Assert.fail();
        }
    }

    //Click enter
    public void submit(WebElement element, int timeout){
        try {
            new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element)).sendKeys(Keys.RETURN);
        }
        catch (WebDriverException wde) {
            System.out.println(wde);
            Assert.fail();
        }
    }

    //checks whether text is empty
    public boolean textIsVisible(WebElement element, int timeout){
        try {
            if(element.getText().isEmpty()){
                return false;
            }else{
                return true;
            }
        }
        catch (WebDriverException wde) {
            System.out.println(wde);
            return false;
        }
    }


}
