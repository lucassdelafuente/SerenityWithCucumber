package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.AddRemoveElementsPage;
import utils.Hooks;
import utils.TestBase;

public class AddRemoveElementsDefinitions extends TestBase {

    @Given("I'm guest user")
    public void iamGuestUser(){
        addRemoveElements.goToThePage();
    }

    @When("I go to the add elements page")
    public void iGoToTheAddElementsPage() {
        addRemoveElements.clickOnAddElement(1);
    }

    @And("I add an element")
    public void iAddAnElement() {
        addRemoveElements.clickOnAddElement(1);
    }

    @Then("I should see a new Delete button")
    public void iShouldSeeANewDeleteButton() {
        Assert.assertTrue(addRemoveElements.validateAddElement(1));
    }

}
