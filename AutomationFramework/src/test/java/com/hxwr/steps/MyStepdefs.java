package com.hxwr.steps;
import com.hxwr.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.Assertion;
public class MyStepdefs {
    LoginPage loginPage= new LoginPage();
    Assertion assertion;
    MainPage mainPage;
    SignInPage signInPage;
    AccountCreationPage accountCreationPage;
    MyAccountPage myAccountPage;
    TShirtsPage tShirtsPage;
    public MyStepdefs(){
         assertion= new Assertion();
         mainPage= new MainPage();
         signInPage= new SignInPage();
         accountCreationPage= new AccountCreationPage();
         myAccountPage=new MyAccountPage();
         tShirtsPage=new TShirtsPage();
    }
    @Given("^open (.+) in browser (CHROME|FIREFOX)$")
    public void open(String url,String browser) {
        try {
            if(!mainPage.navigateToUrl(hooks.properties.get(url),browser)){
                assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
            assertion.fail(hooks.FailureTestMessage);
        }
    }

    @When("^click on sign in link$")
    public void clickOnSignInLink() {
        try {
            if(!mainPage.clickOnSignButton()){
                assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
            assertion.fail(hooks.FailureTestMessage);
        }
    }

    @And("^Enter your (.+) in create an account section$")
    public void enterYourInCreateAnAccountSection(String email) {
        try {
            if(!signInPage.enterEmailAddres(hooks.properties.get(email))){
                assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
            assertion.fail(hooks.FailureTestMessage);
        }
    }

    @And("^click on create an account button$")
    public void clickOnCreateAnAccountButton() {
        try {
            if(!signInPage.clickOnCreateAccountbutton()){
                assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
            assertion.fail(hooks.FailureTestMessage);
        }
    }

    @And("^enter your personal information address and contact info$")
    public void enterYourPersonalInformationAnd() {
        try {
            if(!accountCreationPage.enterYourPersonalInformation()){
                assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
            assertion.fail(hooks.FailureTestMessage);
        }
    }

    @And("^Click on register button$")
    public void clickOnRegisterButton() {
        try {
            if(!accountCreationPage.clickOnRegisterButton()){
                assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
            assertion.fail(hooks.FailureTestMessage);
        }
    }

    @Then("^Validate that user is created$")
    public void validateThatUserIsCreated() {
        try {
            if(!myAccountPage.validateThatUserIsCreated()){
                assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
            assertion.fail(hooks.FailureTestMessage);
        }
    }

    @And("^Enter your (.+) in the email box and click enter$")
    public void enterYourInTheEmailBoxAndClickEnter(String email) {
        try {
            if(!signInPage.enterInvalidEmail(email)){
                assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
            assertion.fail(hooks.FailureTestMessage);
        }
    }



    @And("^Enter your (.+) and click register button$")
    public void enterYourEmailAndClickRegisterButton(String email) {
        try {
            if(!signInPage.enterYourEmailAndClickRegisterButton(hooks.properties.get(email))){
                assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
            assertion.fail(hooks.FailureTestMessage);
        }
    }

    @And("^Leave the mandatory fields mark with blank and click register button$")
    public void leaveTheMandatoryFieldsMarkWithBlankAndClickRegisterButton() {
        try {
            if(!accountCreationPage.leaveTheMandatoryFieldsMarkWithBlankAndClickRegisterButton()){
                assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
            assertion.fail(hooks.FailureTestMessage);
        }
    }

    @Then("^Verify that error has been displayed for the mandatory fields$")
    public void verifyThatErrorHasBeenDisplayedForTheMandatoryFields() {
        try {
            if(!accountCreationPage.verifyThatErrorHasBeenDisplayedForTheMandatoryFields()){
                    assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
                assertion.fail(hooks.FailureTestMessage);
        }
    }




    @Then("^Verify that error messages for respective fields are displaying$")
    public void verifyThatErrorMessagesForRespectiveFieldsAreDisplaying() {
    }

    @When("^Move the cursor over Woman's Link$")
    public void moveTheCursorOverWomanSLink() {
        try {
            if(!mainPage.moveTheCursorOverWomanSLink()){
                assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
            assertion.fail(hooks.FailureTestMessage);
        }
    }

    @And("^Click on sub menu T-shirts$")
    public void clickOnSubMenuTShirts() {
        try {
            if(!mainPage.clickOnSubMenuTShirts()){
                    assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
                assertion.fail(hooks.FailureTestMessage);
        }
    }

    @And("^get name text for the first product showed on the page$")
    public void getNameTextForTheFirstProductShowedOnThePage() {
        try {
            if(!tShirtsPage.getNameTextForTheFirstProductShowedOnThePage()){
                    assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
                assertion.fail(hooks.FailureTestMessage);
        }
    }

    @And("^Enter the same product name in the search bar present on top of the page and click search button$")
    public void enterTheSameProductNameInTheSearchBarPresentOnTopOfThePageAndClickSearchButton() {
        try {
            if(!tShirtsPage.enterTheSameProductNameInTheSearchBarPresentOnTopOfThePageAndClickSearchButton()){
                    assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
                assertion.fail(hooks.FailureTestMessage);
        }
    }

    @Then("^Validate the same product is displayed in search page with same details which were displayed on T-shirt page$")
    public void validateTheSameProductIsDisplayedInSearchPageWithSameDetailsWhichWereDisplayedOnTShirtPage() {
        try {
            if(!tShirtsPage.validateTheSameProductIsDisplayedInSearchPageWithSameDetailsWhichWereDisplayedOnTShirtPage()){
                    assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
                assertion.fail(hooks.FailureTestMessage);
        }
    }

    @When("^Login to the web site$")
    public void loginToTheWebSite() {
        try {
            if(!signInPage.loginToTheWebSite()){
                    assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
                assertion.fail(hooks.FailureTestMessage);
        }
    }

    @And("^Mouse hover on the second product displayed$")
    public void mouseHoverOnTheSecondProductDisplayed() {
        try {
            if(!tShirtsPage.mouseHoverOnTheSecondProductDisplayed()){
                    assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
                assertion.fail(hooks.FailureTestMessage);
        }
    }

    @Then("^More button will be displayed , click on more button$")
    public void moreButtonWillBeDisplayedClickOnMoreButton() {
        try {
            if(!tShirtsPage.moreButtonWillBeDisplayedClickOnMoreButton()){
                    assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
                assertion.fail(hooks.FailureTestMessage);
        }
    }

    @And("^Make sure quantity set to (.+)$")
    public void increaseQuantityTo(String qty) {
        try {
            if(!tShirtsPage.increaseQuantityTo(qty)){
                    assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
                assertion.fail(hooks.FailureTestMessage);
        }
    }

    @And("^select size (L|M|S)$")
    public void selectSize(String size) {
        try {
            if(!tShirtsPage.selectSizeL(size)){
                    assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
                assertion.fail(hooks.FailureTestMessage);
        }
    }

    @Then("^Select Color$")
    public void selectColor() {
        try {
            if(!tShirtsPage.selectColor()){
                    assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
                assertion.fail(hooks.FailureTestMessage);
        }
    }

    @Then("^Click Add to Car button$")
    public void clickAddToCarButton() {
        try {
            if(!tShirtsPage.clickAddToCarButton()){
                    assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
                assertion.fail(hooks.FailureTestMessage);
        }
    }

    @Then("^Complete the buy order process till payment$")
    public void completeTheBuyOrderProcessTillPayment() {
        try {
            if(!tShirtsPage.completeTheBuyOrderProcessTillPayment()){
                    assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
                assertion.fail(hooks.FailureTestMessage);
        }
    }

    @Then("^Make Sure that Product Is Ordered$")
    public void makeSureThatProductIsOrdered() {
        try {
            if(!tShirtsPage.makeSureThatProductIsOrdered()){
                    assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
                assertion.fail(hooks.FailureTestMessage);
        }
    }

    @Then("^Add To Wish List will appear on the Bottom of that product and click on it$")
    public void addToWishListWillAppearOnTheBottomOfThatProductAndClickOnIt() {
        try {
            if(!tShirtsPage.addToWishListWillAppearOnTheBottomOfThatProductAndClickOnIt()){
                    assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
                assertion.fail(hooks.FailureTestMessage);
        }
    }

    @Then("^Verify That error Message Is Displayed Invalid email address$")
    public void verifyThatErrorMessageIsDisplayed() {
        try {
            if(!signInPage.verifyThatErrorMessageIsDisplayed()){
                    assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
                assertion.fail(hooks.FailureTestMessage);
        }
    }

    @Then("^Click Proceed To Check out Button$")
    public void clickProceedToCheckOutButton() {
        try {
            if(!tShirtsPage.clickProceedToCheckOutButton()){
                    assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
                assertion.fail(hooks.FailureTestMessage);
        }
    }

    @Then("^Change The Quantity to 2$")
    public void changeTheQuantityTo() {
        try {
            if(!tShirtsPage.changeTheQuantityTo()){
                    assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
                assertion.fail(hooks.FailureTestMessage);
        }
    }

    @Then("^Verify That is changing and reflecting correct price$")
    public void verifyThatIsChangingAndReflectingCorrectPrice() {

        try {
            if(!tShirtsPage.verifyThatIsChangingAndReflectingCorrectPrice()){
                    assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
                assertion.fail(hooks.FailureTestMessage);
        }
    }


    @Then("Verify That error Message Is Displayed You Must be Logged In to Manage You wish List")
    public void verifyThatErrorMessageIsDisplayedYouMustBeLoggedInToManageYouWishList() {

        try {
            if(!tShirtsPage.verifyThatErrorMessageIsDisplayedYouMustBeLoggedInToManageYouWishList()){
                    assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
                assertion.fail(hooks.FailureTestMessage);
        }
    }

    @And("Enter incorrect values in fields and click register button")
    public void enterIncorrectValuesInFieldsAndClickRegisterButton() {
        try {
            if(!accountCreationPage.enterIncorrectValuesInFieldsAndClickRegisterButton()){
                assertion.fail(hooks.FailureTestMessage);
            }
        }catch (Exception e){
            assertion.fail(hooks.FailureTestMessage);
        }
    }
}
