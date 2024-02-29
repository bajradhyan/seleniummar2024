package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paymentmanagement 
{
	
  @Test
  public void applyDicount() 
  {
	  
  }
  
  @Test
  @Parameters("action")
  public void makePayment(String parameterType,ITestContext context) 
  {
	  if(parameterType.equals("pay@online"))
		  System.out.println("Make a payment @Online");
	  else
		  System.out.println("Make a payment @Hotel");
	  //Booking ID
	  String bookingID = "RRR1234"; 
	  System.out.println(bookingID);
	  context.setAttribute("bID", bookingID);
  }
  
}
