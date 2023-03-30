package test;

import common.BaseTest;
import keyword.WebKeyword;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;

public class LoginTest extends BaseTest {

    public LoginPage loginPage;
    WebDriver driver;


    @Test
    public void loginCMR(){

        loginPage = new LoginPage(driver);//truyen driver tu basetest sang các class page

        loginPage.loginWithDateValid("admin@example.com","123456");
    }
}
