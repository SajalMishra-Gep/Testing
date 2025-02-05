package UI;

//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testng {
	
@Test
	
	public void setup() {
		System.out.println("hello Test");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testng.org/");
	}

	

}
