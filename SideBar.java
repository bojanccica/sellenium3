package sellenium3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SideBar {
	public static WebDriver driver;
	
	public static void sideBar(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://www.youtube.com/watch?v=dQw4w9WgXcQ&list=RDdQw4w9WgXcQ&start_radio=1&t=4");
		//WebElement we = driver.findElement(By.xpath("//*[@id=\"video-title\"]"));
		//we.click();
	}

}
