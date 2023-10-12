package Utiles;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import  org.apache.commons.io.FileUtils;
import org.openqa.selenium.devtools.v85.io.IO;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class CommonMethod {

    public  static WebDriver driver;

    public static void openDriver(String url){
        System.setProperty("Webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public static void takeScreenShot(String filePath){

        TakesScreenshot ts= (TakesScreenshot) driver;
        File sourceFile= ts.getScreenshotAs(OutputType.FILE);
         try{
             FileUtils.copyFile(sourceFile, new File(filePath));
         }catch (IOException e){
             e.printStackTrace();
         }

    }

    public static void teardown(){
        driver.quit();
    }

}
