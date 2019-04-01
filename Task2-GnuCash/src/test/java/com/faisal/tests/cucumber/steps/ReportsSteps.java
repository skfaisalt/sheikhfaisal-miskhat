package com.faisal.tests.cucumber.steps;

import com.faisal.appviews.ReportsView;
import com.faisal.tests.ThreadLocalDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ReportsSteps extends BaseSteps {

    ReportsView reportsView;
    String expenseBalance = "";

    @Before
    public void initialize(){

        //Initialize the environment before starting the tests
        reportsView = new ReportsView(ThreadLocalDriver.getTLDriver());
    }

    @When("^I launch the Reports view$")
    public void launchReports(){
        if(expenseBalance=="")
            expenseBalance = reportsView.getExpensebalance();
        System.out.println("Expense Balance: " +expenseBalance);
        reportsView.openReports();
    }

    @Then("^I should see the report fields$")
    public void verifyReportFields(){
        reportsView.verifyReportFields();
    }

    @Then("^the expense report values should be accurate$")
    public void verifyReportValues(){

        String totalAssetsReport = reportsView.getTotalAssets();
        String netWorth = reportsView.getNetWorth();

        Assert.assertTrue(expenseBalance.equals(totalAssetsReport) && expenseBalance.equals(netWorth));
    }

}
