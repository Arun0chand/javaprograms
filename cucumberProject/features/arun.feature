Feature: Login

  Scenario Outline: Successful login with the valid credentials
    Given User lauch the chrome browser
    When User opens the url "https://admin-demo.nopcommerce.com/login"
    And User enters the mails as <email> and password as <password>
    And Click on the login
    Then Page title should be navigated to "Dashboard / nopCommerce administration"
    When user click on the logout link
    Then Page title should be "Your store. Login"
    And close the browser

Examples:
    |email              |password|
    |admin@yourstore.com|admin   |
    |admin@yourstor.com |admi    |
    |admin@yourste.com  |adin    |
    |admin@yoore.com    |amin    |
    
    