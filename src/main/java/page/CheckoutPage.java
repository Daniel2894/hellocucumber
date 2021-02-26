package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {
    protected WebDriver driver;
    private WebDriverWait webDriverWait;
    private By proceedToCheckoutButton = By.cssSelector("[style*=\"display: block;\"] .button-container > a");

    public CheckoutPage(WebDriver webDriver){
        this.driver = webDriver;
        this.webDriverWait = new WebDriverWait(this.driver, 5);
    }

    public void proceedToCheckout(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(proceedToCheckoutButton));
        driver.findElement(proceedToCheckoutButton).click();
    }
}
