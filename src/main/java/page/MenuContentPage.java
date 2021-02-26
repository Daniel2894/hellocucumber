package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuContentPage {
    protected WebDriver driver;

    private By TShirtButton = By.cssSelector(".menu-content > li:nth-child(3) > a");

    public MenuContentPage(WebDriver webDriver){
        this.driver = webDriver;
    }

    public void clickTShirtOption(){
        driver.findElement(TShirtButton).click();
    }

}
