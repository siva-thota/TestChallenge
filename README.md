# TestChallenge
Test Automation using Java , Junit and gradle

# How to run the application

Run the file "\src\main\java\com\test\basket\product\item\reader\BasketItemReader.java" as java application

You should be able to see "Enter your input: " in the console.

Now provide the items list  for example : Shirt Trousers Tie Jacket (with space between each item and with out any commas) and hit enter.

You should be able to see the output in console.


# Acceptance Tests:

Please find the cucumber acceptance tests at "\src\test\resources\features\AcceptanceTests.feature"
Test covered:
1. Checking trousers discount
2. Checking tie discount 
3. Checking tie and trouser discount together
4. Checking basket total when item has no discount
