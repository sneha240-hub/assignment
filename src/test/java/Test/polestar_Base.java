package Test;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import pages.homePage;
import pages.menuPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import org.testng.annotations.AfterClass;

public class polestar_Base {
	
	Playwright playwright;
	Page page;
	Browser browser;
	homePage homeObj;
	menuPage mp;
	
  @Parameters("browser")
  
  @BeforeClass
  
  public void beforeClass(@Optional("chrome")String br) throws InterruptedException {
	 playwright = Playwright.create();
	  switch (br) {
	  case "chrome":
		   browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		   page = browser.newPage();
		   System.out.println(browser);
		   Thread.sleep(3000);
		   break;
	  case "firefox":
		  browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		  page = browser.newPage();
		  System.out.println(browser);
		  Thread.sleep(3000);
		  break;
	  
	  default:
		System.out.println("default");
		break;
		
	}
	  homeObj = new homePage(page);
	  mp = new menuPage(page);
	  
	  
  }
  
  @Test(priority = 0)
  public void openWeb() throws InterruptedException {
	  
		 System.out.println("Opening web");
		  page.navigate("https://www.polestar.com/se/developer/get-started");
		  
//		  Assert.assertEquals(page.title(), "Pure progressive performance | Polestar");
		  Thread.sleep(3000);
		  System.out.println("****Opened web****");
		  
		  homeObj.acceptClick();
		  Thread.sleep(1000);
		   
	  }
  
  @Test(priority = 1)
  public void click() throws InterruptedException{
	  
	  
	  mp.returnHome_click();
	  
  }
  
  
  @AfterClass
  public void afterClass() {
	  
	  page.close();
	  browser.close();
	  playwright.close();
	  
	  
	  
  }

}
