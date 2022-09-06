Feature: OrangeHRM Login
	
	@Sanity
	Scenario: Login to OrangeHRM homepage
		Given I launch chrome browser
		When I open orange hrm homepage
		Then Enter username as "Admin"
		Then Enter password as "admin123"
		Then click on login button
		Then verify homepage title as "OrangeHRM"
		And close browser
		
	@Regression	
	Scenario Outline: Login to OrangeHRM homepage
		Given I launch chrome browser
		When I open orange hrm homepage
		Then Enter username as "<username>"
		Then Enter password as "<password>"
		Then click on login button
		Then verify homepage title as "OrangeHRM"
		And close browser
		
		Examples:
				| username | password |
				| Admin		 | admin123 |
				| Admin		 | admin123 |	