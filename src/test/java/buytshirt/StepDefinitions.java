package buytshirt;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import page.*;

public class StepDefinitions {
    WebDriver driver = new ChromeDriver();

    MenuContentPage menuContentPage = new MenuContentPage(driver);
    CataloguePage cataloguePage = new CataloguePage(driver);
    ProductDetailPage productDetailPage = new ProductDetailPage(driver);
    CheckoutPage checkoutPage = new CheckoutPage(driver);
    SummaryPage summaryPage = new SummaryPage(driver);
    SignInPage signInPage = new SignInPage(driver);
    AddressPage addressPage = new AddressPage(driver);
    ShippingPage shippingPage = new ShippingPage(driver);
    PaymentPage paymentPage = new PaymentPage(driver);
    BankPaymentPage bankPaymentPage = new BankPaymentPage(driver);
    OrderResumePage orderResumePage = new OrderResumePage(driver);

    @Before
    public void setUp() {
        driver.get("http://automationpractice.com/index.php");
    }

    @Given("that the user is on T-Shirt catalogue")
    public void goToTShirtCatalogue(){
        menuContentPage.clickTShirtOption();
    }

    @When("the user adds a T-Shirt to the cart")
    public void addTShirtToCart(){
        cataloguePage.selectProduct("Faded Short Sleeve T-shirts");
        productDetailPage.addToCart();
    }

    @And("the user pays for the T-Shirt")
    public void payForTShirt(){
        checkoutPage.proceedToCheckout();
        summaryPage.proceedToCheckout();
        signInPage.signIn("aperdomobo@gmail.com", "WorkshopProtractor");
        addressPage.proceedToCheckout();
        shippingPage.agreeTermsOfService();
        shippingPage.proceedToCheckout();
        paymentPage.payByBankWire();
        bankPaymentPage.confirmOrder();
    }

    @Then("the user should see the message {string}")
    public void checkMessage(String orderConfirmationMessage){
        /* Assertion with just TestNG (Without Hamcrest):
        Assert.assertEquals(orderResumePage.getOrderConfirmation(),message);*/
        // Assertion with Hamcrest:
        assertThat(orderResumePage.getOrderConfirmation(), equalTo(orderConfirmationMessage));
    }

    @After
    public void tearDown() {
        driver.close();
    }

}
