package com.solvd.testandroid.gui.mobile.android.pages;

import com.solvd.testandroid.gui.mobile.common.CityLocationPageBase;
import com.solvd.testandroid.gui.mobile.common.MainPageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CityLocationPage extends CityLocationPageBase {

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"yo.app.free:id/left_button\"]")
    private ExtendedWebElement noButton;

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"yo.app.free:id/right_button\"]")
    private ExtendedWebElement yesButton;


    public CityLocationPage(WebDriver driver) {
        super(driver);
    }


    public boolean isNoButtonPresent() {
        return noButton.isPresent();
    }
    public boolean isYesButtonPresent() {
        return yesButton.isPresent();
    }


    @Override
    public MainPageBase clickNoButton() {
        isNoButtonPresent();
        noButton.click();
        return initPage(getDriver(), MainPageBase.class);
    }
    @Override
    public MainPageBase clickYesButton() {
        isYesButtonPresent();
        yesButton.click();
        return initPage(getDriver(), MainPageBase.class);
    }
}
