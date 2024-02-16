package com.solvd.testandroid.gui.mobile.android.pages;

import com.solvd.testandroid.gui.mobile.common.AllowLocationPageBase;
import com.solvd.testandroid.gui.mobile.common.WelcomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WelcomePageBase.class)
public class WelcomePage extends WelcomePageBase {

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"yo.app.free:id/button\"]")
    private ExtendedWebElement nextButton;

    public WelcomePage(WebDriver driver) {
        super(driver);
    }


    public boolean isNextButtonPresent() {
        return nextButton.isPresent();
    }

    @Override
    public AllowLocationPageBase clickNextButton() {
        isNextButtonPresent();
        nextButton.click();
        return initPage(getDriver(), AllowLocationPageBase.class);
    }
}
