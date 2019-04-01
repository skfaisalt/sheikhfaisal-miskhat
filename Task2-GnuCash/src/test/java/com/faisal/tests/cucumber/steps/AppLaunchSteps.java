package com.faisal.tests.cucumber.steps;

import com.faisal.tests.ThreadLocalDriver;
import com.faisal.appviews.AccountsView;
import com.faisal.appviews.AppLaunchWizardView;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class AppLaunchSteps extends BaseSteps {

    AppLaunchWizardView appLaunchWizardView;

    @Before
    public void initialize(){

        //Initialize the environment before starting the tests
        appLaunchWizardView = new AppLaunchWizardView(ThreadLocalDriver.getTLDriver());
    }

    @When("^I finish the app configuration wizard$")
    public void launchApp() throws Throwable {
        appLaunchWizardView.finishAppLaunchWizard();
    }

    @When("^I dismiss the What's new dialog$")
    public void dismissWhatsNewDialog(){
        appLaunchWizardView.clickDismiss();
    }


    @Then("^I can see that the app is launched$")
    public void verifyWhatsNewDialogDismissal(){
        accountsView = new AccountsView(ThreadLocalDriver.getTLDriver());
        Assert.assertTrue(accountsView.isAppLaunched());
    }

    @Then("^I should see the What's new dialog$")
    public void verifyWhatsNewDialog() throws Throwable{
        Assert.assertTrue(appLaunchWizardView.isDismissButtonDisplayed());

    }

    @When("^I can dismiss the What's new dialog$")
    public void isDismissDialogPresent() throws Throwable {

        Assert.assertTrue(appLaunchWizardView.isDismissButtonDisplayed());

    }
}
