package ch03.ex02.case01;

public class Company {

	private static Company instance = new Company();
	
	private Company() {}
	
	public static Company getInstance() {
		if(instance==null) { //별 의미 없음 
			instance = new Company();
		}
		return instance;
	}
}
