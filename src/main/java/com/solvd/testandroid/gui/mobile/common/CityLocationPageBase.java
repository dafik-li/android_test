package com.solvd.testandroid.gui.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CityLocationPageBase extends AbstractPage {

    public CityLocationPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract MainPageBase clickNoButton();
    public abstract MainPageBase clickYesButton();
}
