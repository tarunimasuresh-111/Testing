package sample.testing;

import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import sample.testing.DayNine1;

public class DayNine1 {
	DayNine2 cl = new DayNine2();
  @Test(dataProvider = "testData")
  
  public void addMethod(int a,int b,int expected) {
		int result=cl.add(a,b);
		AssertJUnit.assertEquals(expected, result);
	}
	
	@DataProvider
	public Object[][] testData() {
		return new Object[][] {
			{1,2,3},{2,2,5}			
			};
	}
			
    @Test(dataProvider = "testData1")	  
	 public void subMethod(int a,int b,int expected) {
   	 int result=cl.sub(a,b);
	 AssertJUnit.assertEquals(expected, result);
				}
				
	 @DataProvider
	 public Object[][] testData1() {
	 return new Object[][] {
	 {2,1,1},{2,2,5}			
	 };
	}
	 @Test(dataProvider = "testData2")	  
	 public void multiplyMethod(int a,int b,int expected) {
   	 int result=cl.multiply(a,b);
	 AssertJUnit.assertEquals(expected, result);
				}
				
	 @DataProvider
	 public Object[][] testData2() {
	 return new Object[][] {
	 {1,2,2},{2,2,5}			
	 };
	}
	 @Test(dataProvider = "testData3")	  
	 public void divideMethod(int a,int b,int expected) {
   	 int result=cl.divide(a,b);
	 AssertJUnit.assertEquals(expected, result);
				}
				
	 @DataProvider
	 public Object[][] testData3() {
	 return new Object[][] {
	 {4,2,2},{2,2,5}			
	 };
	}

  }
