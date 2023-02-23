package basics;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setup() {
            System.setProperty("webdriver.chrome.driver","srs/test/resources/chromedriver_win32.exe");
            //WebDriver driver = new WebDriver();

            driver.get("https://swinji.azurewebsites.net");

        }


    @AfterClass
    public void tearDown() {

       driver.quit();
    }

}
