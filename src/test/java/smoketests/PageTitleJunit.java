package smoketests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class PageTitleJunit {
    // Declare variables and objrcts at Class level in order to access in multiple methods through program
    WebDriver driver;
    String webUrl = "http://sdettraining.com/trguitransactions/NewAccount.aspx";

    @Test
    public void pageTitleTest(){
        System.out.println("Running the test");
        driver.get(webUrl);
        String actualTitle = driver.getTitle();
        String expectedTitle = "SDET Training | Register New Account";
        Assert.assertEquals(expectedTitle, actualTitle);
        //Assert.fail("We intentionaly failed this test");

    }

    @Before
    public void setUP(){
        System.out.println("Setting up test");
        System.out.println("Intializing the driver");
        //call driver factory
        driver = utilities.DriverFactory.open("chrome");
    }

    @After
    public void tearDown(){
        System.out.println("Closing the test");
        System.out.println("Closing the driver");
        driver.close();
    }
}
