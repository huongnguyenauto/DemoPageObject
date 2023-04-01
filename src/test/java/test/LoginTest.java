package test;

import common.BaseTest;
import listeners.TestListener;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import page.LoginPage;

import java.io.File;
import java.io.IOException;

@Listeners(TestListener.class)
public class LoginTest extends BaseTest {

    public LoginPage loginPage;

    @BeforeMethod
    public void initPro() {
        loginPage = new LoginPage(driver);//truyen driver tu basetest sang các class page
    }

    @Test
    public void loginCMR() {
        loginPage.loginWithDateValid("admin@example.com", "123456");
    }

    @Test
    public void loginCMRInvalidPass() {
        loginPage.loginWithDateValid("admin@example.com", "123456789");
        Assert.assertEquals(loginPage.messageErro(), "Invalid email or password123");
    }
}
