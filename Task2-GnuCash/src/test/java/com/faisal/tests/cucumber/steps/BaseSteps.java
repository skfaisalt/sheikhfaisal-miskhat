package com.faisal.tests.cucumber.steps;

import com.faisal.appviews.*;
import com.faisal.tests.ThreadLocalDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseSteps {


    protected AppLaunchWizardView appLaunchWizardViewView = null;
    protected AccountsView accountsView = null;
    protected IncomeView incomeView = null;
    protected ExpensesView expensesView = null;
    protected ReportsView reportsView = null;


    protected WebDriverWait wait;

    protected AndroidDriver<MobileElement> driver;
    protected WebDriverWait waitDriver;


    protected void setupCucumber(){

        System.out.println("Cucumber Base Test Call: SETTING UP");

        waitDriver = new WebDriverWait(ThreadLocalDriver.getTLDriver(), 10);
        appLaunchWizardViewView = new AppLaunchWizardView(ThreadLocalDriver.getTLDriver());
        accountsView = new AccountsView(ThreadLocalDriver.getTLDriver());
        incomeView = new IncomeView(ThreadLocalDriver.getTLDriver());
        expensesView = new ExpensesView(ThreadLocalDriver.getTLDriver());
        reportsView = new ReportsView(ThreadLocalDriver.getTLDriver());

    }

    protected void tearDown(){

        System.out.println("Cucumber Base Test Call: TEAR DOWN");

        driver.quit();
    }

}
