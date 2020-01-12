package Selenium_Stuff.Selenium_4_Stuffs;

import java.util.HashMap;

import org.testng.annotations.Test;

public class DataProvider {
	
		@org.testng.annotations.DataProvider
		public Object[][] test()
		{
       
			
			Object[][] obj = new Object[3][2];
			
			
			obj[0][0] = "First";
			obj[0][1] = "Second";
			obj[1][0] = "Third";
			obj[1][1] = "Forth";
			obj[2][0] = "Fifth";
			obj[2][1] = "Sixth";
			

	return obj;		
			
			
		}
	
	
		@Test(dataProvider= "test")
	
		public void method(String str, String str2) {
	
			
			HashMap map = new HashMap();
			map.put(str, str2);
			
			System.out.println(map);
          
			
			
			
			
		}
		
		
		
		
		
	}

