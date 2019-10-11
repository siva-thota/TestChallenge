Feature: Acceptance tests for current special offers 

Background: 
	Given  application is running 
	
@TrousersDiscount 
Scenario Outline: Checking trousers discount 
	When  I buy <no of trousers> trousers 
	Then  I get 10% discount 
	And  My total amount is<total to Pay> 
	
	Examples: 
		|no of trousers|total to Pay|
		|1			   |31.995      |
		|10            |319.95      |
		|0			   | 0			|
		
@TieDiscount 
Scenario Outline: Checking tie discount 
	When  I buy <no of shirts> shirts 
	And I buy <no of ties> 
	Then my subtotal is <subtotal>
	And my discount is <dicount>
	And my total amount is<total to Pay> 
	
	Examples: 
		|no of shirts|no of ties|subtotal|discount|total to Pay|
		|	2		  | 1		|  34.5  |	4.75  |  29.75     |
		|   4         |	1		|  59.5  |  4.75  |  54.75     |
		|	4		  |	2		|  69.0	 |  9.5   |  59.5	   |
		|	1		  | 1       |  22.0  |  0.0   |  22.0	   |
		|	2		  | 0       |  25.0  |  0.0   |  25.0	   |
		