package ch01.quiz.case05;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> cList = new ArrayList<Customer>(); // 배열 만들어버리기
		
		Customer cLee = new Customer(1001,"정구");
		Customer jSeo = new VIPCustomer(1002,"구리",1234) ;
		Customer cKim = new GoldCustomer(1003,"정구리"); //오버라이딩 한게 있으면 차이가 생겨난다 자동으로 각각의 특성들을 불러낼 수 있음 
		
		cList.add(cLee);
		cList.add(cKim);
		cList.add(jSeo);
		
//		System.out.println("===== 고객 정보 출력 =====");
//		for(Customer c :cList) {
//			System.out.println(c.showCustomerInfo());
//		}
//		
//		System.out.println();
//		
//		System.out.println("===== 할인율과 보너스 포인트 계산 =====");
//		
//		int price = 10000;
//		for(Customer c : cList) {
//			int cost = c.calcPrice(price);
//			System.out.println(c.getCustomerName()+"님이 "+cost+" 원 지불슨 "+ c.bonusPoint +" 보너스 포인트 ");
//		}
		
		//downcasting 강제 타입 변환 
		VIPCustomer vs = (VIPCustomer)jSeo; //강제 형변환  컴파일러가 찾아내진 못했지만 실행시 에러 발생 타입 변환 불가능 
		
		if(jSeo instanceof VIPCustomer) {
			VIPCustomer cs = (VIPCustomer) jSeo;
		}
		
		if(jSeo instanceof GoldCustomer) {
			GoldCustomer gc = (GoldCustomer) jSeo; //다운캐스팅 에러가 발생하지않는다 
			System.out.println(jSeo.showCustomerInfo());
		}
	}

}
