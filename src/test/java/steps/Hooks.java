package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.Screenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    private static boolean driverIsSetup = false;
    public static WebDriver driver;


    @Before
    public void browserSetup() {
        if(!driverIsSetup) {
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
            driverIsSetup = true;
        }
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver=new ChromeDriver(options);
        driver.manage().deleteAllCookies();
    }


    @After
    public void takeScreenshotIfFailed(Scenario scenario){
        if (scenario.isFailed()) {
            System.out.println("Failed test: "+scenario.getName());
            Screenshot.capture(driver, scenario.getName());
        }
        driver.quit();
    }


}

