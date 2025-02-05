package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {

	public void Demo(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
		driver.findElement(By.xpath("//*[@id=\"gh-search-btn\"]/span")).click();
		driver.close();
		

	}

}
