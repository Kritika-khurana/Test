package com.practice.baseclass;



import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasePage {
	
	public  WebDriver driver;
	public static Properties prop;
	public BasePage() {
		// TODO Auto-generated method stub
		
		 prop = new Properties();
		try {
			FileInputStream src = new FileInputStream("C:\\Users\\kriti\\eclipse-workspace\\Kritika_Framework\\src\\main\\java\\com\\practice\\config\\cofig.properties");
		
				prop.load(src);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("File not found");
				e.printStackTrace();
			}
			
		 
	}
	


	
public void initialbrowser() {
	prop.getProperty("browser");

	
	driver = new ChromeDriver();

	driver.get(prop.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

}

public void quitbrowser() {
	driver.quit();
}
	
}
		
		
		

