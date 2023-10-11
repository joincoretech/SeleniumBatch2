package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class callanderDemo {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://dreamhiringacademy.com/user/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement userName=driver.findElement(By.id("username"));
        userName.sendKeys("aziz@gmail.com");

        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("aziz@123");

        WebElement loginBtn=driver.findElement(By.xpath("//button[@type='submit']"));
        loginBtn.click();

        WebElement leaveTab=driver.findElement(By.cssSelector("a[title='Leave']"));
        leaveTab.click();

        WebElement applyTab=driver.findElement(By.cssSelector("a[href*='apply']"));
        applyTab.click();

        WebElement leaveType=driver.findElement(By.id("country"));
        Select select=new Select(leaveType);
        select.selectByVisibleText("Sick leave");

        driver.findElement(By.id("lname")).sendKeys("JoinCoreTech");

        driver.findElement(By.id("StartDate")).click();

        List<WebElement> startDates=driver.findElements(By.xpath("//table/tbody/tr/td "));
        System.out.println(startDates.size());

        for (WebElement startDate: startDates){
            String startDateText=startDate.getText();
            if (startDateText.equals("29")){
                startDate.click();
                break;
            }
        }

        driver.findElement(By.id("EndDate")).click();

        WebElement nextBtn=driver.findElement(By.xpath("(//button[@class='xdsoft_next'])[1]"));

        WebElement month=driver.findElement(By.xpath("(//div[@class='xdsoft_label xdsoft_month'])[1]/span"));

        boolean flag=true;
        while (flag){
            nextBtn.click();
            if (month.getText().equals("December")){
                flag=false;
            }
        }

       List<WebElement> endDates=driver.findElements(By.xpath("(//table)[1]/tbody/tr/td"));

        for (WebElement endDate: endDates){
            if (endDate.getText().equals("28")){
                endDate.click();
                break;
            }
        }
         Thread.sleep(2000);
       WebElement submitBtn= driver.findElement(By.xpath("//input[@type='submit']"));
       submitBtn.click();

    }
}
