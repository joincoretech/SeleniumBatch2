package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandleDemo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://demoqa.com/browser-windows";
        driver.get(url);
        driver.manage().window().maximize();

        driver.findElement(By.id("windowButton")).click();

        String mainPageHandle=driver.getWindowHandle();

        Set<String>  allWindowHandles=driver.getWindowHandles();

        Iterator<String> iterator=allWindowHandles.iterator();
        while (iterator.hasNext()){
            String childWindowHandle=iterator.next();

            if (!mainPageHandle.equals(childWindowHandle)){
                driver.switchTo().window(childWindowHandle);
                WebElement textElement=driver.findElement(By.id("sampleHeading"));
                System.out.println("this is child window text : "+textElement.getText());

                if (textElement.getText().equals("This is a sample page")){
                    System.out.println("the text is as expected");
                }else {
                    System.out.println("text is not same as expected");
                }
            }

        }

         driver.switchTo().window(mainPageHandle);
          driver.quit();
    }
}
