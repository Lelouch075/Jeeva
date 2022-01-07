package org.pomAdact;

import org.junit.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BookHotel extends BaseClass{
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement txtFirst;
	@FindBy(id="last_name")
	private WebElement txtLast;
	@FindBy(id="address")
	private WebElement txtAdrs;
	@FindBy(id="cc_num")
	private WebElement creditNo;

	@FindBy(id="cc_type")
	private WebElement cardType;
	@FindBy(id="cc_exp_month")
	private WebElement expDate;
	@FindBy(id="cc_exp_year")
	private WebElement expYr;
    @FindBy(id="cc_cvv")
	private WebElement ccv;
	@FindBy(id="book_now")
	private WebElement bookbtn;
	public WebElement getTxtFirst() {
		return txtFirst;
	}
	public WebElement getTxtLast() {
		return txtLast;
	}
	public WebElement getTxtAdrs() {
		return txtAdrs;
	}
	public WebElement getCreditNo() {
		return creditNo;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public WebElement getExpDate() {
		return expDate;
	}
	public WebElement getExpYr() {
		return expYr;
	}
	public WebElement getCcv() {
		return ccv;
	}
	public WebElement getBookbtn() {
		return bookbtn;
	}
	
	public void book(String firstName,String lastName,String address,String creditNo,String cardType,String expDate,String expYr,String cvv) {
		type(getTxtFirst(),firstName );
		type(getTxtLast(), lastName);
		type(getTxtAdrs(), address);
		type(getCreditNo(), creditNo);
		selectOptionByText(getCardType(), cardType);
		selectOptionByText(getExpDate(), expDate);
		selectOptionByText(getExpYr(), expYr);
		type(getCcv(), cvv);
		click(getBookbtn());
		
		
		
	}
	
	
	
	
	
	
	
	
}