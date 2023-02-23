package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateCourse {
    private final WebDriver driver;
    private final By creatcourse = By.id("btnListAddCourse");
    private final By coursename = By.id("txtCourseName");
    private final By coursesubject = By.id("courseSubject");
    private final By coursegrade = By.id("courseGrade");
    private final By selectteacher = By.xpath("//span[@class='btn btn-default form-control ui-select-toggle']");
    private final By selectcourse = By.xpath("(//span[@class='lms-position-relative-imp lms-margin-start-10'])");
    private final By coursesetting = By.xpath("(//div[@id=\"divCourseSetting\"]/div[1]/h4)");
    private final By coursetype = By.id("divCourseTypedropdown");
    private final By typeselected = By.id("pCourseDescription0");
    private final By coursecapacity = By.id("courseCapacity");
    private final By joinmethod = By.xpath("(//div[@class='col-xs-12 col-md-3 lms-text-align-start'])");
    private final By locking = By.id("lblSessionsSequentiallyLocked");
    private final By inclass = By.id("lblInClassAchievementCoverageType");
    private final By quiz = By.id("lblQuizAchievementCoverageType");
    private final By trialcount = By.id("lblResetCourse");
    private final By count = By.id("resetCourseCount");
    private final By videocoursesetting = By.xpath("(//h4[@ng-click='courseCntrl.toggleVideoBased()'])");
    private final By enablepay = By.id("lblPlayCourse");
    private final By create = By.id("btnSaveAsDraftCourse");

    public CreateCourse(WebDriver driver) {

        this.driver = driver;
    }

    public void CreatCourse() {
        driver.findElement(creatcourse).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void CourseSetting() {
        driver.findElement(coursesetting).click();
    }

    public void CourseName() {
        driver.findElement(coursename).sendKeys("math");
    }

    public void CourseSubject() {
        WebElement courseSubject = driver.findElement(coursesubject);
        Select gradevalue = new Select(courseSubject);
        gradevalue.selectByValue("number:2");
    }

    public void CourseGrade() {
        WebElement courseGrade = driver.findElement(coursegrade);
        Select gradevalue = new Select(courseGrade);
        gradevalue.selectByValue("number:14");
    }


    public void SelectTeacher() {
        WebElement SelectTeacher = driver.findElement(selectteacher);
        SelectTeacher.click();
        WebElement selection = driver.findElement(By.id("ui-select-choices-0"));
        selection.click();
    }

    public void SelectCourse() {
        WebElement SelectCourse = driver.findElement(selectcourse);
        SelectCourse.click();
    }

    public void CourseType() {
        driver.findElement(coursetype).click();
        driver.findElement(typeselected).click();
    }

    public void CourseCapacity() {
        driver.findElement(coursecapacity).click();
        driver.findElement(coursecapacity).sendKeys("3");
    }

    public void JoinMethod() {
        driver.findElement(joinmethod).click();
    }

    public void Locking() {
        driver.findElement(locking).click();
    }

    public void InClass() {
        driver.findElement(inclass).click();
    }

    public void Quiz() {
        driver.findElement(quiz).click();
    }

    public void TrialCount() {
        driver.findElement(trialcount).click();
    }

    public void Count() {
        driver.findElement(count).click();
        driver.findElement(count).sendKeys("0");
    }

    public void VideoCourseSetting() {
        driver.findElement(videocoursesetting).click();
    }

    public void EnablePay() {
        driver.findElement(enablepay).click();
    }

    public void create() {
        driver.findElement(create).click();
    }
}
