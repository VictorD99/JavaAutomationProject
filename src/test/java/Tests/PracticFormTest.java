package Tests;

import org.openqa.selenium.*;
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

        WebElement Picturefield = driver.findElement(By.id("uploadPicture"));
        //Picturefield.sendKeys("src/test/resources/1.png");
        File file = new File("src/test/resources/1.png");
        Picturefield.sendKeys(file.getAbsolutePath());

        WebElement maleRadioField = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        WebElement femaleRadioField = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        WebElement otherRadioField = driver.findElement(By.xpath("//label[@for='gender-radio-3']"));

        String genderRadioValue = "Male";

    //a doua varianta
        if (maleRadioField.getText().equals(genderRadioValue)) {
            maleRadioField.click();
        } else if (femaleRadioField.getText().equals(genderRadioValue)) {
            femaleRadioField.click();
        } else if (otherRadioField.getText().equals(genderRadioValue)) {
            otherRadioField.click();
        }

    //prima varianta
//        if (genderRadioValue.equals("Male")) {
//            maleRadioField.click();
//        } else if (genderRadioValue.equals("Female")) {
//            femaleRadioField.click();
//        } else if (genderRadioValue.equals("Other")) {
//            otherRadioField.click();
//        }

        WebElement SubjectsField = driver.findElement(By.id("subjectsInput"));
        String SubjectsValue = "Social Studies";
        SubjectsField.sendKeys(SubjectsValue);
        SubjectsField.sendKeys(Keys.ENTER);

        WebElement StateField = driver.findElement(By.id("react-select-3-input"));
        js.executeScript("arguments[0].click();", StateField);
        StateField.sendKeys("NCR");
        StateField.sendKeys(Keys.ENTER);

        WebElement CityField= driver.findElement(By.id("react-select-4-input"));
        js.executeScript("arguments[0].click();", CityField);
        CityField.sendKeys("Delhi");
        CityField.sendKeys(Keys.ENTER);

        WebElement SubmitElement= driver.findElement(By.id("submit"));
        js.executeScript("arguments[0].click();", SubmitElement);

    }

}
