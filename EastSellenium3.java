package testSelenium3;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.TestNGException;
import sellenium3.Home;
import sellenium3.PustiPesmu;
import sellenium3.SideBar;


public class EastSellenium3 {
	 WebDriver driver;
	
	@BeforeClass
	public void postaviDriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\driverHrome\\chromedriver.exe");
	driver = new ChromeDriver();
//	WebDriverWait wait = new WebDriverWait(driver,10);
	}
	@Test(priority = 1)
	public void testGlavneStrane() {
		driver.navigate().to(Home.URL);
		Home.unesiIzvodjaca(driver);
		Home.pressBtn(driver);
		String actual = driver.getCurrentUrl();
		String expected = PustiPesmu.URL_IZVODJACA;
		
		Assert.assertEquals(actual, expected);
}
	@Test (priority = 2)
	public void testPustiPesmu() {
		driver.navigate().to(PustiPesmu.URL_IZVODJACA);
		PustiPesmu.pustiPesmu(driver);
		
		String actual = driver.getCurrentUrl();
		String expected = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
		
		Assert.assertEquals(actual, expected);
	}
	@Test(priority = 3)
	public void testSideBarr() {
		//driver.navigate().to(PustiPesmu.PESMA_XPATH);
		SideBar.sideBar(driver);
		
		String actual = driver.getCurrentUrl();
		String expected = "https://www.youtube.com/watch?v=dQw4w9WgXcQ&list=RDdQw4w9WgXcQ&start_radio=1&t=4";
		
		Assert.assertEquals(actual, expected);
	}
}
