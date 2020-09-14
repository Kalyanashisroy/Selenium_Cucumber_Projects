Feature: Test Facebook smoke scenario


    	Scenario: Test login with valid credentials
		Given Open firefox and start application
		When I enter valid "kgec.kr@gmail.com" and valid "Kalyayn@654321"
		Then User should be able to login successfully
		
		
		
		 