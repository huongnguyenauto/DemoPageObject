package test;

import common.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import keyword.WebKeyword;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;

public class LoginTest extends BaseTest {

    public LoginPage loginPage;


    @Test
    public void loginCMR(){
        loginPage = new LoginPage();//truyen driver tu basetest sang các class page

        loginPage.loginWithDateValid("admin@example.com","123456");
    }
}
