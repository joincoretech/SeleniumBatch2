package class6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");

        // this is simple alert
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

        //Thread.sleep(2000);
        // confirm alert
        driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel '] ")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Alert confirmAlert=driver.switchTo().alert();
        String alertText=confirmAlert.getText();
        System.out.println("this is confirm alert text "+alertText);
        Thread.sleep(1000);
        confirmAlert.dismiss();

        // prompt alert

        driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        Alert promptAlert=driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(promptAlert.getText());
        promptAlert.sendKeys("Joincoretech");
        Thread.sleep(2000);
        promptAlert.accept();

        driver.quit();
    }
}
