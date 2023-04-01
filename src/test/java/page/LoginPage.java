package page;

import untils.WebKeyword;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;
    WebKeyword keyword;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public By INPUT_USER = By.xpath("//input[@id='email']");
    public By INPUT_PASSWORD = By.id("password");
    public By BUTTON_LOGIN = By.xpath("//button[normalize-space()='Login']");
    public By MESSAGE_ERRO = By.xpath("//div[@class='text-center alert alert-danger']");
    public By TEST = By.xpath("//div[contains(@class,'user-action')]//a[contains(@class,'login-button btn td-btn login-trigger')][normalize-space()='Login']");
    public By TEST01 = By.xpath("//a[normalize-space()='View Details']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
        keyword = new WebKeyword(driver);
    }


    public void loginWithDateValid(String user, String pass)  {
        keyword.openULR("https://crm.anhtester.com/admin/authentication");

        keyword.setText(INPUT_USER, user);
        keyword.setText(INPUT_PASSWORD, pass);
        keyword.clickElement(BUTTON_LOGIN);

    }

    public void openSite()  {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//a[normalize-space()='View Details']"));

        js.executeScript("arguments[0].scroll", element);
        element.click();
    }

    public String messageErro(){
        String msg = keyword.getWebElement(MESSAGE_ERRO).getText();
        return msg;
    }
}
