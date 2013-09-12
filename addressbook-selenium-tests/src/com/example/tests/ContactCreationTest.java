package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase   {

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
