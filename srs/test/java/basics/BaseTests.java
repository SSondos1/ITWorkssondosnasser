package basics;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseTests {

    private final WebDriver driver;

    public BaseTests(WebDriver driver){
        this.driver = driver;
    }

    @BeforeClass
    public void setup() {

        driver.get("https://swinji.azurewebsites.net");

    }


    @AfterClass
    public void tearDown() {

       driver.quit();
    }

}
