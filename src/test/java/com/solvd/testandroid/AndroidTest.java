package com.solvd.testandroid;

import com.solvd.testandroid.gui.mobile.android.pages.WelcomePage;
import com.solvd.testandroid.gui.mobile.common.AllowLocationPageBase;
import com.solvd.testandroid.gui.mobile.common.CityLocationPageBase;
import com.zebrunner.carina.core.AbstractTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AndroidTest extends AbstractTest {

    @Test(description = "verify weather app test")
    public void verifyWeatherAppTest() {
        SoftAssert sa = new SoftAssert();
        WelcomePage welcomePage = new WelcomePage(getDriver());
        welcomePage.clickNextButton();

        AllowLocationPageBase allowLocationPageBase = welcomePage.clickNextButton();
        allowLocationPageBase.clickDontAllowButton();

        CityLocationPageBase cityLocationPageBase = allowLocationPageBase.clickDontAllowButton();
        cityLocationPageBase.clickNoButton();
    }

}
