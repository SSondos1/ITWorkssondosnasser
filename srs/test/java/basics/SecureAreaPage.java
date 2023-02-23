package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SecureAreaPage {

    private WebDriver driver;
    private By creatcourse = By.id("btnListAddCourse");
    private By coursename = By.id("txtCourseName");
    private By coursesubject = By.id("courseSubject");
    private By coursegrade = By.id("courseGrade");
    private By selectteacher = By.xpath("//span[@class='btn btn-default form-control ui-select-toggle']");
    private By selectcourse = By.xpath("(//span[@class='lms-position-relative-imp lms-margin-start-10'])");
    private By coursesetting = By.xpath("(//div[@id=\"divCourseSetting\"]/div[1]/h4)");
    private By coursetype = By.id("divCourseTypedropdown");
    private By typeselected = By.id("pCourseDescription0");
    private By coursecapacity = By.id("courseCapacity");
    private By joinmethod = By.xpath("(//div[@class='col-xs-12 col-md-3 lms-text-align-start'])");
    private By locking = By.id("lblSessionsSequentiallyLocked");
    private By inclass = By.id("lblInClassAchievementCoverageType");
    private By quiz = By.id("lblQuizAchievementCoverageType");
    private By trialcount = By.id("lblResetCourse");
    private By count = By.id("resetCourseCount");
    private By videocoursesetting = By.xpath("(//h4[@ng-click='courseCntrl.toggleVideoBased()'])");
    private By enablepay = By.id("lblPlayCourse");
    private By create = By.id("btnSaveAsDraftCourse");


    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    public String CreatCourse() {
        driver.findElement(creatcourse).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public String CourseSetting() {
        driver.findElement(coursesetting).click();
        return null;
    }

    public String CourseName() {
        driver.findElement(coursename).sendKeys("math");
        return null;
    }

    public String CourseSubject() {
        WebElement courseSubject = driver.findElement(coursesubject);
        Select gradevalue = new Select(courseSubject);
        gradevalue.selectByValue("number:2");
        return null;
    }

    public String CourseGrade() {
        WebElement courseGrade = driver.findElement(coursegrade);
        Select gradevalue = new Select(courseGrade);
        gradevalue.selectByValue("number:14");
        return null;
    }


    public String SelectTeacher() {
        WebElement SelectTeacher = driver.findElement(selectteacher);
        SelectTeacher.click();
        WebElement selection = driver.findElement(By.id("ui-select-choices-0"));
        selection.click();
        return null;
    }

    public String SelectCourse() {
        WebElement SelectCourse = driver.findElement(selectcourse);
        SelectCourse.click();
        return null;
    }

    public String CourseType() {
        driver.findElement(coursetype).click();

        driver.findElement(typeselected).click();
        return null;
    }

    public String CourseCapacity() {
        driver.findElement(coursecapacity).click();
        driver.findElement(coursecapacity).sendKeys("3");

        return null;
    }

    public String JoinMethod() {
        driver.findElement(joinmethod).click();
        return null;
    }

    public String Locking() {
        driver.findElement(locking).click();
        return null;
    }

    public String InClass() {
        driver.findElement(inclass).click();
        return null;
    }

    public String Quiz() {
        driver.findElement(quiz).click();
        return null;
    }

    public String TrialCount() {
        driver.findElement(trialcount).click();
        return null;
    }

    public String Count() {
        driver.findElement(count).click();
        driver.findElement(count).sendKeys("0");

        return null;
    }

    public String VideoCourseSetting() {
        driver.findElement(videocoursesetting).click();
        return null;
    }

    public String EnablePay() {
        driver.findElement(enablepay).click();
        return null;
    }

    public void create() {
        driver.findElement(create).click();

    }

}
