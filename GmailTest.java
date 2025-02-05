package UI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class GmailTest {
@Test
	@SuppressWarnings("deprecation")
	public void GmailLogin() throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.gmail.com");
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("sautomationabesit123@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Sautomation@123");
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//======Click Compose======
		driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
		
		driver.findElement(By.xpath("//*//input[@id=':ce' and @class ='agP aFw']")).sendKeys("sajal.mishra@abesit.edu.in");
		//driver.findElement(By.xpath("//input[@id=':ce']")).sendKeys("vijay.kumar@abesit.edu.in");
		
		driver.findElement(By.xpath("//input[@id=':8n']")).sendKeys("Demo Automation");
		//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\":a1\"]")).sendKeys("Good afternoon sir, here is the Demo Automation	Warm regards	Demo");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id=':8d']")).click();
		
		
		
		//driver.close();

	}

}
