package com.faisal.appviews;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class IncomeView extends BaseView {

    List<String> defaultAccounts;

    //Resource Id
    String titleId = "android:id/text1";
    String transactionDescriptionId = "org.gnucash.android:id/input_transaction_name";
    String transactionAmountId = "org.gnucash.android:id/input_transaction_amount";
    String transactionTypeId = "org.gnucash.android:id/input_transaction_type";
    String menuSaveRecord = "org.gnucash.android:id/menu_save";

    //Resource xPath
    String xPathAddBonus = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.ImageView[1]";
    String xPathBonusBalance = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.TextView";
    String xPathIncomeBalanceAmount = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[4]/android.widget.RelativeLayout/android.widget.TextView";

    public IncomeView(AndroidDriver driver) {
        super(driver);
        defaultAccounts = new ArrayList<String>();
        defaultAccounts.add("Bonus");
        defaultAccounts.add("Gifts Received");
        defaultAccounts.add("Interest Income");
        defaultAccounts.add("Other Income");
        defaultAccounts.add("Salary");
    }

    public boolean isTitleDisplayed(String accountTitle){
        return waitAndFindElement(By.id(titleId)).getText().equals(accountTitle);
    }

    public void addBonusIncome(String amount, String description){

        waitAndFindElement(By.xpath(xPathAddBonus)).click();
        waitAndFindElement(By.id(transactionDescriptionId)).sendKeys(description);
        waitAndFindElement(By.id(transactionAmountId)).sendKeys(amount);
        waitAndFindElement(By.id(transactionTypeId)).click();

    }

    public void saveRecord(){
        waitAndFindElement(By.id(menuSaveRecord)).click();
        hideKeyboard();
    }

    public void navigateBack(){
        driver.navigate().back();
    }

    public String bonusAmount(){
        return waitAndFindElement(By.xpath(xPathBonusBalance)).getText();
    }

    public String incomeAmount(){
        return waitAndFindElement(By.xpath(xPathIncomeBalanceAmount)).getText();
    }

}
