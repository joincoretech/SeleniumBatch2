package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement enabledBTN=driver.findElement(By.xpath("//button[text()='Enable']"));
        enabledBTN.click();

       // driver.findElement(By.cssSelector("form#input-example>input")).sendKeys("Hello");
        WebElement textElement=driver.findElement(By.id("message"));
        System.out.println("is text displayed : "+textElement.isDisplayed());

      driver.close();
    }
}
