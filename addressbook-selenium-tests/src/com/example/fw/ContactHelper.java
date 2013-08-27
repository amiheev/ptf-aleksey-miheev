package com.example.fw;

import java.util.ArrayList; 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.tests.ContactData;

public class ContactHelper extends HelperBase {

	public ContactHelper(ApplicationManager manager) {
		super(manager);
		
	}

	public void fillContactData(ContactData contact) {
		type(By.name("firstname"), contact.nameone); 
		type(By.name("lastname"), contact.nametwo); 
	    type(By.name("address"), contact.addressone); 
		type(By.name("home"), contact.phoneone); 
	    type(By.name("mobile"), contact.phonetwo); 
	    type(By.name("work"), contact.phonethree); 
	    type(By.name("email"), contact.emailone); 
	    type(By.name("email2"), contact.emailtwo); 
	    selectByText(By.name("bday"), contact.birthdayday);
	    selectByText(By.name("bmonth"), contact.birthdaymonth);
	    type(By.name("byear"), contact.birthdayyear);
	      // selectByText(By.name("new_group"), contact.group);
	    type(By.name("address2"), contact.addresstwo); 
	  	type(By.name("phone2"), contact.homeone); 
	}

	

	public void acceptContactCreation() {
		click(By.name("submit"));
	}

	public void contactCreation() {
		click(By.linkText("add new"));
	}

	public void returnToMainPage() {
		click(By.linkText("home page"));
	}

	public void submitContactModification() {
		click(By.name("update"));
		
	}

	public List<ContactData> getContacts() {
		List<ContactData> contacts = new ArrayList<ContactData>();
		List<WebElement> checkboxes = driver.findElements(By.name("selected[]"));
		for (WebElement checkbox : checkboxes) {
			ContactData contact = new ContactData();
			String alt = checkbox.getAttribute("alt");
			contact.nameone = alt.substring("Select (".length(), alt.length() - ")".length());
			contact.nametwo = alt.substring("Select (".length(), alt.length() - ")".length());
			contacts.add(contact);
		}
		return contacts;
	}

}
