package com.example.fw;

import org.openqa.selenium.By;

public class NavigationHelper extends HelperBase {

	public NavigationHelper(ApplicationManager manager) {
		super(manager);
		
	}

	public void openMainPage() {
		driver.get(manager.baseUrl + "/addressbookv4.1.4/");
	}

	public void goToGroupsPage() {
		click(By.linkText("groups"));
	}

	public void initContact() {
		click(By.cssSelector("img[alt=\"Edit\"]"));
	}

	public void deleteContact() {
		click(By.xpath("(//input[@name='update'])[2]"));
		
	}

	public void goToMainPage() {
		driver.get(manager.baseUrl + "/addressbookv4.1.4/");
	}

}
