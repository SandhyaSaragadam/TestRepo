package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sandhya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flygofirst.com/");
		driver.findElement(By.className("passenger_round")).click();
		Thread.sleep(2000L);
		
		int i = 1;
		while (i < 5) {
			driver.findElement(By.className("plus_adult")).click();
			i++;
		}
		System.out.println(driver.findElement(By.className("totalPassenger")).getText());

	}

}
