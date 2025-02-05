package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SIMLogin {

	public void SimLogin(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://abesit.servergi.com:8077/SIMWEBABESIT/Modules/Home");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*//input[@id='txtUserId']")).sendKeys("ENNCRC2415");
		//driver.findElement(By.xpath("//*//input[@name='txtUserId']"]/div/button/span")).click();
		//driver.wait(10);
	//	driver.findElement(By.xpath("//input[@class='VfPpkd-muHVFf-bMcfAe']")).click();
		driver.findElement(By.xpath("//*//input[@id='txtPass']")).sendKeys("Sajal0#M");
		driver.findElement(By.xpath("//*//input[@id='btnLogin']")).click();
		////*[@id="password"]/div[1]/div/div[1]/input
	//	driver.close();

	}

}
