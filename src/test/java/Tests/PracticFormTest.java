package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.io.File;

public class PracticFormTest {
    public WebDriver driver;
    @Test
    public void automationMethod() {

        driver = new ChromeDriver();

        driver.get("https://demoqa.com/");

        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");

        WebElement Formsfield=driver.findElement(By.xpath("//h5[text()='Forms']"));
        Formsfield.click();

        WebElement PracticeFormfield= driver.findElement(By.xpath("//span[text()='Practice Form']"));
        PracticeFormfield.click();

        WebElement FirstNamefield=driver.findElement(By.id("firstName"));
        String firstNameValue="Victor";
        FirstNamefield.sendKeys(firstNameValue);

        WebElement LastNamefield=driver.findElement(By.id("lastName"));
        String lastNameValue="Andrei";
        LastNamefield.sendKeys(lastNameValue);

        WebElement Emailfield=driver.findElement(By.id("userEmail"));
        String emailValue="testing2@testing.com";
        Emailfield.sendKeys(emailValue);

        WebElement Mobilefield=driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        String mobileValue="0774334455";
        Mobilefield.sendKeys(mobileValue);

        WebElement Picturefield= driver.findElement(By.id("uploadPicture"));
        //Picturefield.sendKeys("src/test/resources/1.png");
        File file = new File("src/test/resources/1.png");
        Picturefield.sendKeys(file.getAbsolutePath());


    }

}
