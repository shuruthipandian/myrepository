Feature: demo on datatable
Scenario: search a product in application
Given open the application and go to search page
When  type the below product and search
|products|
|earphones|
|mobile phones|
Then ensure the product details being displayed
