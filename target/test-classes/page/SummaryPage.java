package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SummaryPage {
    protected WebDriver driver;
    private By proceedToCheckoutButton = By.cssSelector("p > a[title=\"Proceed to checkout\"]");

    public SummaryPage(WebDriver webDriver){
        this.driver = webDriver;
    }

    public void proceedToCheckout(){
        driver.findElement(proceedToCheckoutButton).click();
    }
}
