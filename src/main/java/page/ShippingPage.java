package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPage {
    protected WebDriver driver;
    private By termsOfServiceCheckbox = By.id("cgv");
    private By proceedToCheckoutButton = By.cssSelector("button[name=\"processCarrier\"]");

    public ShippingPage(WebDriver webDriver){
        this.driver = webDriver;
    }

    public void agreeTermsOfService(){
        driver.findElement(termsOfServiceCheckbox).click();
    }

    public void proceedToCheckout(){
        driver.findElement(proceedToCheckoutButton).click();
    }
}
