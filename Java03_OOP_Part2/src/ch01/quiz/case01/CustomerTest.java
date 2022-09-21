package ch01.quiz.case01;

public class CustomerTest {

	public static void main(String[] args) {

		Customer cLee = new Customer();
		cLee.setCustomerName("정구리");
		cLee.setCustomerID(1001);
		cLee.bonusPoint= 1000;
		
		System.out.println(cLee.showCustomerInfo());
		
		VIPCustomer jSeo = new VIPCustomer() ;
		jSeo.setCustomerName("정구");
		jSeo.setCustomerID(1002);
		
		jSeo.bonusPoint=2000;
		System.out.println(jSeo.showCustomerInfo());
	}

}
