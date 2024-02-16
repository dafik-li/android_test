package com.solvd.testandroid.gui.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class AllowLocationPageBase extends AbstractPage {

    public AllowLocationPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract CityLocationPageBase clickWhileUsingButton();
    public abstract CityLocationPageBase clickOnlyThisButton();
    public abstract CityLocationPageBase clickDontAllowButton();
}
