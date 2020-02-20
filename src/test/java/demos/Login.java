package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;

import static junit.framework.TestCase.fail;

public class Login {
    @Test
    public void sdet() {
        //1. open webbrowser
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\willi\\Desktop\\WebdriverJavaCucumber\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\willi\\Desktop\\WebdriverJavaCucumber\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        //open url
        driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
//        //enter email
        driver.findElement(By.xpath("//*[@name = 'ctl00$MainContent$txtUserName']")).sendKeys("williamstravis228@yahoo.com");
//        //enter pass SeleniumClass
        driver.findElement(By.xpath("//input[@id='MainContent_txtPassword']")).sendKeys("SeleniumClass");
//        //click Logon
        driver.findElement(By.xpath("//input[@id='MainContent_btnLogin']")).click();
//        //get comfirmation

        if (driver.getTitle().equals("SDET Training | Account Management")){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
            //make it really fail if it fils
            fail("Test failed");//junit ..>>import static junit.framework.TestCase.fail;
        }

//        String message = driver.findElement(By.id("//small[@id='conf_message']")).getText();
//        System.out.println("Confirmation" + message);
//        //close
        driver.close();




    }
}
