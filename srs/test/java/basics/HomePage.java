package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;
    private final By CoursesButton =(By.id("btnMyCoursesList"));

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    public void CoursesButton(){

        driver.findElement(CoursesButton).click();
    }
}
