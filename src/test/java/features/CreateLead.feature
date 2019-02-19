Feature: Automate LeafTap  Flow 
Scenario Outline: Create Lead as PosstiveCase
	When click on CRM
	And click on Lead 
	When Click on Create Lead Button 
	Then Enter the Company Name <companyName>
	And Enter the First Name <FirstName>
	And Enter the Last Name <LastName>
	Then click on Create Lead Button 
Examples: 
	|companyName|FirstName|LastName|
	|dharani|sankar|ko|
	|lakshmi|bharath|krish|
	
Scenario Outline: Create Lead as NegativeCase  
	When click on CRM 
	And click on Lead 
	When Click on Create Lead Button 
	Then Enter the Company Name <companyName>
	And Enter the First Name <FirstName>
	And Enter the Last Name <LastName>
	But without mandatory click on Create Lead Button<expectedwarning>
	Examples: 
	|companyName|FirstName|LastName|expectedwarning|
	||Lakshmi|k|crmsfa.createLead.companyName|
	|HCL||L|crmsfa.createLead.firstName|
	|TCS|Dharani||crmsfa.createLead.lastName|
	|||J|crmsfa.createLead.firstName|
	|Testleaf|||crmsfa.createLead.firstName|
	||Kavya||crmsfa.createLead.companyName|
	||||crmsfa.createLead.companyName|
	
	
	
	

	
	
