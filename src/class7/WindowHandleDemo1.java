package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandleDemo1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="http://accounts.google.com/signup";
        driver.get(url);
        driver.manage().window().maximize();

        String mainPageHandle=driver.getWindowHandle();
        System.out.println(mainPageHandle);

        WebElement helpLink=driver.findElement(By.linkText("Help"));
        helpLink.click();

        Set <String> windowHandles=driver.getWindowHandles();
        System.out.println(windowHandles.size());

        Iterator <String> iterator=windowHandles.iterator();
        mainPageHandle=iterator.next();
       String  childWindowHandle=iterator.next();
       System.out.println(childWindowHandle);

       driver.findElement(By.id("firstName")).sendKeys("JoinCoreTech");
       driver.switchTo().window(childWindowHandle);

       driver.findElement(By.name("q")).sendKeys("Login Help");
       driver.switchTo().window(mainPageHandle);
      // driver.close();
       driver.quit();


    }
}
