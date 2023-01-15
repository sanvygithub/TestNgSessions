package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	String name;
	
	@Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class},description="ExpectedExceptionsTest")
	public void calTest() {
		System.out.println("calTest");
		int a=9/0;
		System.out.println(a);
		ExpectedExceptionConcept obj=null;
		obj.name="abc";
		
	}

}
