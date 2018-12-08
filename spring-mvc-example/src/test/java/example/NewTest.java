package example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;	

class NewTest {
	 WebDriver driver;

	@Test
	 void testEasy() {	
		driver.get("http://google.com");  
		String Expectedtitle="google";
		String Actualtitle = driver.getTitle();		
		System.out.println("Before assertion:"+Expectedtitle );
		System.out.println("Before assertion:"+Actualtitle );
		Assert.assertEquals(Expectedtitle, Actualtitle);	
		System.out.println("After assertion :"+Expectedtitle +Actualtitle +"title matched");
	}	
	@BeforeTest
	 void beforeTest() {	
	    driver = new ChromeDriver();
	}		
	@AfterTest
	 void afterTest() {
		driver.quit();			
	}		

}
