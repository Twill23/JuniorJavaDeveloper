package smoketests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ATagsTest {
    WebDriver driver;

    @Test
    public void aTagsLinksTest(){

        System.out.println("Running test");
        // get all a tags on page
        boolean createAccountPresent = false;

        //driver.get("http://sdettraining.com/trguitransactions/NewAccount.aspx");
        List<WebElement> aElements = driver.findElements(By.tagName("a"));

        int numberOfAElements = aElements.size();
        System.out.println("There are " + numberOfAElements + " a tags on the page");

        for(WebElement aElement : aElements){
            System.out.println(aElement.getText());
            if (aElement.getText().equals("CREATE ACCOUNT")){
                createAccountPresent = true;
                break;
            }
        }
        //Assertion
        Assert.assertTrue(createAccountPresent);

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

