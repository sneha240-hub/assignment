package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class menuPage {
	Page page;
	public Locator menu;
	public Locator learnmore;
	
//Constructor creation
	public menuPage(Page page) {
		this.page = page;
		menu = page.getByText("Return Home");
		learnmore=page.locator("(//a[@href='/global/polestar-4/'])[2]");
		
	}
	
	public void returnHome_click() throws InterruptedException {
		
		menu.click();
		Thread.sleep(2000);
		learnmore.scrollIntoViewIfNeeded();
		
		learnmore.click();
		Thread.sleep(3000);
	}
	
	
	
	

}
