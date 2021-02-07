package sellenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	public static WebDriver driver;
	public static final String URL= "https://www.youtube.com/";
	public static final String SEARCH_FIELD = "//*[@id=\"search\"]";
	public static final String BTN_XPATH = "//*[@id=\"search-icon-legacy\"]";
	
	
	public static void unesiIzvodjaca(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(SEARCH_FIELD));
		we.click();
		we.sendKeys("Rick Astley - Never Gonna Give You Up (Video)");
	}
	public static void pressBtn(WebDriver driver) {
		driver.findElement(By.xpath(BTN_XPATH)).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

