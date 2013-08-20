package com.example.tests;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
	
	@Test
	public void modifySomeContact() {
		app.getNavigationHelper().goToMainPage();
		app.getNavigationHelper().initContact();
		ContactData contact = new ContactData();
		contact.nameone = "new name 1";
		app.getContactHelper().fillContactData(contact);
		app.getContactHelper().submitContactModification();
		app.getContactHelper().returnToMainPage();
	}
}
