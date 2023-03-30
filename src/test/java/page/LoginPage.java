package page;

import driver.DriverManager;
import keyword.WebKeyword;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public By INPUT_USER = By.xpath("//input[@id='email']");
    public By INPUT_PASSWORD = By.xpath("//input[@id='password']//");
    public By BUTTON_LOGIN = By.xpath("//button[normalize-space()='Login']");
    public By MESSAGE_ERRO = By.xpath("//div[@class='text-center alert alert-danger']");
    public By TEST = By.xpath("//div[contains(@class,'user-action')]//a[contains(@class,'login-button btn td-btn login-trigger')][normalize-space()='Login']");
    public By TEST01 = By.xpath("//a[normalize-space()='View Details']");

    public LoginPage(){

    }


    public void loginWithDateValid(String user, String pass){
        driver.get("https://crm.anhtester.com/admin/authentication");

        driver.findElement(INPUT_USER).sendKeys(user);
        driver.findElement(INPUT_PASSWORD).sendKeys(pass);
        driver.findElement(BUTTON_LOGIN).click();

    }

    public void openSite() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//a[normalize-space()='View Details']"));

        js.executeScript("arguments[0].scroll", element);
        Thread.sleep(2000);
        element.click();
    }

//    public String messageErro(){
//        String msg = WebKeyword.getWebElement(MESSAGE_ERRO).getText();
//        return msg;
//    }
}
