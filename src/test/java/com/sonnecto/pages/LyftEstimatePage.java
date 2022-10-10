package com.sonnecto.pages;

import com.sonnecto.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LyftEstimatePage {
    public LyftEstimatePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "fare-start")
    public WebElement pickUpLocation;
    @FindBy(name = "fare-end")
    public WebElement dropOffLocation;
    @FindBy(xpath = "//button[.='Get estimate']")
    public WebElement getEstimateButton;

    public void enterPickUpLocation(String location){
        pickUpLocation.sendKeys(location);
    }
    public void enterDropOffLocation(String location){
        dropOffLocation.sendKeys(location);
    }
}
