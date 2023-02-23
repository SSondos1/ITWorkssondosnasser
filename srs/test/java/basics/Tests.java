package basics;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class Tests {
    private final By coursesButton = By.id("btnMyCoursesList");
    private final By courseName = By.id("lnkListCourseSelcted");
    private final By search = By.id("txtCourseSearch");
    private final By searchButton = By.id("btnCourseSearch");

    private final WebDriver driver;

    public Tests(WebDriver driver) {

        this.driver = driver;
    }
     @Test
    public void testaddcourse(){
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
    }}
