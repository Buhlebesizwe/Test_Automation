Feature: Place the order for products.

@PlaceOrder
Scenario Outline: Search Experience for product search in both home and offers 

Given User is on GreenCart Landing page
When user searched with shortname <Name> and etracted the actual name of the product
And Added "3" items of the selected product to cart
Then User proceed to Checkout and validate the <Name> items in checkout page
And verify user has ability to enter promo code and place the order

Examples:
|	Name	|
|	Tom		|
| Elee  |