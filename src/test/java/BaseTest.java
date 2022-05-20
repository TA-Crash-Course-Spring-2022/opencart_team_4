import driver.DriverRepository;
import listener.RetryAnalyser;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import  org.testng.annotations.AfterMethod;
import  org.testng.annotations.BeforeMethod;
import  org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    public void downloadDriver(ITestContext iTestContext){
        for(ITestNGMethod method : iTestContext.getAllTestMethods()){
            method.setRetryAnalyzerClass(RetryAnalyser.class);
        }
        DriverRepository.downloadWebDriver();
    }

    @BeforeMethod
    public void instanceWebBrowser(){
        DriverRepository.instanceWebBrowser();
    }

    @AfterMethod
    public void close(){
        DriverRepository.closeWebBrowser();
    }
}
