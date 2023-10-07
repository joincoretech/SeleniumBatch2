package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FluentWaitDemo {

    public static String url = "http://the-internet.herokuapp.com/dynamic_loading/1";

    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Wait<WebDriver> wait=new  FluentWait<>(driver).pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchFieldException.class).withTimeout(Duration.ofSeconds(20));

        WebElement btn = driver.findElement(By.xpath("//button[text()='Start']"));

        wait.until(ExpectedConditions.elementToBeClickable(btn));
        btn.click();

        WebElement textElement = driver.findElement(By.cssSelector("div#finish>h4"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#finish>h4")));
        String text = textElement.getText();
        if (text.equals("Hello World!")) {
            System.out.println("the text is as expected: " + text);
        } else {
            System.out.println("the text is not same as expected: " + text);
        }
        driver.quit();
    }
}