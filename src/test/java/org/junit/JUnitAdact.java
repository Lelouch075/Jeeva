package org.junit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JUnitAdact extends BaseClass {
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		getDriver();
		maximize();
		impWait(30, TimeUnit.SECONDS);
		getUrl("https://adactinhotelapp.com/index.php");
		
	}
	@Before
	public void timeStart() {
		long start = System.currentTimeMillis();
		System.out.println(start);
		
		
	}
	
	@After
	public void timeEnd() {
		long end = System.currentTimeMillis();
		System.out.println(end);
		
		
	}
	
	@Test
	public void orderId() throws IOException {
WebElement txtuser =  findElementById("username");
		
		String txt =  getData("C:\\Users\\Jeeva\\eclipse-workspace\\MavenBase\\Excel1\\adact.xlsx", "Input", 1, 0);
		//System.out.println(data);
		
		 type(txtuser,txt );
		
		WebElement txtpass =  findElementById("password");
		
		String pass =  getData("C:\\Users\\Jeeva\\eclipse-workspace\\MavenBase\\Excel1\\adact.xlsx", "Input", 1, 1);
		
		 type(txtpass, pass);
		
		WebElement btnLogin =  findElementById("login");
		
		
		 click(btnLogin);
		
		WebElement txtSearch =  findElementByXpath("//td[text()='Search Hotel ']");
		String textSear = getText(txtSearch);
		System.out.println(textSear);
		//boolean b = searchHotel.contains("Search");
		Assert.assertEquals("Verify Search Hotels", "Search Hotel (Fields marked with Red asterix (*) are mandatory)", textSear );
		
	
		
		WebElement location =  findElementById("location");
		 selectOptionByIndex(location, 1);
		
		
		WebElement dDnhotel =  findElementById("hotels");
		 selectOptionByIndex(dDnhotel, 1);
		
	
		
		
		WebElement dDnroom =  findElementById("room_type");
		
		 selectOptionByIndex(dDnroom, 1);
		
		WebElement dDnroomNos =  findElementById("room_nos");
		
		 selectOptionByIndex(dDnroomNos, 1);
		
//		WebElement dateIn =  findElementById("datepick_in");
//		String datein =  getData("C:\\Users\\Jeeva\\eclipse-workspace\\MavenBase\\Excel1\\adact.xlsx", "Input", 1,2 );
//		
//		 setAttribute(dateIn, datein);
//		
//		
//		WebElement dateOut =  findElementById("datepick_out");
//		String dataout =  getData("C:\\Users\\Jeeva\\eclipse-workspace\\MavenBase\\Excel1\\adact.xlsx", "Input", 1, 3);
//		 setAttribute(dateOut, dataout );
		
		
		WebElement people =  findElementById("adult_room");
		
		 selectOptionByIndex(people, 2);
		
		
		WebElement child =  findElementById("child_room");
		
		 selectOptionByIndex(child, 2);

		
		
		WebElement btnSubmit =  findElementById("Submit");
		
		 click(btnSubmit);
		
		WebElement txtSelect =  findElementByXpath("//td[text()='Select Hotel ']");
		String text2 = getText(txtSelect);
		System.out.println(text2);
		Assert.assertEquals("Verify Select Hotel","Select Hotel", text2);
		
		//boolean b = searchHotel.contains("Search");
	
		
		
		//td[text()='Select Hotel ']
			
		WebElement radbtn =  findElementById("radiobutton_0");
		
		 click(radbtn);
		
		
		WebElement btncnt =  findElementById("continue");
		 click(btncnt);
		
		WebElement txtBook =  findElementByXpath("//td[text()='Book A Hotel ']");
		String text3 = getText(txtBook);
		System.out.println(text3);
		boolean b = text3.contains("A");
		Assert.assertTrue("Verify Book Hotel ", b);
		
		
		//td[text()='Book A Hotel ']
		
		WebElement txtfirst =  findElementById("first_name");
		String data =  getData("C:\\Users\\Jeeva\\eclipse-workspace\\MavenBase\\Excel1\\adact.xlsx", "Input", 1, 4);
		 type(txtfirst, data);
		
		
	    WebElement txtlast =  findElementById("last_name");
		
	    String data2 =  getData("C:\\Users\\Jeeva\\eclipse-workspace\\MavenBase\\Excel1\\adact.xlsx", "Input", 1, 5);
		
		
		
		 type(txtlast, data2);
		
		WebElement txtaddress =  findElementById("address");
		
		String data3 =  getData("C:\\Users\\Jeeva\\eclipse-workspace\\MavenBase\\Excel1\\adact.xlsx", "Input", 1, 6);
		
		
		 type(txtaddress, data3);
		
		WebElement txtCC =  findElementById("cc_num");
		
		String data4 =  getData("C:\\Users\\Jeeva\\eclipse-workspace\\MavenBase\\Excel1\\adact.xlsx", "Input", 1, 7);
		
		 type(txtCC, data4);
		
		WebElement dDnccty =  findElementById("cc_type");
		 selectOptionByIndex(dDnccty, 1);
		
		WebElement dDnccmon =  findElementById("cc_exp_month");
		 selectOptionByIndex(dDnccmon, 7);
		
		WebElement dDnccyr =  findElementById("cc_exp_year");
		 selectOptionByIndex(dDnccyr, 7);
		
		WebElement txtcvv =  findElementById("cc_cvv");
		
		String data5 =  getData("C:\\Users\\Jeeva\\eclipse-workspace\\MavenBase\\Excel1\\adact.xlsx", "Input", 1, 8);
		
		 type(txtcvv, data5);
		
		WebElement btnbook =  findElementById("book_now");
		 click(btnbook);
		
		
		WebElement txtConf =  findElementByXpath("//td[text()='Booking Confirmation ']");
		String text4 = getText(txtConf);
		System.out.println(text4);
		boolean b1 = text4.contains("Co");
		Assert.assertTrue("Verify Booking Confirmation", b1);
		
		//td[text()='Booking Confirmation ']
		
		//Thread.sleep(9000);
		
		
		WebElement txtorder =  findElementById("order_no");
		
		String orderId =  getAttributeValue(txtorder,"value");
		
		System.out.println(orderId);
		
		// updateData("C:\\Users\\Jeeva\\eclipse-workspace\\MavenBase\\Excel1\\adact.xlsx", "Input", 1, 9, orderId);
		
//		WebElement txtItinera =  findElementByXpath("//td[text()='Booked Itinerary']");
//		String a = txtItinera.getText();
		//System.out.println(searchHotel);
		//boolean b = searchHotel.contains("Search");
		//Assert.assertTrue("Verify S", true);
		WebElement btnBooked  =  findElementByXpath("//a[text()='Booked Itinerary']");
		 click(btnBooked);
		
		
		Assert.assertTrue("Verify Booking ", true);
		
	WebElement txtSearch1 =  findElementById("order_id_text");
	
	 type(txtSearch1, orderId);
	
	WebElement btnGo =  findElementById("search_hotel_id");
	 click(btnGo);
		
//	WebElement radBtn  =  findElementByName("ids[]");
	WebElement radBtn =  findElementByXpath("//input[@type='button']");
	 click(radBtn);
	
//	WebElement btnCancel =  findElementByName("cancelall");
//	 click(btnCancel);
	
	 alertOk();
	
	WebElement txtFinal =  findElementById("search_result_error");
	String text =  getText(txtFinal);
	
	System.out.println(text);
	
	
		//order_id_text
		
		//search_hotel_id
		
	}
	

}
