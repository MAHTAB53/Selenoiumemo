import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//https://demo.guru99.com/test/newtours/
		driver.get("https://saucedemo.com/");//this will open your working site
		driver.findElement(By.id("user-name")).sendKeys("standard_user");//pick field of uname
		driver.findElement(By.id("password")).sendKeys("secret_sauce");//pick field of password
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();//pick field of uname
		driver.close();
	}

}
