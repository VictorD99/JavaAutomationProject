package Tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exercitii {

    public WebDriver driver;

    @Test
    public void firstEx() {

        driver = new ChromeDriver();

        driver.get("https://letcode.in/forms");

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

    }

}
