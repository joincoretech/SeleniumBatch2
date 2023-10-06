package reviewClass2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

        // simple alert
        driver.findElement(By.xpath("//input[@name='alert']")).click();
        Alert simpleAlert=driver.switchTo().alert();
        System.out.println(simpleAlert.getText());
        Thread.sleep(2000);
        simpleAlert.accept();



        // confirmation alert
        driver.findElement(By.xpath("//input[@name='confirmation']")).click();
        Alert confirmAlert=driver.switchTo().alert();
        System.out.println("this is conformation alert text "+confirmAlert.getText());
        Thread.sleep(2000);
        confirmAlert.dismiss();

        // prompt alert
        driver.findElement(By.xpath("//input[@name='prompt']")).click();
        Alert promptAlert=driver.switchTo().alert();
         Thread.sleep(2000);
         String promptText=promptAlert.getText();
         System.out.println("this is prompt alert text : "+promptText);
         Thread.sleep(2000);
         promptAlert.sendKeys("Hello");
         Thread.sleep(2000);
         promptAlert.accept();



    }
}
