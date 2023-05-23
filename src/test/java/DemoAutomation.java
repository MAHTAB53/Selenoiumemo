import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe"); //setting the path of chromedriver
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver(); //enabling chrome browser driver
		driver.get("http://www.google.com");
	}

}
//but for this you have to add a webdriver dependancy in pom file.