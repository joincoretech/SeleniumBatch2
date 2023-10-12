package class10;

import Utiles.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class TakeScreenShotDemo extends CommonMethod {
    public static void main(String[] args) throws InterruptedException {
        String url="https://dreamhiringacademy.com/";
        openDriver(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        takeScreenShot("ScreenShot/Login.png");
        /// //div[@class='password-agileits']/preceding-sibling::div/input
        WebElement userName=driver.findElement(By.name("name"));
        userName.sendKeys("admin@gmail.com");
        // //input[@name='name']/parent::div/following-sibling::div/input
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("admin#123");

        driver.findElement(By.cssSelector("input.login")).click();

       /* TakesScreenshot ts=(TakesScreenshot) driver;
        File sourceFile=ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(sourceFile, new File("ScreenShot/adminLogin.png"));
        }catch (IOException e){
         e.printStackTrace();
        }*/
        Thread.sleep(2000);
        takeScreenShot("ScreenShot/adminLogin1.png");

        teardown();
    }
}
