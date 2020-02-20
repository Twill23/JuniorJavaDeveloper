package demos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountRefacto {
    @Test
    public void create () {
        String name = "John doe ";
        String email = "wweeddff@bang.com";
        String phoneNumber = "5566655444";
        String password = "53535t";
        String country = "United States";
        String browserType = "chrome";
        String gender = "Female";
        boolean weeklyEmail = true;
        boolean monthlyEmail = false;
        boolean ocassionalEmail = false;

        //Define Webdriver here
        WebDriver driver;
        driver = utilities.DriverFactory.open(browserType);

//        //Create WebDriver
//        if (browserType.equals("chrome")){
//            //code for chrome
//            System.setProperty("webdriver.chrome.driver", "C:\\Users\\willi\\Desktop\\WebdriverJavaCucumber\\chromedriver.exe");
//            driver = new ChromeDriver();
//            System.out.println("Running In Chrome");
//
//        }else {
//            //code for Firefox
//            System.setProperty("webdriver.gecko.driver", "C:\\Users\\willi\\Desktop\\WebdriverJavaCucumber\\geckodriver.exe");
//            driver = new FirefoxDriver();
//            System.out.println("Running In FireFox");
//        }
       //instead of calling
        //iinstead of calling browser like above use thr driver factory Create WebDriver
        //Open Browser to Account Management page >> Click on Create Account
        //Define Elements
        driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
        //driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[(text() = 'Create Account' or . = 'Create Account')]")).click();

        WebElement nameElement = driver.findElement(By.xpath("//*[@id = 'MainContent_txtFirstName']"));
        WebElement emailElement = driver.findElement(By.xpath("//input[@id='MainContent_txtEmail']"));
        WebElement phoneNumberElement = driver.findElement(By.xpath("//*[@id = 'MainContent_txtHomePhone']"));
        WebElement passwordElement = driver.findElement(By.xpath("//*[@type = 'password' and @id = 'MainContent_txtPassword']"));
        WebElement verifyPasswordElement = driver.findElement(By.xpath("//input[@id='MainContent_txtVerifyPassword']"));
        WebElement countryElement = driver.findElement(By.xpath("//select[@id='MainContent_menuCountry']"));
        WebElement maleRadioElement = driver.findElement(By.xpath("//input[@id='MainContent_Male']"));
        WebElement femaleRadioElement = driver.findElement(By.xpath("//input[@id='MainContent_Female']"));
        WebElement weeklyCheckbox = driver.findElement(By.xpath("//*[@id = 'MainContent_checkWeeklyEmail' and @type = 'checkbox']"));


        //fill out forms
        nameElement.sendKeys(name);
        emailElement.sendKeys(email);
        phoneNumberElement.sendKeys(phoneNumber);
        passwordElement.sendKeys(password);
        verifyPasswordElement.sendKeys(password);
        //dropdown enter act with html elements
        Select drpdown = new Select(countryElement);
        drpdown.selectByVisibleText(country);
        drpdown.selectByIndex(0);

        //gender Radio button algorithim
        if(gender.equalsIgnoreCase("Male")){
            maleRadioElement.click();
        }else {
            femaleRadioElement.click();
        }

        //Check Box Algorithm
        if (weeklyEmail){

            if (!weeklyCheckbox.isSelected()){
                weeklyCheckbox.click();
            }
        }else {
            if(weeklyCheckbox.isSelected()){
                weeklyCheckbox.click();
            }
        }
        //driver.findElement(By.xpath("//*[@id = 'MainContent_checkWeeklyEmail' and @type = 'checkbox']")).click();

        driver.findElement(By.xpath("//input[@id='MainContent_btnSubmit']")).click();

       String conf = driver.findElement(By.xpath("//span[@id='MainContent_lblTransactionResult']")).getText();
       String expected = "Customer information added successfully";
       if (conf.contains(expected)){
           System.out.println("CONFIRMATION: " + conf);
       }else {
           System.out.println("Test Failed");
       }

//        driver.findElement(By.xpath("//select[@id='MainContent_menuCountry']")).click();
//        driver.findElement(By.xpath("//*[@id = 'MainContent_menuCountry' and (text() = 'United States' or . = 'United States')]")).click();

       // driver.close();


    }
}
