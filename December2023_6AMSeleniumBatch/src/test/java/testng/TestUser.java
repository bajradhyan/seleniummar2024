package testng;

import org.testng.annotations.Test;

import dataProviders.TestDataprovider;

public class TestUser 
{
	
  @Test(dataProviderClass = TestDataprovider.class, dataProvider = "getData")
  public void createUser(String browser,String userType,int password, String email) 
  {
	  System.out.println(browser+"----"+userType+"----"+password+"----"+email);
  }
  
  @Test(dataProviderClass = TestDataprovider.class, dataProvider = "getData")
  public void deleteUser(String browser,String userType,int password, String email)
  {
	  System.out.println(browser+"----"+userType+"----"+password+"----"+email);
  }
  
}
