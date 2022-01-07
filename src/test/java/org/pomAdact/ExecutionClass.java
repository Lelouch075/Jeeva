package org.pomAdact;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExecutionClass extends BaseClass{
	@BeforeClass
	public static void beforeClass() {
		getDriver();
		impWait(30, TimeUnit.SECONDS);
		getUrl("https://adactinhotelapp.com/index.php");
		maximize();
		}
	
	@Test
	public void booking() throws IOException {
		LoginPage l=new LoginPage();
		String data1 = l.getData1("Input", 1, 0);
		String data12 = l.getData1("Input", 1, 1);
		l.login(data1, data12);
		
		SearchHotel s=new SearchHotel();
		s.getData1("Input", 1, 10);
		s.getData1("Input", 1, 11);
		s.getData1("Input", 1, 12);
		
		
		s.searchHotels(s.getData1("Input", 1, 10),s.getData1("Input", 1, 11),
				s.getData1("Input", 1, 12),1,1,1);
		
		SelectHotel s1=new SelectHotel();
		s1.selectHotel();
		
		BookHotel b=new BookHotel();
		b.book(b.getData1("Input", 1, 4), b.getData1("Input", 1, 5), b.getData1("Input", 1, 6), b.getData1("Input", 1, 7), b.getData1("Input", 1, 13), b.getData1("Input", 1, 14), b.getData1("Input", 1, 15), b.getData1("Input", 1, 8));
		
		BookingConform bc=new BookingConform();
		bc.BookingConfirm("Input", 1, 9);
		//System.out.println(orderId);
	
		
		BookedItenary i=new BookedItenary();

		i.bookedItenary(getData1("Input", 1, 9));
		String txtCancel1 = i.getTxtCancel1();
		System.out.println(txtCancel1);
		
	}
	

}