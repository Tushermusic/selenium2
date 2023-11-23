package selenium_assignment2;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class main {
	public static  void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		
		
		//First Name
		driver.findElement(By.id("fname")).sendKeys("Tusher");
		
		//last Name
		driver.findElement(By.id("lname")).sendKeys("Paul");
		
		//Gender  
		WebElement radiobutton = driver.findElement(By.id("male")); 
		radiobutton.click();
		
		//Drop down 
		WebElement testDropDown = driver.findElement(By.id("option"));
		Select dropDown = new Select(testDropDown);
		dropDown.selectByValue("option 3");
		
		//checklist
		WebElement checklist = driver.findElement(By.name("option3"));
		checklist.click();
		
		//submit  button
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		
	}
}
