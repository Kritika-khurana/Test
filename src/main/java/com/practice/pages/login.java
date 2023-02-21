/**
 * 
 */
package com.practice.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import com.practice.baseclass.BasePage;

/**
 * @author kriti
 *
 */
public class login extends BasePage {
	
	
	
		//WebDriver driver = new ChromeDriver();
	
	public login() {
		super();
	}
		
		
	
		private By logo = By.xpath("//img[@alt='company-branding']");
	
		
		private By Username = By.xpath("//input[@placeholder='Username']");
		
		
		private By pwd = By.name("password");
		
		
		
		private By login = By.xpath("//button[@type='submit']");
		
		
		private By link = By.xpath("//div[@class='orangehrm-login-forgot']");
		
		
		
		
		public String logotext() {
			return logo.toString();
			
		}
		
		public WebElement user() {
			return driver.findElement(Username);
			
					
		}
		
		public WebElement pwd() {
			
			return driver.findElement(pwd);
		}
		
		public String linktext() {
			return  driver.findElement(link).getText();
		}
		
		public String loginTitle() 
		{
		return	driver.getTitle();
			
			
		}
		
         public WebElement Login() {
			
			return driver.findElement(login);
		}
		
	
		
		public HomePage logintohomepage(String un, String pd ) {
			user().sendKeys(un);
			 pwd().sendKeys(pd);
			 Login().click();
			 return new HomePage();
			
		}

	}


