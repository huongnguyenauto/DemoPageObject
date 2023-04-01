package listeners;

import helper.CaptureHelpers;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onFinish(ITestContext result) {
       			

    }

    @Override
    public void onStart(ITestContext result) {
       		

    }

    @Override//ITestResult bat trang thai test
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        			

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getName() + " is pass");

    }

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println(result.getName() + " is fail");
        CaptureHelpers.takeScreenshot(result);//chup man hinh khi fail
    }

    @Override
    public void onTestSkipped(ITestResult result) {
       			

    }

    @Override
    public void onTestStart(ITestResult result) {


    }


}
