package com.example.tests;

import org.testng.annotations.Test;

public class ContactRemovalTests extends TestBase {
	
	@Test
	public void deleteSomeContact(){
		app.getNavigationHelper().openMainPage();
		app.getNavigationHelper().initContact();
		app.getNavigationHelper().deleteContact();
		app.getContactHelper().returnToMainPage();
		
	}

}
