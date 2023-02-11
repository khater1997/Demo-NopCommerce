package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
    public Register() {
        PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy(linkText = "Register")
    public WebElement registerLink;

    @FindBy(id = "FirstName")
    public WebElement firstName;

    @FindBy(id = "LastName")
    public WebElement lastName;
    @FindBy(id = "Email")
    public WebElement email;
    @FindBy(id = "ConfirmEmail")
    public WebElement confirmEmail;

    @FindBy(id = "Username")
    public WebElement userName;


    @FindBy(id = "check-availability-button")
    public WebElement check;

    @FindBy(name="CountryId")
    public WebElement country;
    @FindBy(name="TimeZoneId")
    public WebElement time;
    @FindBy(name="Password")
    public WebElement pass;
    @FindBy(name="ConfirmPassword")
    public WebElement confirmPass;

    @FindBy(id="Details_CompanyIndustryId")
    public WebElement accDetail;

    @FindBy(name="register-button")
    public WebElement regButton;
    @FindBy(className = "page-title")
    public WebElement resultMass;

    @FindBy(className = "sub-title")
    public WebElement confirmMass;

}
