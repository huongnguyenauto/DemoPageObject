package untils;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.testng.Assert;

import java.text.MessageFormat;
import java.time.Duration;

public class WebKeyword {


    public final static int TIMEOUT = 10;
    public final static double STEP_TIMEOUT = 10;
    public final static int PAGE_LOAD_TIMEOUT = 4;

    private static WebDriver driver;
    private static WebDriverWait driverWait;

    public WebKeyword(WebDriver driver) {
        WebKeyword.driver = driver;
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
    }

    public void openULR(String ull){
        driver.get(ull);
        sleep(STEP_TIMEOUT);
    }

    public static void sleep(double second) {
        try {
            Thread.sleep((long) (1000 * second));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public WebElement getWebElement(By by) {
        return driver.findElement(by);
    }

    public static void clickElement(By by) {
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
        driver.findElement(by).click();
        Log.info(MessageFormat.format("CLick success {0} ", by));
    }

    public static void setText(By by, String value) {
        try {

            driver.findElement(by).sendKeys(value);
            Log.info(MessageFormat.format("Set text success {0} ", by));
        } catch (Throwable e) {

        }
    }

    public static void verifyText(Object expect, Object actual) {
        Assert.assertEquals(expect, actual);
    }
}
