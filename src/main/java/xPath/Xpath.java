package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		//driver.findElement(By.xpath("//div[contains(text(),normalize-space'Log in to Facebook ')]"));
		
		//driver.findElement(By.xpath("//input[@id='email'or@name='email']"));
		//driver.findElement(By.xpath("//input[@id='email'And@name='email']"));
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("ashwini");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("9028102003");
		driver.findElement(By.xpath("//button[(text()='Log in')]")).click();
		
	}

}
