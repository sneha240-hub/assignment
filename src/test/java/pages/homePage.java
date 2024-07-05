package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class homePage {
	Page page;
	public Locator accept_prompt;
	public Locator reject_prompt;
	
	
//	constructor creation
	public homePage(Page page) {
		this.page = page;
		accept_prompt=page.locator("#onetrust-accept-btn-handler");
		
	}
	
	public void acceptClick() throws InterruptedException{
		
		Thread.sleep(2000);
		accept_prompt.click();
		
	}

}
