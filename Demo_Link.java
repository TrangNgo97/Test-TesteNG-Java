import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class Demo_Link{
	public WebDriver driver;
	public Demo_Link() {
		this.driver = driver;
	}
	Setup_Link ln = new Setup_Link(driver);
	@Test
	public void start1() throws InterruptedException {
		ln.loadPage();
		ln.selectProduct();
		ln.oderDetailNoVoucher();
		
	}
	/*@Test
	public void start2() throws InterruptedException {
		ln.loadPage();
		ln.selectProduct();
		ln.oderDetailVoucher();
		
	}*/
	}
	
