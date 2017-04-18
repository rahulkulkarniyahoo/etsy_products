package products;

import Pages.LoginPage;
import Pages.MainPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by rahul.kulkarni on 04/04/2017.
 */
public class StepDefinitions {
    LoginPage loginPage;
    MainPage mainPage;

    @Before
    public void startUp(){
        System.out.println("I started");
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
        System.out.println(" ********** Setting Property - Done *********");
    }

    @After
    public void tearDown(){
        System.out.println("I end");
    }

    @Given("^I am able to login to etsy$")
    public void i_am_able_to_login_to_etsy() throws Throwable {
        System.out.println("i_am_able_to_login_to_etsy");
        loginPage.open();
        loginPage.login();
    }

    @When("^I add required values$")
    public void i_add_required_values() throws Throwable {
        System.out.println("i_add_required_values");
        //mainPage.clickAddNewProduct();
        mainPage.setData();

    }

    @Then("^I should be able to add products$")
    public void i_should_be_able_to_add_products() throws Throwable {
        System.out.println("i_should_be_able_to_add_products");
    }


}
