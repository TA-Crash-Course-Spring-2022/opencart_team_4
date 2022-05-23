package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessfulLogoutPage extends BasePage{

    @FindBy(xpath = ".//*[@id='content']/h1")
    private WebElement successfulLogoutMessage;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/a")
    private WebElement continueButton;

    public WebElement getSuccessfulLogoutMessage() {
        return successfulLogoutMessage;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }
}
