package basics;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

public class LoginTests {
    private By coursesButton = By.id("btnMyCoursesList");
    private By courseName = By.id("lnkListCourseSelcted");
    private By search = By.id("txtCourseSearch");
    private By searchButton = By.id("btnCourseSearch");

    private WebDriver driver;

    public LoginTests(WebDriver driver) {

        this.driver = driver;
    }
     @Test
    public void testaddcourse(){
   }
        public LoginPage CoursesButton() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(coursesButton).click();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(search).sendKeys("math");
            driver.findElement(searchButton).click();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            String contents = driver.findElement(courseName).getAttribute("innerHTML");
            assertEquals (contents, "math");

            return null;
        }
}
