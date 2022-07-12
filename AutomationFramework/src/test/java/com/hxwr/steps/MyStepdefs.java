package com.hxwr.steps;

import com.hxwr.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    LoginPage loginPage= new LoginPage();
    @Given("^navigate to url (.+)$")
    public void navigateToUrl(String urltype) {
        loginPage.navigateToURL(urltype);
    }

    @Given("open {string}")
    public void open(String arg0) {
    }

    @When("click on sign in link")
    public void clickOnSignInLink() {
    }

    @And("Enter your {string} in create an account section")
    public void enterYourInCreateAnAccountSection(String arg0) {
    }

    @And("click on create an account button")
    public void clickOnCreateAnAccountButton() {


    }

    @And("enter your personal information {string} and {string}")
    public void enterYourPersonalInformationAnd(String arg0, String arg1) {
    }

    @And("Click on register button")
    public void clickOnRegisterButton() {

    }

    @Then("Validate that user is created")
    public void validateThatUserIsCreated() {
    }

    @And("Enter your {string} in the email box and click enter")
    public void enterYourInTheEmailBoxAndClickEnter(String arg0) {

    }

    @Then("Validate that an error message is displaying saying {string}")
    public void validateThatAnErrorMessageIsDisplayingSaying(String arg0) {

    }

    @And("Enter your {string} and click register button")
    public void enterYourAndClickRegisterButton(String arg0) {

    }

    @And("Leave the mandatory fields mark with blank and click register button")
    public void leaveTheMandatoryFieldsMarkWithBlankAndClickRegisterButton() {

    }

    @Then("Verify that error has been displayed for the mandatory fields")
    public void verifyThatErrorHasBeenDisplayedForTheMandatoryFields() {

    }

    @And("Enter incorrect values in fields and click register button")
    public void enterIncorrectValuesInFieldsAndClickRegisterButton() {

    }

    @Then("Verify that error messages for respective fields are displaying")
    public void verifyThatErrorMessagesForRespectiveFieldsAreDisplaying() {
    }

    @When("Move the cursor over Woman's Link")
    public void moveTheCursorOverWomanSLink() {

    }

    @And("Click on sub menu T-shirts")
    public void clickOnSubMenuTShirts() {

    }

    @And("get name text for the first product showed on the page")
    public void getNameTextForTheFirstProductShowedOnThePage() {

    }

    @And("Enter the same product name in the search bar present on top of the page and click search button")
    public void enterTheSameProductNameInTheSearchBarPresentOnTopOfThePageAndClickSearchButton() {

    }

    @Then("Validate the same product is displayed in search page with same details which were displayed on T-shirt page")
    public void validateTheSameProductIsDisplayedInSearchPageWithSameDetailsWhichWereDisplayedOnTShirtPage() {

    }

    @When("Login to the web site")
    public void loginToTheWebSite() {

    }

    @And("Mouse hover on the second product displayed")
    public void mouseHoverOnTheSecondProductDisplayed() {

    }

    @Then("More button will be displayed , click on more button")
    public void moreButtonWillBeDisplayedClickOnMoreButton() {

    }

    @And("increase quantity to {int}")
    public void increaseQuantityTo(int arg0) {

    }

    @And("select size L")
    public void selectSizeL() {

    }

    @Then("Select Color")
    public void selectColor() {

    }

    @Then("Click Add to Car button")
    public void clickAddToCarButton() {

    }

    @Then("Complete the buy order process till payment")
    public void completeTheBuyOrderProcessTillPayment() {

    }

    @Then("Make Sure that Product Is Ordered")
    public void makeSureThatProductIsOrdered() {

    }

    @Then("Add To Wish List will appear on the Bottom of that product and click on it")
    public void addToWishListWillAppearOnTheBottomOfThatProductAndClickOnIt() {

    }

    @Then("Verify That error Message Is Displayed {string}")
    public void verifyThatErrorMessageIsDisplayed(String arg0) {
    }

    @Then("Make sure quantity is set to {int}")
    public void makeSureQuantityIsSetTo(int arg0) {

    }

    @And("Select Size M")
    public void selectSizeM() {

    }

    @Then("Click Proceed To Check out Button")
    public void clickProceedToCheckOutButton() {

    }

    @Then("Change The Quantity to {int}")
    public void changeTheQuantityTo(int arg0) {

    }

    @Then("Verify That is changing and reflecting correct price")
    public void verifyThatIsChangingAndReflectingCorrectPrice() {
    }


}
