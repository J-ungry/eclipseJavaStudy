package ch01.ex02.case01;

public class Time {

	//멤버 변수 
	int hour;
	int minute;
	int second;
	
	//method
	@Override
	public String toString() { //object 클래스는 자동상속돼 있기 때문에 override 굳이 안써도됨
		return String.format("%d시 %d분 %d초\n", hour,minute,second); //format 쓰지 않아도되지만 왜 쓰냐면 timetest에 적을게 
		
	}
}
