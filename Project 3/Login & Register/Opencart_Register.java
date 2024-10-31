import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opencart_Register {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//First name user input
		System.out.println("Enter First name:");
		Scanner first = new Scanner(System.in);
		String firstname = first.nextLine();
		//Last name user input
		System.out.println("Enter Last name:");
		Scanner last = new Scanner(System.in);
		String lastname = last.nextLine();
		// Email User input
		System.out.println("Enter Email address:");
		Scanner email = new Scanner(System.in);
		String emailinput = email.nextLine();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://awesomeqa.com/ui/");
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[href='https://awesomeqa.com/ui/index.php?route=account/register']")).click();
		
		driver.findElement(By.id("input-firstname")).sendKeys(firstname);
		
		driver.findElement(By.id("input-lastname")).sendKeys(lastname);
		
		driver.findElement(By.id("input-email")).sendKeys(emailinput);
		
		
		driver.findElement(By.id("input-telephone")).sendKeys("shifakhan.nrn@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("ete@8nYBweNvfQ5");
		driver.findElement(By.id("input-confirm")).sendKeys("ete@8nYBweNvfQ5");
		driver.findElement(By.xpath("//label[normalize-space()='No']")).click();
		driver.findElement(By.cssSelector("input[value='1'][name='agree']")).click();
		driver.findElement(By.cssSelector("input[value='Continue']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[id='content'] h1")).getText());

	}

}
