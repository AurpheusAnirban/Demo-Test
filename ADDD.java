package title;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ADDD {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Faria\\Desktop\\JartLab\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        
        driver.get("http://twitter.com");
       
        String ActualTitle = driver.getTitle();
        System.out.println("Your page title Is : "+ActualTitle);
        Assert.assertEquals("Twitter. It's what's happening.",ActualTitle);
       // Assert.assertEquals("Only Testing",driver.getTitle());
        driver.close();
       }
		
		
		
		
	}


