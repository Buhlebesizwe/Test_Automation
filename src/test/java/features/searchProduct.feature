Feature: Search and Place the order for products.
@OffersPage
Scenario Outline: Search Experience for product search in both home and offers 

Given User is on GreenCart Landing page
When user searched with shortname <Name> and etracted the actual name of the product
Then user searched for the <Name> shortname in offers page
And validate product name in offers page matches with landing page

Examples:
|	Name	|
|	Tom		|
|	Beet	|