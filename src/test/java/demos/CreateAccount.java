package demos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class CreateAccount {
    @Test
    public void create () {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\willi\\Desktop\\WebdriverJavaCucumber\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[(text() = 'Create Account' or . = 'Create Account')]")).click();
        driver.findElement(By.xpath("//*[@id = 'MainContent_txtFirstName']")).sendKeys("tetette");
        driver.findElement(By.xpath("//input[@id='MainContent_txtEmail']")).sendKeys("wweeddff@bang.com");
        //driver.findElement(By.xpath("")).sendKeys();
        driver.findElement(By.xpath("//*[@id = 'MainContent_txtHomePhone']")).sendKeys("5566655444");
        driver.findElement(By.xpath("//input[@id='MainContent_Male']")).click();
        driver.findElement(By.xpath("//*[@type = 'password' and @id = 'MainContent_txtPassword']")).sendKeys("rrrrrrrr");
        driver.findElement(By.xpath("//input[@id='MainContent_txtVerifyPassword']")).sendKeys("rrrrrrrr");
        //dropdown
        Select drpdown = new Select(driver.findElement(By.xpath("//select[@id='MainContent_menuCountry']")));
        drpdown.selectByVisibleText("United States");
        drpdown.selectByIndex(0);
//        driver.findElement(By.xpath("//select[@id='MainContent_menuCountry']")).click();
//        driver.findElement(By.xpath("//*[@id = 'MainContent_menuCountry' and (text() = 'United States' or . = 'United States')]")).click();

       // driver.close();


    }
}
