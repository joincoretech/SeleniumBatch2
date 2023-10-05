package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("a[href='#checkbox']")).click();

        List<WebElement> checkboxes=driver.findElements(By.cssSelector("input[type='checkbox']"));
        System.out.println(checkboxes.size());
        /*for (WebElement checkbox: checkboxes){ // this code will select all checkboxes
            checkbox.click();
        }*/

        for (WebElement checkbox: checkboxes){
            String value=checkbox.getAttribute("value");
            if (value.equalsIgnoreCase("red")){
                Thread.sleep(2000);
                checkbox.click();
                break;
            }
        }

        driver.quit();
    }
}
