package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {
    //This method return a WebDriver object

    public  static WebDriver open(String browserType){
        //Create WebDriver
        if (browserType.equalsIgnoreCase("chrome")){
            //code for chrome
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\willi\\Desktop\\WebdriverJavaCucumber\\chromedriver.exe");
            return new ChromeDriver();

        }else if (browserType.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.ie.driver", "C:\\Users\\willi\\Desktop\\WebdriverJavaCucumber\\IEDriverServer.exe");
            //            //add this for IE to ignore security setting pass it to the driver
            //options.ignoreZoomSettings(); //options is passed to driver
            InternetExplorerOptions options = new  InternetExplorerOptions();
            options.introduceFlakinessByIgnoringSecurityDomains();
            options.ignoreZoomSettings();
            return new InternetExplorerDriver(options);




//            WebDriver driver = new InternetExplorerDriver(options);
//            driver.get("http://microsoft.com");
//            driver.manage().window().maximize();
//            driver.close();

//            DesiredCapabilities cap = new DesiredCapabilities(browserType);
//            cap.setCapability("nativeEvents", false);
//            cap.setCapability("unexpectedAlertBehaviour", "accept");
//            cap.setCapability("ignoreProtectedModeSettings", true);
//            cap.setCapability("disable-popup-blocking", true);
//            cap.setCapability("enablePersistentHover", true);
//            cap.setCapability("ignoreZoomSetting", true);
//            cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
//            InternetExplorerOptions options = new InternetExplorerOptions();
//            options.merge(cap);
//            WebDriver driver = new InternetExplorerDriver(options);

        }else {
            //code for Firefox
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\willi\\Desktop\\WebdriverJavaCucumber\\geckodriver.exe");
            return new FirefoxDriver();

        }

    }
}
