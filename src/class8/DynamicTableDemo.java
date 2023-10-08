package class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTableDemo {
   static String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);

        WebElement userName=driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");

        WebElement password=driver.findElement(By.name("ctl00$MainContent$password"));
        password.sendKeys("test");

        WebElement loginBtn=driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginBtn.click();

        List<WebElement> rows=driver.findElements(By.xpath(
                "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
        for (int i=1; i<rows.size(); i++){
            String rowText=rows.get(i).getText();
            System.out.println(rowText);

            if (rowText.contains("FamilyAlbum")){
                List<WebElement> checkBoxes=driver.findElements(By.xpath(
                        "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td [1]"));
                checkBoxes.get(i-1).click();

            }
        }


    }
}
