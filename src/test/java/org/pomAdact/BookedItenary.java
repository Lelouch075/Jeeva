package org.pomAdact;

import org.junit.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItenary extends BaseClass {
	public  BookedItenary() {
		PageFactory.initElements(driver, this);
		
	}
		
	@FindBy (id="order_id_text")
	private WebElement txtsearch;
	@FindBy (id="search_hotel_id")
	private WebElement btnGo;
	@FindBy (xpath="//input[@type='button']")
	private WebElement btnCancel;
	
	@FindBy (id="search_result_error")
	private WebElement txtCancel;
	
	public WebElement getTxtCancel() {
		return txtCancel;
	}
	public WebElement getTxtsearch() {
		return txtsearch;
	}
	public WebElement getBtnGo() {
		return btnGo;
	}
	
	public WebElement getBtnCancel() {
		return btnCancel;
	}
	
	public String getTxtCancel1() {
		String textCan = getText(getTxtCancel());
		return textCan;
	}
	
	public void bookedItenary(String attrivalue) {
		type(getTxtsearch(),attrivalue );
		click(getBtnGo());
		click(getBtnCancel());
		alertOk();
		//getText(getTxtCancel());
		
	}
	
	
	
	
//	public void setTxtsearch(WebElement txtsearch) {
//		this.txtsearch = txtsearch;
//	}
//	
	
	
	
	
}
