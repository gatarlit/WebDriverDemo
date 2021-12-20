package pageObjects;

public interface LoginPageObjects {
	String loginUrl = "https://www.saucedemo.com/inventory.html";
	String validUsername = "standard_user";
	String invalidUsername = "standard_user1";
	String validPassword = "secret_sauce";
	String invalidPassword = "secret_sauce1";
	String ERROR_LOGIN = "Epic sadface: Username and password do not match any user in this service";
	
	String signInButtonID = "login-button";
	String usernameID = "user-name";
	String passwordID = "password";
	String errorMessageLoginClassName = "error-message-container";
}
