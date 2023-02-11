package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Register;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class RegStepDef {
    Register register = new Register();

    @Given("user go to register page")
    public void user_go_to_register_page() {
        register.registerLink.click();
    }

    @When("user enter data {string}&{string} first and last name")
    public void userEnterDataFirstAndLastName(String firstName, String lastName) {
        register.firstName.sendKeys(firstName);
        register.lastName.sendKeys(lastName);
    }

    @And("user enter email and confirm email")
    public void userEnterEmailAndConfirmEmail() {
        Faker faker = new Faker();
        String emailAddress = faker.internet().safeEmailAddress();
        register.email.sendKeys(emailAddress);
        register.confirmEmail.sendKeys(emailAddress);
        System.out.println(emailAddress);
    }

    @And("user enter user name{string} userName")

    @And("user enter userName")
    public void userEnterAsUserName() {
        Faker faker = new Faker();
        String userName = faker.internet().domainName();
        register.userName.sendKeys(userName);
        System.out.println(userName);
    }

    @And("user could check validation")
    public void userCouldCheckValidation() {
        register.check.click();
    }

    @And("user select country and time zone")
    public void userSelectCountryAndTimeZone() {
        Select select = new Select(register.country);
        select.selectByVisibleText("Egypt");

        select = new Select(register.time);
        select.selectByValue("Egypt Standard Time");
    }

    @And("user could enter password and confirm pass {string} pass")
    public void userCouldEnterPasswordAndConfirmPassPass(String pass) {
        register.pass.sendKeys(pass);
        register.confirmPass.sendKeys(pass);
    }

    @And("user could enter account detail")
    public void userCouldEnterAccountDetail() {
        Select select = new Select(register.accDetail);
        select.selectByVisibleText("I am student");
    }

    @And("user click on register button")
    public void userClickOnRegisterButton() {
        register.regButton.click();
    }

    @Then("account register successfully")
    public void accountRegisterSuccessfully() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(register.resultMass.getText().contains("Register"));
        softAssert.assertTrue(register.confirmMass.getText().contains("Almost done!"));

        softAssert.assertAll();
    }
}
