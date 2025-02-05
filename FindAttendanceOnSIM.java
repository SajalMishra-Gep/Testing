package UI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindAttendanceOnSIM {

	@SuppressWarnings("deprecation")
	public void SimAttendance(String[] args) {
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
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement Employee=driver.findElement(By.xpath("//*//a[@class='mm-item-link' and text()='Employee']" ));
		Actions a1 = new Actions(driver);
		a1.moveToElement(Employee).perform();
		
		driver.findElement(By.xpath("//*[@id=\"divMenu\"]/ul/li[3]/div/div[2]/div[2]/div/a")).click();
		//*[@id="MCPH_EMCPH_btnShowAtt"]
		driver.findElement(By.xpath("//*[@id=\"MCPH_EMCPH_btnShowAtt\"]")).click();
		
	//	driver.close();

	}

}
