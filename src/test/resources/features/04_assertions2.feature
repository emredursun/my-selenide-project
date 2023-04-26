@assertions2
  Feature: assertions2
    Scenario: TC01_search_for_tesla
      Given I navigate to "https://www.google.com"
      Given I change google search location to English (United States) and accept the google search cookies
      When I search for "Tesla"
      Then verify page source contains "Tesla"
      Then verify the result should contain "About" keyword
      Then the first result in the page sections should contain "Tesla"
      Then I hold the browser open

#     Created test case in feature folder -DONE
#     Create page objects in the page folder -DONE
#     Create step definitions in step definitions folder