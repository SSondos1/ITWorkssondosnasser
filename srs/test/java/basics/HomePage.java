package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By CoursesButton =(By.id("btnMyCoursesList"));

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    public LoginPage CoursesButton(){

        driver.findElement(CoursesButton).click();
        return null;
    }
}
