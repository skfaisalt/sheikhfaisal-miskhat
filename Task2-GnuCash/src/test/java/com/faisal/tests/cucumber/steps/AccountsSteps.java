package com.faisal.tests.cucumber.steps;

import com.faisal.tests.ThreadLocalDriver;
import com.faisal.appviews.AccountsView;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class AccountsSteps extends BaseSteps {

    AccountsView accountsView;

    @Before
    public void initialize(){

       //Initialize the environment before starting the tests
        accountsView = new AccountsView(ThreadLocalDriver.getTLDriver());

    }

    @Given("^I have launched the GnuCash app$")
    public void appLaunch(){
        verifyGnuCashAppHome();
    }

    @When("^I am in the Accounts view$")
    public void verifyView(){
        verifyAccountsView();
    }

    @When("^I launch the GnuCash app$")
    public void verifyGnuCashAppHome(){
        Assert.assertTrue(accountsView.isAppLaunched());
    }

    @When("^I add an account titled ([^\"]*) with description ([^\"]*)$")
    public void addAccountTitle(String accountTitle, String accountDescription){
        accountsView.addAccount(accountTitle, accountDescription);
    }

    @When("^I tap on the ([^\"]*) account$")
    public void tapOnAccount(String accountName){
        accountsView.navigateTo(accountName);
    }

    @When ("^I search for the ([^\"]*) account via Search$")
    public void searchAccount(String account_name){
        accountsView.searchAccount(account_name);
    }

    @Then("^the account titled ([^\"]*) should be added under Accounts$")
    public void verifyNewAccount(String accountTitle){
        accountsView.isAccountAdded(accountTitle);
    }

    @Then ("^I should see the account titled ([^\"]*) listed under the search result$")
    public void verifySearchResult(String searchFilter){
        Assert.assertTrue(accountsView.isSearchAccurate(searchFilter));
    }

    @Then("^the Accounts view is shown$")
    public void verifyAccountsView(){
        Assert.assertTrue(accountsView.isDisplayedAccountsTitle());
    }

    @Then("^the Accounts view should list all the default accounts$")
    public void verifyAccountViewContents(){
        Assert.assertTrue(accountsView.verifyDefaultAccounts());
    }

    @Then("^I should reach the ([^\"]*) account view$")
    public void verifyAccountNavigation(String accountTitle){
        Assert.assertTrue(accountsView.isTitleDisplayed(accountTitle));
    }


}
