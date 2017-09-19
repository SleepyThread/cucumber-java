package me.sleepythread.stepdef.login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import me.sleepythread.pageobject.login.LoginPage;
import me.sleepythread.setdef.Web;

import static org.junit.Assert.assertEquals;

/**
 * Created by akashmishra on 19/09/2017.
 */
public class Login extends Web{

    private LoginPage loginPage = new LoginPage(driver);

    @Given("^I am on splitwise home page$")
    public void iAmOnSplitwiseHomePage() throws Throwable {
        loginPage.open();
    }

    @When("^I login to Splitwise$")
    public void iLoginToSplitwise() throws Throwable {
        loginPage.fillLoginInfo("","");
    }

    @Then("^I should see dashboard page$")
    public void iShouldSeeDashboardPage() throws Throwable {
        assertEquals(true,loginPage.isLoginSuccess());
    }
}
