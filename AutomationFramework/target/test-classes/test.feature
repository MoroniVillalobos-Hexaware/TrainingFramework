@FullRegression
Feature:   E Commerce Testing
@test
  Scenario:User Registration
  Given open automation_practice_url in browser FIREFOX
    When click on sign in link
    And Enter your email_address in create an account section
    And click on create an account button
    And enter your personal information address and contact info
    And Click on register button
    Then Validate that user is created


  Scenario:Verify Invalid Email address error
    Given open automation_practice_url in browser CHROME
    When click on sign in link
    And Enter your moroniV123 in the email box and click enter
    Then Verify That error Message Is Displayed Invalid email address

  Scenario:Verify error Message For mandatory fields
    Given open automation_practice_url in browser CHROME
    When click on sign in link
    And Enter your email_address and click register button
    And Leave the mandatory fields mark with blank and click register button
    Then Verify that error has been displayed for the mandatory fields

  Scenario:Verify error Message For Entering incorrect values in fields
    Given open automation_practice_url in browser CHROME
    When click on sign in link
    And Enter your email_address and click register button
    And Enter incorrect values in fields and click register button
   Then Verify that error messages for respective fields are displaying

  Scenario:Search Product
    Given open automation_practice_url in browser CHROME
    When Move the cursor over Woman's Link
    And Click on sub menu T-shirts
    And get name text for the first product showed on the page
    And Enter the same product name in the search bar present on top of the page and click search button
    Then Validate the same product is displayed in search page with same details which were displayed on T-shirt page

  Scenario:Buy product feature
    Given open automation_practice_url in browser CHROME
    Then click on sign in link
    When Login to the web site
     And Move the cursor over Woman's Link
     And Click on sub menu T-shirts
      And Mouse hover on the second product displayed
     Then  More button will be displayed , click on more button
     And  Make sure quantity set to 2
     And select size L
     Then Select Color
     Then Click Add to Car button
     Then Complete the buy order process till payment
     Then Make Sure that Product Is Ordered

  Scenario:Verify that Wish List Only Works After Login
    Given open automation_practice_url in browser CHROME
    When Move the cursor over Woman's Link
    And Click on sub menu T-shirts
    And Mouse hover on the second product displayed
    Then Add To Wish List will appear on the Bottom of that product and click on it
    Then Verify That error Message Is Displayed You Must be Logged In to Manage You wish List

  Scenario:Verify that total price is reflecting correctly if user changes quantity in shopping cart
    Given open automation_practice_url in browser CHROME
    Then click on sign in link
    When Login to the web site
    When Move the cursor over Woman's Link
    And Click on sub menu T-shirts
    And Mouse hover on the second product displayed
    Then  More button will be displayed , click on more button
    Then Make sure quantity set to 1
    And select size M
    And Select Color
    Then Click Add to Car button
    Then Click Proceed To Check out Button
    Then Change The Quantity to 2
    Then Verify That is changing and reflecting correct price

