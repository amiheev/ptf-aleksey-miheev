package com.example.tests;

import java.util.Collections;
import java.util.List;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase   {
 

  @Test
  public void testNonEmptyContactCreation() throws Exception {
    app.getNavigationHelper().goToMainPage();
    app.getContactHelper().contactCreation();
    
    //save old state
    List<ContactData> oldList = app.getContactHelper().getContacts(); 
    
    //actions
    ContactData contact = new ContactData();
    contact.nameone = "name 1";
    contact.nametwo = "name 2";
    contact.addressone = "address 1";
    contact.phoneone = "phone 1";
    contact.phonetwo = "phone 2";
    contact.phonethree = "phone 3";
    contact.emailone = "1@1.com";
    contact.emailtwo = "2@2.com";
    contact.birthdayday = "13";
    contact.birthdaymonth = "March";
    contact.birthdayyear = "1990";
    // contact.group = "group 1";
    contact.addresstwo = "address 2";
    contact.homeone = "home 1";
	app.getContactHelper().fillContactData(contact);
    app.getContactHelper().acceptContactCreation();
    app.getContactHelper().returnToMainPage();
    
    //save new state
    List<ContactData> newList = app.getContactHelper().getContacts();
    
    //compare states
    oldList.add(contact);
    Collections.sort(oldList);
    assertEquals(newList, oldList);
  }
  
  //@Test
 // public void testEmptyContactCreation() throws Exception {
  //  app.getNavigationHelper().goToMainPage();
  //  app.getContactHelper().contactCreation();
  //  app.getContactHelper().fillContactData(new ContactData("", "", "", "", "", "", "", "", "-", "-", "", "[none]", "", ""));
  //  app.getContactHelper().acceptContactCreation();
   // app.getContactHelper().returnToMainPage();
//  }


}
