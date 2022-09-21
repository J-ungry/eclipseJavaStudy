package ch01.quiz.case02;

public class CustomerTest {

	public static void main(String[] args) {

		Customer cLee = new Customer(1001,"정구");
//		cLee.setCustomerName("정구리");
//		cLee.setCustomerID(1001);
		cLee.bonusPoint= 1000;
		
		System.out.println(cLee.showCustomerInfo());
		
		VIPCustomer jSeo = new VIPCustomer(1002,"구리") ;
//		jSeo.setCustomerName("정구");
//		jSeo.setCustomerID(1002);
		
		jSeo.bonusPoint=2000;
		System.out.println(jSeo.showCustomerInfo());
		
		//형변환(하위 -> 상위_업캐스팅)
		Customer vc = new VIPCustomer(1234, "정구리"); //이렇게 된다면 어떻게 될?
		//vc. //검색되는거 보면 Customer(부모) 꺼만 쓸 수 있는거 확인 
		
	}

}
