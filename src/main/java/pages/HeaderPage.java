package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage {

    @FindBy(xpath = ".//*[@title='My Account']")
    private  WebElement myAccountButton;

    @FindBy(xpath = ".//*[contains(@href,'register')]")
    private  WebElement registerButton;

    @FindBy(xpath = ".//*[contains(@href,'login')]")
    private  WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
    private  WebElement dropDownListMyAccountButton;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
    public WebElement dropDownListOrderHistoryButton;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[3]/a")
    public WebElement dropDownListTransactionButton;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[4]/a")
    public WebElement dropDownListDownloadsButton;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")
    public WebElement dropDownListLogoutButton;


    public WebElement getMyAccountButton(){
        return myAccountButton;
    }

    public WebElement getRegisterButton(){
        return registerButton;
    }

    public WebElement getLoginButton(){
        return loginButton;
    }

    public WebElement getDropDownListMyAccountButton() {
        return dropDownListMyAccountButton;
    }

    public WebElement getDropDownListOrderHistoryButton() {
        return dropDownListOrderHistoryButton;
    }

    public WebElement getDropDownListTransactionButton() {
        return dropDownListTransactionButton;
    }

    public WebElement getDropDownListDownloadsButton() {
        return dropDownListDownloadsButton;
    }

    public WebElement getDropDownListLogoutButton() {
        return dropDownListLogoutButton;
    }
}
