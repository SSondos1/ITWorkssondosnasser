package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;

    private final By usernamefield = By.id("Email");
    private final By passwordfield = By.id("inputPassword");
    private final By loginbutton = By.id("btnLogin");
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void UserNameField(String username){
        driver.findElement(usernamefield).sendKeys(username);
    }
    public void passwordfield(String password){
        driver.findElement(passwordfield).sendKeys(password);
    }
    public void loginbutton(){
        driver.findElement(loginbutton).click();
    }

}
