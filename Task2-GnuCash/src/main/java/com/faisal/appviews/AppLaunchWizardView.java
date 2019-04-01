package com.faisal.appviews;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AppLaunchWizardView extends BaseView {

    public AppLaunchWizardView(AndroidDriver driver) {
        super(driver);
    }

    //Resource IDs of the App Launch Wizard
    String welcomeSplashNextBtn = "org.gnucash.android:id/btn_save";
    String currencySplashNextBtn = "org.gnucash.android:id/btn_save";
    String accountSetupSplashNextBtn = "org.gnucash.android:id/btn_save";
    String autoCrashReportOpt = "android:id/text1";
    String crashReportNextBtn = "org.gnucash.android:id/btn_save";
    String splashWizardReviewDoneBtn = "org.gnucash.android:id/btn_save";

    //Resource IDs of What's new dialog
    String whatsNewDialogTitleId = "android:id/alertTitle";
    String whatsNewDismissBtn = "android:id/button1";

    public void finishAppLaunchWizard()
    {
        waitAndClick(By.id(welcomeSplashNextBtn));
        waitAndClick(By.id(currencySplashNextBtn));
        waitAndClick(By.id(accountSetupSplashNextBtn));
        waitAndClick(By.id(autoCrashReportOpt));
        waitAndClick(By.id(crashReportNextBtn));
        waitAndClick(By.id(splashWizardReviewDoneBtn));

    }

    public boolean isWhatsNewDialogDisplayed(){
        return isElementPresent(By.id(whatsNewDialogTitleId));
    }

    public boolean isDismissButtonDisplayed(){
        return isElementPresent(By.id(whatsNewDismissBtn));
    }

    public void clickDismiss(){
        waitAndClick(By.id(whatsNewDismissBtn));
    }
}
