package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

    @FindBy(xpath = ".//*[@id=\"column-right\"]/div/a[contains(text(),'My Account')]")
    private WebElement myAccountPageButton;

    @FindBy(xpath = ".//*[@id=\"column-right\"]/div/a[contains(text(),'Edit Account')]")
    private WebElement editAccountButton;

    @FindBy(xpath = ".//*[@id=\"column-right\"]/div/a[contains(text(),'Password')]")
    private WebElement changePasswordButton;

    @FindBy(xpath = ".//*[@id=\"column-right\"]/div/a[contains(text(),'Wish List')]")
    private WebElement wishListButton;

    @FindBy(xpath = ".//*[@id=\"column-right\"]/div/a[contains(text(),'Order History')]")
    private WebElement orderHistoryButton;

    @FindBy(xpath = ".//*[@id=\"column-right\"]/div/a[contains(text(),'Logout')]")
    private WebElement logoutButton;

    @FindBy(xpath = "//*[@id=\"content\"]/h2[1]")
    private WebElement myAccountText;

    @FindBy(xpath = "//*[@id=\"account-account\"]/div[1]/text()")
    private WebElement successfulChangePasswordMessage;

    public WebElement getMyAccountPageButton() {
        return myAccountPageButton;
    }

    public WebElement getEditAccountButton() {
        return editAccountButton;
    }

    public WebElement getChangePasswordButton() {
        return changePasswordButton;
    }

    public WebElement getWishListButton() {
        return wishListButton;
    }

    public WebElement getOrderHistoryButton() {
        return orderHistoryButton;
    }

    public WebElement getLogoutButton() {
        return logoutButton;
    }

    public WebElement getSuccessfulLoginMessage() {
        return myAccountText;
    }

    public WebElement getSuccessfulChangePasswordMessage() {
        return successfulChangePasswordMessage;
    }
}
