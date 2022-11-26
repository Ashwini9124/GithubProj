package mavenPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		//copy x path
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("ashwini");
		
		//copy full x path
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("ashwini");
		
		//driver.findElement(By.id("email"));
		
		//driver.findElement(By.xpath("//input[@name=\"email\"]")).clear();
		
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("9028102003");
		
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
		//Thread.sleep(3000);
	
		//driver.close();
	}

}
