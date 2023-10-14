package POM.pages;

import Utiles.CommonMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends CommonMethod {


    @FindBy(linkText = "HRM")
    public WebElement HrmText;


    public DashboardPage(){
        PageFactory.initElements(driver, this);
    }
}
