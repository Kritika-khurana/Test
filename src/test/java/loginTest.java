import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.practice.baseclass.BasePage;
import com.practice.pages.login;

public class loginTest extends BasePage {
	
	//public static void main(String[] args) {
		// TODO Auto-gener{}
	//loginTest lt = new loginTest();
	login ls = new login();
	
	
@BeforeTest
public void setup() {
	
ls.initialbrowser();
	
	
}

@Test
public void logintest() {

ls.logintohomepage(prop.getProperty("userName"),prop.getProperty("pd"));

}

		
@AfterTest
public void teardown() {
	ls.quitbrowser();
	
}

		
		
	
		

		

//	}

}
