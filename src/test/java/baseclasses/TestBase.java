package baseclasses;

import org.junit.Rule;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    protected WebDriver driver;

    @Rule
    public ExternalResource externalResource = new ExternalResource() {

        @Override
        protected void before() throws Throwable {
            //Setting up the environment for the test
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/driver/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

        @Override
        protected void after() {
            //Shutdown the driver and close the browser
            driver.quit();
        }
    };
}
