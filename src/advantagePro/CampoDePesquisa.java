package advantagePro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CampoDePesquisa {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		 driver = new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    
		    driver.get("https://www.advantageonlineshopping.com/#/");
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    driver.findElement(By.id("menuSearch")).click();
		    driver.findElement(By.id("autoComplete")).sendKeys("mice");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("/html/body/header/nav/ul/li[4]/a/div/div[2]/div/div[2]/a[3]/img")).click();
//		    driver.findElement(By.name("emailRegisterPage")).sendKeys("grehaime.silva@rsinet.com.br");

}
}

