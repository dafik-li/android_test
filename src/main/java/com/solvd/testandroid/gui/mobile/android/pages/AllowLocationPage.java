package com.solvd.testandroid.gui.mobile.android.pages;

import com.solvd.testandroid.gui.mobile.common.AllowLocationPageBase;
import com.solvd.testandroid.gui.mobile.common.CityLocationPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = AllowLocationPageBase.class)
public class AllowLocationPage extends AllowLocationPageBase {

    @FindBy(xpath = "//android.widget.RadioButton[@resource-id=\"com.android.permissioncontroller:id/permission_location_accuracy_radio_fine\"]")
    private ExtendedWebElement preciseRadioButton;

    @FindBy(xpath = "//android.widget.RadioButton[@resource-id=\"com.android.permissioncontroller:id/permission_location_accuracy_radio_coarse\"]")
    private ExtendedWebElement approximateRadioButton;

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]")
    private ExtendedWebElement whileUsingButton;

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_one_time_button\"]")
    private ExtendedWebElement onlyThisButton;

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]")
    private ExtendedWebElement dontAllowButton;


    public AllowLocationPage(WebDriver driver) {
        super(driver);
    }


    public boolean isPreciseRadioButtonPresent() {
        return preciseRadioButton.isPresent();
    }
    public boolean isPreciseRadioButtonSelected() {
        return preciseRadioButton.isSelected();
    }


    public boolean isApproximateRadioButton() {
        return approximateRadioButton.isPresent();
    }
    public boolean isApproximateRadioButtonSelected() {
        return approximateRadioButton.isSelected();
    }


    public boolean isWhileUsingButtonPresent() {
        return whileUsingButton.isPresent();
    }
    public boolean isOnlyThisButtonPresent() {
        return onlyThisButton.isPresent();
    }
    public boolean isDontAllowButtonPresent() {
        return dontAllowButton.isPresent();
    }


    @Override
    public CityLocationPageBase clickWhileUsingButton() {
        isPreciseRadioButtonPresent();
        isPreciseRadioButtonSelected();
        isWhileUsingButtonPresent();
        whileUsingButton.click();
        return initPage(getDriver(), CityLocationPageBase.class);
    }

    @Override
    public CityLocationPageBase clickOnlyThisButton() {
        isPreciseRadioButtonPresent();
        isPreciseRadioButtonSelected();
        isOnlyThisButtonPresent();
        onlyThisButton.click();
        return initPage(getDriver(), CityLocationPageBase.class);
    }

    @Override
    public CityLocationPageBase clickDontAllowButton() {
        isPreciseRadioButtonPresent();
        isPreciseRadioButtonSelected();
        isDontAllowButtonPresent();
        dontAllowButton.click();
        return initPage(getDriver(), CityLocationPageBase.class);
    }
}
