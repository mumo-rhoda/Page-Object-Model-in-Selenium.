package BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Baseclass {

    public static Properties prop;
    public static WebDriver driver;

    // load configuration properties url, username, password and browser
    public void loadConfig(){
        try {
            prop = new Properties();
            System.out.println("super constructor invoked");
            FileInputStream ip = new FileInputStream("Configurations/Config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //launching our test website
    public static void launchWeb() {

        if (prop.getProperty("browser").equalsIgnoreCase("edge")) {

            WebDriverManager.edgedriver().cachePath("drivers").setup();
            driver=new EdgeDriver();
        } else if (prop.getProperty("browser").equalsIgnoreCase("Firefox")) {
           WebDriverManager.firefoxdriver().cachePath("drivers").setup();
            driver = new FirefoxDriver();
        }
        //Maximize the screen
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        //Launching the URL
        driver.get(prop.getProperty("url"));

    }
}
