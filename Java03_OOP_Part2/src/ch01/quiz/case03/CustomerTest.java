package ch01.quiz.case03;

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
		
		System.out.println();
		
		//구매 후 (보너스 포인트도 적립, 가격 할인률도 적용 ) 
		int priceLee = cLee.calcPrice(10000); //일반 사용자 
		int priceSeo = jSeo.calcPrice(10000);
		
		System.out.println(cLee.showCustomerInfo() + "그리고 지불 금액은 : "+priceLee);
		System.out.println(jSeo.showCustomerInfo() + "그리고 지불 금액은 : "+priceSeo);
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		//형변환(하위 -> 상위_업캐스팅)
		Customer vc = new VIPCustomer(1234, "정구리"); //이렇게 된다면 어떻게 될?
		vc.bonusPoint = 10000;
		int priceNo = vc.calcPrice(10000); //vc하면 customer 타임만 보이나 calcPrice() 는 오버라이딩 도ㅓㅣㄴ게 우선하여 호출된다  
		System.out.println(vc.showCustomerInfo() + "그리고 지불 금액은 : "+priceNo); // 원래는 가격을깎아주는 logic 이 없었지만 
		//vc. //검색되는거 보면 Customer(부모) 꺼만 쓸 수 있는거 확인 
		
	}

}
