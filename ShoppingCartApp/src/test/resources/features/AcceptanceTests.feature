Feature: Acceptance tests for current special offers 

Background: 
	Given application is running 

	
@TrousersDiscount 
Scenario Outline: Checking trousers discount 
	When I buy <no of trousers> trousers 
	Then I get 10% discount 
	Then my subtotal is <subtotal>
	And my discount is <discount>
	And my total amount is<total to Pay> 
	
	Examples: 
		|no of trousers|  subtotal  |discount|total to Pay|
		|1			   |	35.5 	| 3.55   |31.995      |
		|10            |   355.5    |35.55   |319.95      |

		
@TieDiscount 
Scenario Outline: Checking tie discount 
	When I buy <no of shirts> shirts 
	And I buy <no of ties> 
	Then my subtotal is <subtotal>
	And my discount is <discount>
	And my total amount is<total to Pay> 
	
	Examples: 
		|no of shirts|no of ties|subtotal|discount|total to Pay|
		|	2		  | 1		|  34.5  |	4.75  |  29.75     |
		|   4         |	1		|  59.5  |  4.75  |  54.75     |
		|	4		  |	2		|  69.0	 |  9.5   |  59.5	   |
		|	1		  | 1       |  22.0  |  0.0   |  22.0	   |
		|	2		  | 0       |  25.0  |  0.0   |  25.0	   |		
		
@CheckingTieAndTrouserDiscount
Scenario Outline: Checking tie and trouser discount together 
	When I buy <no of trousers> trousers 
	And I buy <no of shirts> shirts 
	And I buy <no of ties> 
	Then my subtotal is <subtotal>
	And my discount is <discount>
	And my total amount is<total to Pay> 
	
	Examples: 
		|no of trousers|no of shirts|no of ties|subtotal|discount|total to Pay|
		|		1      |	2		|  1	   |  70.0  |  8.30  |  61.7      |
		|		0      |    4       |  1	   |  59.5  |  4.75  |  54.75     |
		|       1      |	1		|  1       |  57.5  |  3.55  |  53.95	  |
		
@BasketWithNoDiscount
Scenario Outline: Checking basket total when item has no discount 
	When I buy <no of jackets> jackets 
	When I buy <no of shirts> shirts 
	And I buy <no of ties> 
	Then my subtotal is <subtotal>
	And my discount is <discount>
	And my total amount is<total to Pay> 
	
	Examples: 
		|no of jackets |no of shirts|no of ties|subtotal|discount|total to Pay|
		|		1      |	1		|  1	   |  71.4  |  0.0   |  71.4      |
		|		0      |    1       |  2	   |  31.5  |  0.0   |  31.5      |
		|       1      |	2		|  0       |  74.4  |  0.0   |  74.4	  |
		