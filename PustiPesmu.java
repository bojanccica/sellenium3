package sellenium3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PustiPesmu {
	public static WebDriver driver;
	public static final String URL_IZVODJACA = "https://www.youtube.com/results?search_query=Rick+Astley+-+Never+Gonna+Give+You+Up+(Video)";
	public static final String PESMA_XPATH = "//*[@id=\"video-title\"]/yt-formatted-string";
	
	public static void pustiPesmu(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath(PESMA_XPATH)).click();
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
