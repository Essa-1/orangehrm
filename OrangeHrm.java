package TestNg;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*open url
 * test the logo is present or not
 * login
 * close
 */

public class OrangeHrm {
	private static final CharSequence Admin = null;
	WebDriver driver;
	@Test(priority=1)
	void oprnurl() {
	 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@Test(priority=2)
	void testlogo() throws InterruptedException {
		Thread.sleep(3000);
		Boolean Status =driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		System.out.println("logo display...."+Status);
	}
	@Test(priority=3)
	void login() {
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test(priority=4)
	void close() {
		driver.quit();
		
	}

}
