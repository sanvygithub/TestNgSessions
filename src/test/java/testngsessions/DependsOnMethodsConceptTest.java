package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConceptTest {
	
	//CRUD
	//create a new user , assert -- T1
	//create a new user , get the same user , assert --T2
	//create a new user , get the same user, update the same user with phone, assert -- T3
	//create a new user , get the same user()123,456789,909), delete the same user, assert --- T4
	
	//uid = 909
	
	//AAA - Arrange, Act, Assert
	//test cases should be independent
	//it should not maintain any order
	//can be executed in any order
	
	//Assert: only one assertion should be there in a test case
	//we can avoid giving priority as well for the test cases


	@Test
	public void searchTest() {
		System.out.println("searchTest");
		int a = 9 / 0;
		System.out.println(a);
	}

	@Test(dependsOnMethods = "searchTest")
	public void addToCartTest() {
		System.out.println("addToCartTest");
		int a = 9 / 3;
		System.out.println(a);
	}

	@Test(dependsOnMethods = "addToCartTest")
	public void paymentTest() {
		System.out.println("paymentTest");

	}

}
