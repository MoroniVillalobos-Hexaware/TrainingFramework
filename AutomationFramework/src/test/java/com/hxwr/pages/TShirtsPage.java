package com.hxwr.pages;

import com.hxwr.steps.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static com.hxwr.steps.hooks.*;

public class TShirtsPage {
    String failName="";

    public TShirtsPage(){
        driver= driverManager.getWebDriver();
    }
    By firstItemName= By.xpath("(//div[@id='center_column']/ul/li)[1]//a[@class='product-name']");
    By searchInput=By.xpath("//input[@id='search_query_top']");
    By moreButton=By.xpath("//a[@class='button lnk_view btn btn-default']");
    By quantityInput=By.xpath("//input[@id='quantity_wanted']");
    By sizeSelect=By.xpath("//select[@id='group_1']");
    By colorRef=By.xpath("//a[@name='Blue']");
    By addToCartButton= By.xpath("//button[@name='Submit']");
    By proceedToCheckOut=By.xpath("//a[@title='Proceed to checkout']");
    By proceedToCheckOut2=By.xpath("(//a[@title='Proceed to checkout'])[2]");
    By proceedToCheckOut3=By.xpath("//button[@name='processAddress']");
    By proceedToCheckOut4=By.xpath("//button[@name='processCarrier']");
    By agreeOnTermsCheck=By.xpath("//input[@id='cgv']");
    By payByCheckButton=  By.xpath("//a[@title='Pay by check.']");
    By confirmOrderButton = By.xpath("//button[@class='button btn btn-default button-medium']");
    By orderCompleteLabel=By.xpath("//p[contains(text(),'Your order on My Store is complete')]");
    By addWishListButton=By.xpath("//a[@class='addToWishlist wishlistProd_1']");
    By errorMessageLabelMustBeLoggedToWishList= By.xpath("//p[contains(text(),'You must be logged in to manage your wishlist.')]");
    By closeErrorMessage=By.xpath("//a[@title='Close']");
    By increaseQuantityButton= By.xpath("//a[@id='cart_quantity_up_1_1_0_0']");
    By firstItem=By.xpath("//ul[@class='product_list grid row']/li[1]");

    public boolean getNameTextForTheFirstProductShowedOnThePage(){
        try {
            failName="Click On sub menu T-Shirts";
         hooks.properties.put("firstItemName", driver.findElement(firstItemName).getText());
         Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        return true;
    }
    public boolean enterTheSameProductNameInTheSearchBarPresentOnTopOfThePageAndClickSearchButton(){
        try {
            failName="Enter Item To Search On Input";
           String itemToSearch= hooks.properties.get("firstItemName");
            driver.findElement(searchInput).sendKeys(itemToSearch);
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        try {
            failName="Click On Search Button";
            wait.until(ExpectedConditions.elementToBeClickable(searchInput));
            driver.findElement(searchInput).click();
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        return true;
    }
    public boolean validateTheSameProductIsDisplayedInSearchPageWithSameDetailsWhichWereDisplayedOnTShirtPage(){
        try {
            failName="validate the same product is displayed";
            wait.until(ExpectedConditions.visibilityOfElementLocated(firstItemName));
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        return true;
    }
    public boolean moreButtonWillBeDisplayedClickOnMoreButton(){
        try {
            failName="click on more button";
            wait.until(ExpectedConditions.visibilityOfElementLocated(moreButton));
            driver.findElement(moreButton).click();
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        return true;
    }
    public boolean increaseQuantityTo(String qty){
        try {
            failName="send Quantity";
            wait.until(ExpectedConditions.visibilityOfElementLocated(quantityInput));
            driver.findElement(quantityInput).clear();
            driver.findElement(quantityInput).sendKeys(qty);
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        return true;
    }
    public boolean selectSizeL(String size){
        try {
            failName="send size";
            Select select= new Select(driver.findElement(sizeSelect));
            select.selectByVisibleText(size);
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        return true;
    }
    public boolean selectColor(){
        try {
            failName="select color";
            wait.until(ExpectedConditions.visibilityOfElementLocated(colorRef));
            driver.findElement(colorRef).click();
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        return true;
    }
    public boolean clickAddToCarButton(){
        try {
            failName="click to car Button";
            wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButton));
            driver.findElement(addToCartButton).click();
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        return true;
    }
    public boolean completeTheBuyOrderProcessTillPayment(){
        try {
            failName="click on Check Out 1";
            wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckOut));
            driver.findElement(proceedToCheckOut).click();
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        try {
            failName="click on Check Out2 ";
            wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckOut2));
            driver.findElement(proceedToCheckOut2).click();
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        try {
            failName="click on Check Out 3";
            wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckOut3));
            driver.findElement(proceedToCheckOut3).click();
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        try {
            failName="click on terms Check ";
            wait.until(ExpectedConditions.visibilityOfElementLocated(agreeOnTermsCheck));
            Actions a = new Actions(driver);
            a.moveToElement(driver.findElement(agreeOnTermsCheck)).click().perform();
          //  driver.findElement(agreeOnTermsCheck).click();
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        try {
            failName="click on Check Out 4";
            wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckOut4));
            driver.findElement(proceedToCheckOut4).click();
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        try {
            failName="click pay By Check ";
            wait.until(ExpectedConditions.visibilityOfElementLocated(payByCheckButton));
            driver.findElement(payByCheckButton).click();
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        try {
            failName="click on Confirm Order ";
            wait.until(ExpectedConditions.visibilityOfElementLocated(confirmOrderButton));
            driver.findElement(confirmOrderButton).click();
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        return true;
    }
    public boolean makeSureThatProductIsOrdered(){
        try {
            failName="Validate Order Complete";
            wait.until(ExpectedConditions.visibilityOfElementLocated(orderCompleteLabel));
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        return true;
    }
    public boolean addToWishListWillAppearOnTheBottomOfThatProductAndClickOnIt(){
        try {
            failName="click on add to wish List";
            wait.until(ExpectedConditions.visibilityOfElementLocated(addWishListButton));
            driver.findElement(addWishListButton).click();
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        return true;
    }
    public boolean verifyThatErrorMessageIsDisplayedYouMustBeLoggedInToManageYouWishList(){
        try {
            failName="verify error message";
            wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessageLabelMustBeLoggedToWishList));
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        try {
            failName="close error message";
            wait.until(ExpectedConditions.visibilityOfElementLocated(closeErrorMessage));
            driver.findElement(closeErrorMessage).click();
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        return true;
    }
    public boolean changeTheQuantityTo(){
        try {
            failName="close error message";
            wait.until(ExpectedConditions.visibilityOfElementLocated(increaseQuantityButton));
            driver.findElement(increaseQuantityButton).click();
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        return true;
    }
    public boolean verifyThatIsChangingAndReflectingCorrectPrice(){
        try {

        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        return true;
    }
    public boolean mouseHoverOnTheSecondProductDisplayed(){
        try {
            Actions a = new Actions(driver);
            a.moveToElement(driver.findElement(firstItem)).perform();
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        return true;
    }
}
