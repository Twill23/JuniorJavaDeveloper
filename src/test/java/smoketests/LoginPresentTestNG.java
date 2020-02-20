package smoketests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginPresentTestNG {
    WebDriver driver;

    @Test
    public void loginElementsPresentTest(){
        System.out.println("Running test");



        //driver.get("http://sdettraining.com/trguitransactions/NewAccount.aspx");

        boolean userNameElement = driver.findElement(By.xpath("//input[@id='MainContent_txtUserName']")).isDisplayed();
        boolean passwordElement = driver.findElement(By.xpath("//input[@id='MainContent_txtPassword']")).isDisplayed();
        Assert.assertTrue(userNameElement, "Email textbox Present");
        Assert.assertTrue(passwordElement, "Password box is not");
    }

    @BeforeMethod
    public void setup(){
        System.out.println("Starting test");
        driver = utilities.DriverFactory.open("chrome");
        String webUrl = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";
        driver.get(webUrl);
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("Closing test");
        driver.close();
    }

}
