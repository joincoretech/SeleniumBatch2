package POM.tests;

import POM.pages.DashboardPage;
import POM.pages.LoginPage;
import Utiles.CommonMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTest extends CommonMethod {
    public static void main(String[] args) {
        String url="https://dreamhiringacademy.com/index.php";
        openDriver(url);
        LoginPage loginPage=new LoginPage();
        loginPage.userName.sendKeys("admin@gmail.com");
        loginPage.password.sendKeys("admin#123");
        loginPage.loginBtn.click();

        DashboardPage dashboardPage=new DashboardPage();
        boolean hrmText=dashboardPage.HrmText.isDisplayed();
        System.out.println(hrmText);

        teardown();

    }

}
