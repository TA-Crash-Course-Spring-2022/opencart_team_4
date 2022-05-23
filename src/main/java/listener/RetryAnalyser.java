package listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import java.util.concurrent.atomic.AtomicInteger;

public class RetryAnalyser implements IRetryAnalyzer {

    private static final int retryLimit= 2;
    private AtomicInteger counter = new AtomicInteger(retryLimit);

    @Override
    public boolean retry(ITestResult iTestResult){
        boolean retry = false;
        if(isRetryAvaliable()){
            retry = true;
            counter.decrementAndGet();
            return retry;
        }
        return retry;
    }

    private boolean isRetryAvaliable(){return counter.intValue()>0;}
}
