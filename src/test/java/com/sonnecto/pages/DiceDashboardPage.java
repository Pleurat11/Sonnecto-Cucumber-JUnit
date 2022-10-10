package com.sonnecto.pages;

import com.sonnecto.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiceDashboardPage {
    public DiceDashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "typeaheadInput")
    public WebElement keyword;
    @FindBy(id="google-location-search")
    public WebElement zipCode;
}
