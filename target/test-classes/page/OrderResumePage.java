package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderResumePage {
    protected WebDriver driver;
    private By orderConfirmationText = By.cssSelector("#center_column > div > p > strong");

    public OrderResumePage(WebDriver webDriver){
        this.driver = webDriver;
    }

    public String getOrderConfirmation(){
        return driver.findElement(orderConfirmationText).getText();
    }
}
