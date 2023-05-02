package introduction;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sandhya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		String[] itemsNeeded= {"Cucumber","Brocoli"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		for (int i=0;i<products.size();i++) {
			String [] name = products.get(i).getText().split("-");
			String formatedName=name[0].trim();
			List itemsNeededList= Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(name))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			}
		}

	}
}