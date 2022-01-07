package org.pomAdact;

import org.junit.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchHotel extends BaseClass {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement ddLocation;
	@FindBy(id="hotels")
	private WebElement ddhotels;
	
	@FindBy(id="room_nos")
	private WebElement ddroomnos;
	@FindBy(id="adult_room")
	private WebElement ddadult;
	@FindBy(id="child_room")
	private WebElement ddchild;

	@FindBy(id="room_type")
	private WebElement ddroomtype;
	@FindBy(id="Submit")
	private WebElement btnSearch;
	public WebElement getDdLocation() {
		return ddLocation;
	}
	public WebElement getDdhotels() {
		return ddhotels;
	}
	public WebElement getDdroomtype() {
		return ddroomtype;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	public WebElement getDdroomnos() {
		return ddroomnos;
	}
	public WebElement getDdadult() {
		return ddadult;
	}
	public WebElement getDdchild() {
		return ddchild;
	}
	public void searchHotels(String location,String hotels,String room_type,int roomno,int adult,int child) {
//		selectOptionByText(getDdroomnos(), roomno);
//		selectOptionByText(getDdadult(), adult);
//		selectOptionByText(getDdchild(), child);
		selectOptionByText(getDdLocation(), location);
		selectOptionByText(getDdhotels(), hotels);
		selectOptionByText(getDdroomtype(), room_type);
		selectOptionByIndex(getDdroomnos(), roomno);
		selectOptionByIndex(getDdadult(), adult);
		selectOptionByIndex(getDdchild(), child);
		click(getBtnSearch());
		
	}

	
	
	
}
