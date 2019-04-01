package com.faisal.appviews;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class ExpensesView extends BaseView{

    //Resource Id
    String expenseDescriptionId = "org.gnucash.android:id/input_transaction_name";
    String expenseAmountId = "org.gnucash.android:id/input_transaction_amount";

    //Resource xPath
    String xPathExpenseAddAuto = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ImageView[1]";
    String xPathAuto  = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.RelativeLayout";
    String xPathExpensesBalanceAuto = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.TextView";

    public ExpensesView(AndroidDriver driver) {
        super(driver);
    }

    public void navigateToAuto(){
        waitAndFindElement(By.xpath(xPathAuto)).click();
    }

    public void addExpenseAuto(String amount, String description){

        waitAndClick(By.xpath(xPathExpenseAddAuto));
        sendText(By.id(expenseAmountId),amount);
//        waitAndFindElement(By.id(expenseAmountId)).sendKeys(amount);
        sendText(By.id(expenseDescriptionId),description);
//        waitAndFindElement(By.id(expenseDescriptionId)).sendKeys(description);
        hideKeyboard();


    }

    public String getExpenseAmountAuto(){
        return waitAndFindElement(By.xpath(xPathExpensesBalanceAuto)).getText();
    }

}
