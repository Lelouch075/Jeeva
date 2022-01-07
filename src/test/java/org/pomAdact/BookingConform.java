package org.pomAdact;

import java.io.IOException;

import org.junit.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BookingConform extends BaseClass{
	String orderId;
	public BookingConform() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement getvalue;
	
	public WebElement getValue() {
		return getvalue;
	}
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement itinerary;

	public WebElement getItinerary() {
		return itinerary;
	}
	
	
	
	public void BookingConfirm(String sheetName,int rowNo,int cellNo) throws IOException {
		
		orderId = getAttributeValue(getvalue, "value");
		String orderId = getAttributeValue(getValue(), "value");
		
		updateData1(sheetName, rowNo, cellNo, orderId);
		
		System.out.println(orderId);
		click(getItinerary());
		
	}
	
	

}