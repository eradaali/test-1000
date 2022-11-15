package authenticion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class singup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\mynewdriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

//		driver.get("https://www.google.com");
		driver.get("http://127.0.0.1:5500/login.html");
//       driver.navigate().back();

		driver.findElement(By.id("email-input")).sendKeys("erada.abdalrhman@gmail.com");
		driver.findElement(By.id("password-input")).sendKeys("123456789");
		driver.findElement(By.id("birth-input")).sendKeys("16051998");
		driver.findElement(By.id("mobile-input")).sendKeys("962795881257");
//		System.out.println(driver.findElement(By.id("label-one")).getText().toUpperCase()); //to print the word by get test
driver.findElement(By.tagName("button")).click();
	}

}
