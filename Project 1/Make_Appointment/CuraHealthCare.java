import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CuraHealthCare {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.findElement(By.id("btn-make-appointment")).click();
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		Thread.sleep(2000);
		//driver.findElement(By.id("txt-password")).sendKeys("ThisisNotAPassword");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		Thread.sleep(2000);
		driver.findElement(By.id("btn-login")).click();
		
//		// When we will put wrong credentials and want to print the text that will appear
		//System.out.println(driver.findElement(By.cssSelector("p.text-danger")).getText());
		
		// For Dropdown Menu, we will use select because in web the tag name is select
		WebElement ddown = driver.findElement(By.id("combo_facility"));
		Select select = new Select(ddown);
		select.selectByIndex(1);
		Thread.sleep(2000);
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.id("chk_hospotal_readmission")).click();
		driver.findElement(By.id("radio_program_medicaid")).click();
		driver.findElement(By.xpath("//div[@class='input-group-addon']")).click();
		driver.findElement(By.xpath("//td[normalize-space()='16']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='txt_comment']")).click();
		driver.findElement(By.xpath("//textarea[@id='txt_comment']")).sendKeys("I need an appointment on the selected date. If you have any earlier date, please notify me. Thank you.");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='btn-book-appointment']")).click();
		System.out.println(driver.findElement(By.xpath("//h2[normalize-space()='Appointment Confirmation']")).getText());
		driver.findElement(By.xpath("//a[normalize-space()='Go to Homepage']")).click();
		
	}

}
