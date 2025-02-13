package Tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Exercitii {

    public WebDriver driver;

    /*@Test
    public void firstEx() {

        driver = new ChromeDriver();

        driver.get("https://letcode.in/forms");

        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");

        WebElement fieldCountryCode = driver.findElement(By.xpath("//label[@id='countrycode']/following::select[1]"));
        fieldCountryCode.click();
        fieldCountryCode.sendKeys("Romania (+40)");
        fieldCountryCode.sendKeys(Keys.ENTER);

        WebElement fieldCountry = driver.findElement(By.xpath("//label[@id='country']/following::select[1]"));
        fieldCountry.click();
        fieldCountry.sendKeys("Romania");
        fieldCountry.sendKeys(Keys.ENTER);

    } */

    /*@Test
    public void secondEx() {

        driver = new ChromeDriver();

        driver.get("https://www.airbnb.ie/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement acceptButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Accept all']")));
        acceptButton.click();

        WebElement fieldIcons = driver.findElement(By.xpath("//span[text()='Icons']"));
        fieldIcons.click();

        Assert.assertTrue(fieldIcons.isDisplayed(), "Icons menu was not selected!");
        System.out.println("Icons menu was successfully selected!");

//        boolean isSelected = fieldIcons.isDisplayed();
//        System.out.println("Icons menu was successfully clicked: " + isSelected);
//        Assert.assertTrue(isSelected, "Icons menu was not clicked!");

    }    */

    @Test
    public void thirdEX() {

        driver = new ChromeDriver();

        driver.get("https://www.barnesandnoble.com/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")));
        closeButton.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,0)");

        WebElement fieldKids = driver.findElement(By.id("rhfCategoryFlyout_Kids"));
        fieldKids.click();

        WebElement fieldAgeRestriction = driver.findElement(By.xpath("(//ul[@id='sidebar-section-Ages']//a[text()='3 - 5 years'])[1]"));
        fieldAgeRestriction.click();

//        WebElement selectedMenu = driver.findElement(By.xpath("(//ul[@id='sidebar-section-Ages']//a[text()='3 - 5 years'])[1]"));
//        Assert.assertTrue(selectedMenu.isDisplayed(), "The '3 - 5 years' menu was NOT selected!");
//        System.out.println("The '3 - 5 years' menu was successfully selected!");


    }
}
