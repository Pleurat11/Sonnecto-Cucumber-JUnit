package com.sonnecto.pages;

import com.sonnecto.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyDashboardPage {
    public EtsyDashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchBox;
    @FindBy(xpath = "//p[@class='wt-text-heading-01 wt-display-inline wt-mb-xs-2 wt-overflow-hidden']")
    public WebElement result;

    public void searchFor(String search){
        searchBox.clear();
        searchBox.click();
        searchBox.sendKeys(search);
    }
}
