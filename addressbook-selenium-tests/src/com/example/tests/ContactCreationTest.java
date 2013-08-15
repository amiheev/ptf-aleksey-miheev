package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase   {
 

  @Test
  public void testNonEmptyContactCreation() throws Exception {
    goToMainPage();
    contactCreation();
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
    contact.group = "group 1";
    contact.addresstwo = "address 2";
    contact.homeone = "home 1";
	fillContactData(contact);
    acceptContactCreation();
    returnToMainPage();
  }
  
  @Test
  public void testEmptyContactCreation() throws Exception {
    goToMainPage();
    contactCreation();
    fillContactData(new ContactData("", "", "", "", "", "", "", "", "-", "-", "", "", "", ""));
    acceptContactCreation();
    returnToMainPage();
  }


}
