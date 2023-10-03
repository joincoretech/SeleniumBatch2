package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsCommands {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

       WebElement userName= driver.findElement(By.cssSelector("input#ctl00_MainContent_username"));
       userName.sendKeys("Tester");

       WebElement password= driver.findElement(By.cssSelector("input[name$='password']"));
       password.sendKeys("test");

       WebElement loginButton=driver.findElement(By.cssSelector("input.button"));
       loginButton.click();

       WebElement checkBox=driver.findElement(By.cssSelector("input[id*='ctl02']"));

      boolean checkBoxIsEnabled= checkBox.isEnabled();

      if (checkBoxIsEnabled){
          System.out.println("check box is enabled");
      }else{
          System.out.println("check box is nor enabled");
      }
      boolean checkBoxIsDisplayed=checkBox.isDisplayed();
      System.out.println(checkBoxIsDisplayed);

      boolean isCheckBoxSelected=checkBox.isSelected();
      System.out.println("Before click "+ isCheckBoxSelected);
      checkBox.click();
      isCheckBoxSelected=checkBox.isSelected();
      System.out.println("After click "+ isCheckBoxSelected);
      driver.quit();






    }
}
