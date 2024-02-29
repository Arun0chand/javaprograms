Feature: Login function

  Scenario: Successful login with the valid credentials
    Given user launch the chrome browser
    When user opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And user enters the email as "admin@yourstore.com" and password as "admin"
    And click on the login
    Then page tilte should be "Dashboard / nopCommerce administration"
    When user click on the logout link
    Then page title should be "Your store. Login"
    And close the browser
