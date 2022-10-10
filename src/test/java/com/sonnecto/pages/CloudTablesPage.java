package com.sonnecto.pages;

import com.sonnecto.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CloudTablesPage extends BasePage{

    public CloudTablesPage(){};


    @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    private WebElement newButton;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstName;

    @FindBy(id = "DTE_Field_last_name")
    public WebElement lastName;

    @FindBy(id = "DTE_Field_position")
    public WebElement position;

    @FindBy(id = "DTE_Field_salary")
    public WebElement salary;

    @FindBy(xpath = "//button[@class='btn']")
    private WebElement createButton;

    public void clickNewButton(){
        newButton.click();
    }
    public void clickCreateButton(){
        createButton.click();
    }
}
