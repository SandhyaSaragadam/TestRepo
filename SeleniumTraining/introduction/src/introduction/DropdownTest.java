package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sandhya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flygofirst.com/");
		driver.findElement(By.id("roundTripbdFromView")).click();
		//driver.findElement(By.xpath("//a[@id='ui-id-979']")).click();
		driver.findElement(By.id("979")).click();
		//driver.findElement(By.xpath("//a[@id='ui-id-519']")).click();
////input[@id='roundTripbdFromView'])[1]
		//ul//id="ui-id-7"
		//<a id="ui-id-519" class="ui-corner-all" tabindex="-1">Bengaluru (BLR)</a>
		

	}

}
