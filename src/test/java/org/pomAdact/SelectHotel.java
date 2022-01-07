package org.pomAdact;

import org.junit.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement radioBtn;
	@FindBy(id = "continue")
	private WebElement btnContinue;

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public void selectHotel() {
		click(getRadioBtn());
		click(getBtnContinue());

	}

}