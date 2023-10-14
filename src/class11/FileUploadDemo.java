package class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {
    public static void main(String[] args) {
        String url="https://the-internet.herokuapp.com/";

        System.setProperty("Webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);

        WebElement fileUpload=driver.findElement(By.linkText("File Upload"));
        fileUpload.click();

        WebElement choseFileBtn=driver.findElement(By.id("file-upload"));
        choseFileBtn.sendKeys("C:\\Users\\azizu\\Pictures\\Screenshots\\login.png");

        WebElement uploadBtn=driver.findElement(By.id("file-submit"));
        uploadBtn.click();
        //driver.navigate().back();
       // driver.navigate().back();

    }
}
