package com.example.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase   {
	@DataProvider
	public Iterator<Object[]> randomValidContactGenerator() {
		List<Object[]> list = new ArrayList<Object[]>();
		for (int i = 0; i < 5; i++) {
			ContactData contact = new ContactData();
			contact.nameone = generateRandomString();
			contact.nametwo = generateRandomString();
			contact.addressone = generateRandomString();
			contact.addresstwo = generateRandomString();
			list.add(new Object[]{contact});
		}
		return list.iterator();
	}
	
	public String generateRandomString() {
		Random rnd = new Random();
		if (rnd.nextInt(3) == 0) {
			return "";
		}
		else {
			return "test" + rnd.nextInt();
		}
		
	}
 

  @Test(dataProvider = "randomValidContactGenerator")
  public void testContactCreationWithValidData(ContactData contact) throws Exception {
    app.getNavigationHelper().goToMainPage();
    
    //save old state
    List<ContactData> oldList = app.getContactHelper().getContacts(); 
    	
    //actions
    app.getContactHelper().contactCreation();
    app.getContactHelper().fillContactData(contact);
    app.getContactHelper().acceptContactCreation();
    app.getContactHelper().returnToMainPage();
    
    //save new state
    List<ContactData> newList = app.getContactHelper().getContacts();
    
    //compare states
    oldList.add(contact);
    Collections.sort(oldList);
    Collections.sort(newList);
    assertEquals(newList, oldList);
  }
  
 }
