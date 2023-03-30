package keyword;


import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.sql.DriverManager;
import java.text.MessageFormat;
import java.time.Duration;

public class WebKeyword {


    public final  static int TIMEOUT = 4;
    public final  static double STEP_TIMEOUT = 4;
    public final  static int PAGE_LOAD_TIMEOUT = 4;

    public WebKeyword() {
    }


    public static void sleep(double second){
        try {
            Thread.sleep((long) (1000*second));
        } catch (InterruptedException e) {
            throw  new RuntimeException(e);
        }
    }

    public static WebElement getWebElement(By by){
        return driver.DriverManager.getDriver().findElement(by);
    }

    public static void openURL(String url){
         driver.DriverManager.getDriver().get(url);
        sleep(STEP_TIMEOUT);
    }

    public static void clickElement(By by){
        WebDriverWait wait = new WebDriverWait(driver.DriverManager.getDriver(), Duration.ofSeconds(TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        driver.DriverManager.getDriver().findElement(by).click();
    }

    public static void setText(By by, String value){
        try {
            WebDriverWait wait = new WebDriverWait(driver.DriverManager.getDriver(), Duration.ofSeconds(TIMEOUT));
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            driver.DriverManager.getDriver().findElement(by).sendKeys(value);

        }catch (Throwable e){

        }
    }

    public static void verifyText(Object expect, Object actual){
        Assert.assertEquals(expect, actual);
    }
}
