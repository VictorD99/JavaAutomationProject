package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest {

    //variabila globala
   public WebDriver driver;
    //metoda test
    @Test
    //metoda
    public void automationMethod(){
    //deschidere browser chrome,se foloseste la fel pt orice browser('C','F' etc)
    driver=new ChromeDriver();
    //accesam o pag web
    driver.get("https://demoqa.com/");
    //modificare dimensiune browser(mod maximize)
    driver.manage().window().maximize();
    //ierarhie locator / svg-nume al tag-ului,verificam id,clasa,name,partial link etc/daca nu gasim apelam la xpath si css /
    //gasim textul hardcodat(culoare neagra) folosim xpath(care este un locator),pt a apela Elements, ctrl F pe el
    //nu se face xpath absolut(prea mult cod,diferenata dintre ele este ca incepe cu /), trebuie facut relativ( // )
    //    //h5[text()='Elements']
    // declaram un element(este o variabila locala numita web element)
    WebElement Elementsfield=driver.findElement(By.xpath("//h5[text()='Elements']"));
    //facem scroll pt evitarea erorii
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,400)");

    //actiunea care trebuie sa o facem

    Elementsfield.click();

    WebElement WebTablefield=driver.findElement(By.xpath("//span[text()='Web Tables']"));
    WebTablefield.click();

    WebElement Addfield=driver.findElement(By.id("addNewRecordButton"));
    Addfield.click();

    WebElement FirstNamefield=driver.findElement(By.id("firstName"));
    String firstNameValue="Victor";
    FirstNamefield.sendKeys(firstNameValue);

    WebElement LastNamefield=driver.findElement(By.id("lastName"));
    String lastNameValue="Andrei";
    LastNamefield.sendKeys(lastNameValue);

    WebElement Emailfield =driver.findElement(By.id("userEmail"));
    String emailValue ="testing@testing.com";
    Emailfield.sendKeys(emailValue);

    WebElement Agefield =driver.findElement(By.id("age"));
    String ageValue ="40";
    Agefield.sendKeys(ageValue);

    WebElement Salaryfield =driver.findElement(By.id("salary"));
    String salaryValue ="1000";
    Salaryfield.sendKeys(salaryValue);

    WebElement Departmentfield =driver.findElement(By.id("department"));
    String departmentValue ="IT";
    Departmentfield.sendKeys(departmentValue);

    WebElement Submitfield=driver.findElement(By.id("submit"));
    Submitfield.click();


    }


}
