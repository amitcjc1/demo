import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amit\\Desktop\\Testing Document\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver= new ChromeDriver();
		 
		  driver.get("http://a.testaddressbook.com/addresses/new");
		  
		  driver.manage().window().maximize();
		  
		  System.out.println("Auto It")
		  
		  driver.findElement(By.id("session_email")).sendKeys("aaa@gmail.com");
		  
		  driver.findElement(By.id("session_password")).sendKeys("aaa");
		  
		  driver.findElement(By.name("commit")).click();
		  
		  Thread.sleep(3000);
		  
		 // driver.findElement(By.linkText("/addresses")).click();
		  
		  driver.findElement(By.id("address_first_name")).sendKeys("aaaBBB");
		  
		  
		  
		 // driver.findElement(By.xpath("/html/body/div/div/div[1]/div[6]/div/div[2]/div/div/div/div/div[2]/form/label/div/div[3]")).click(); // //*[@id=\'cjc\']"
		  
		 
				 driver.findElement(By.xpath("//input[@id='address_picture']")).sendKeys("C:\\Users\\amit\\Desktop\\aaa.txt");
		 // WebDriverWait wait = new WebDriverWait(driver,30);
		  
				//  wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//input[@id='address_picture']"))));
				  
		  Runtime.getRuntime().exec("C:\\Users\\amit\\Desktop\\Auto IT\\fileupload.exe");
		  
	}
}
