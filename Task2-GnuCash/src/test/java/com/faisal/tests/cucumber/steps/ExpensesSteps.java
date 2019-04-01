package com.faisal.tests.cucumber.steps;

import com.faisal.appviews.ExpensesView;
import com.faisal.appviews.IncomeView;
import com.faisal.tests.ThreadLocalDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ExpensesSteps extends BaseSteps {

    ExpensesView expensesView;
    String initialExpenseOnAuto="€0,00";


    @Before
    public void initialize(){

        //Initialize the environment before starting the tests
        expensesView = new ExpensesView(ThreadLocalDriver.getTLDriver());

    }

    @When("^I navigate to Expense for Auto$")
    public void navigateToAuto(){
        expensesView.navigateToAuto();
    }

    @When("^I add an Expense amount of ([^\"]*) euros on ([^\"]*)$")
    public void addExpense(String amount, String description){
        expensesView.addExpenseAuto(amount, description);
    }

    @Then("^I should see the Expense acccount updated on Auto$")
    public void verifyExpenseBalanceOnAuto(){
        String finalExpenseOnAuto = expensesView.getExpenseAmountAuto();
        Assert.assertTrue(finalExpenseOnAuto.equals(initialExpenseOnAuto));
    }
}
