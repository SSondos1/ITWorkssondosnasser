package basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeDriverUsingDriver {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","srs/test/resources/chromedriver_win32.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://swinji.azurewebsites.net");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.UserNameField("testregister@aaa.com");
        loginPage.passwordfield("Wakram_123");
        loginPage.loginbutton();

        HomePage homePage = new HomePage(driver);
        homePage.CoursesButton();

        SecureAreaPage secureAreaPage = new SecureAreaPage(driver);
        secureAreaPage.CreatCourse();
        secureAreaPage.CourseName();
        secureAreaPage.CourseSubject();
        secureAreaPage.CourseGrade();
        secureAreaPage.SelectTeacher();
        secureAreaPage.SelectCourse();
        secureAreaPage.CourseSetting();
        secureAreaPage.CourseType();
        secureAreaPage.CourseCapacity();
        secureAreaPage.JoinMethod();
        secureAreaPage.Locking();
        secureAreaPage.InClass();
        secureAreaPage.Quiz();
        secureAreaPage.TrialCount();
        secureAreaPage.Count();
        secureAreaPage.VideoCourseSetting();
        secureAreaPage.EnablePay();
        secureAreaPage.create();

        LoginTests loginTests = new LoginTests(driver);
        loginTests.CoursesButton();

        driver.quit();

    }
}
