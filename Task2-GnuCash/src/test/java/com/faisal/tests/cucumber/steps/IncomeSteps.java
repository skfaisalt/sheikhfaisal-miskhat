package com.faisal.tests.cucumber.steps;

import com.faisal.appviews.IncomeView;
import com.faisal.tests.ThreadLocalDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class IncomeSteps extends BaseSteps {

    IncomeView incomeView;
    String initialBonusBalance = "€0,00";

    @Before
    public void initialize(){

        //Initialize the environment before starting the tests
        incomeView = new IncomeView(ThreadLocalDriver.getTLDriver());

    }

    @When("^I add a Bonus amount income of ([^\"]*) euros for ([^\"]*)$")
    public void addBonusIncome(String incomeAmount, String incomeDescription){
        incomeView.addBonusIncome(incomeAmount,incomeDescription);
    }

    @When("^I save the record$")
    public void saveTransaction(){
        incomeView.saveRecord();

    }

    @Then("^I should see the updated Income balance in the view$")
    public void verifyIncomeBalanceAmountUpdate(){
        String finalIncomeBalance = accountsView.incomeBalanceAmount();
        Assert.assertTrue(!finalIncomeBalance.equals(initialBonusBalance));
    }

    @Then("^I should see the Bonus amount updated under the Income view$")
    public void verifyBonusAmountUpdate(){
        String finalBonusBalance = incomeView.bonusAmount();
        Assert.assertTrue(!finalBonusBalance.equals(initialBonusBalance));
    }

    @When("^I navigate back")
    public void incomeViewNavigateBack(){
        incomeView.navigateBack();
    }
}
