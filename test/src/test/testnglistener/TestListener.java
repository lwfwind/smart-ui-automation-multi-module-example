package test.testnglistener;

import com.qa.framework.testnglistener.ICustomTestListener;
import org.apache.log4j.Logger;
import org.testng.ITestResult;

public class TestListener implements ICustomTestListener {
    private static Logger logger = Logger.getLogger(TestListener.class);
    public void onTestFailure(ITestResult tr) {
        logger.info("onCustomTestFailure");
    }

    public void onTestSkipped(ITestResult tr){
        logger.info("onCustomTestSkipped");
    }

    public void onTestSuccess(ITestResult tr){
        logger.info("onCustomTestSuccess");
    }

}
