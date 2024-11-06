import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opencart_login {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://awesomeqa.com/ui/");
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys("mdkeramel@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("abcdef");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
	}

}
