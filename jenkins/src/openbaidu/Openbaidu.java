package openbaidu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Openbaidu {
	@Test
	public void dL() {
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.baidu.com/");
		driver.findElement(By.id("kw")).sendKeys("ох╥Ф");
		driver.findElement(By.id("su")).click();
	}
}
