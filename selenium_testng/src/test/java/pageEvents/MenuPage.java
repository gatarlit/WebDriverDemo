package pageEvents;

import pageObjects.LogoutObjects;
import utilities.ElementLocator;

public class MenuPage {
	
	public void logOut() {
		this.clickLogoutButton();
	}

	private void clickLogoutButton() {
		ElementLocator menu = new ElementLocator();
		ElementLocator logout = new ElementLocator();
		
		menu.getWebElement("id", LogoutObjects.menuId).click();
		logout.getWebElement("id", LogoutObjects.logoutId).click();
	}

}
