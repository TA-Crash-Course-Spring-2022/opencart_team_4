package pages;

import  org.openqa.selenium.By;
import  org.openqa.selenium.WebElement;
import  org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "input-email")
    private WebElement inputEmail;

    @FindBy(id = "input-password")
    private WebElement inputPassword;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/div[2]/a")
    private WebElement forgottenPasswordLink;

    @FindBy(xpath = "//*[@id=\"account-login\"]/div[1]")
    private WebElement unsuccessfulLoginMessage;


    public WebElement getEmailInput() {
        return inputEmail;
    }

    public WebElement getPasswordInput() {
        return inputPassword;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getUnsuccessfulLoginMessage() {
        return unsuccessfulLoginMessage;
    }

    public WebElement getForgottenPasswordLink() {
        return forgottenPasswordLink;
    }
}
