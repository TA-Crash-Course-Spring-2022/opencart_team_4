package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessfulRegisterPage extends BasePage{

    @FindBy(xpath = ".//*[@id='content']/h1")
    private WebElement successfulRegistrationMessage;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/a")
    private WebElement continueButton;

    public WebElement getSuccessfulRegistrationMessage(){
        return successfulRegistrationMessage;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }
}
