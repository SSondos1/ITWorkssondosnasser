package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","srs/test/resources/chromedriver_win32.exe");
        WebDriver driver = new ChromeDriver();

        BaseTests baseTests = new BaseTests(driver);
        baseTests.setup();


        LoginPage loginPage = new LoginPage(driver);
        loginPage.UserNameField("testregister@aaa.com");
        loginPage.passwordfield("Wakram_123");
        loginPage.loginbutton();

        HomePage homePage = new HomePage(driver);
        homePage.CoursesButton();

        CreateCourse createCourse = new CreateCourse(driver);
        createCourse.CreatCourse();
        createCourse.CourseName();
        createCourse.CourseSubject();
        createCourse.CourseGrade();
        createCourse.SelectTeacher();
        createCourse.SelectCourse();
        createCourse.CourseSetting();
        createCourse.CourseType();
        createCourse.CourseCapacity();
        createCourse.JoinMethod();
        createCourse.Locking();
        createCourse.InClass();
        createCourse.Quiz();
        createCourse.TrialCount();
        createCourse.Count();
        createCourse.VideoCourseSetting();
        createCourse.EnablePay();
        createCourse.create();

        Tests tests = new Tests(driver);
        tests.testaddcourse();

        baseTests.tearDown();

    }
}
