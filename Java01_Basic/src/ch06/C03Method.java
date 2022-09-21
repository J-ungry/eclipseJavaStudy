package ch06;

//한 파일 안에도 동시에 작성할 수 있음 근데 파일명이랑 클래스명이랑 일치해야해 
//파일명이랑 일치하는 애들은 public 나머지는 Public 이 될 수 없음 !
class Method{ 
	
	void print(String msg) { //6
		System.out.println(msg);
	}
	
	int add(int x, int y) { //3
		return x + y;
	}
	
	double avg(int x , int y) {
		int sum = add(x,y);	//2
		double result = sum / 2.0;	//4
		return result;
	}
	
	void processs() {
		double result = avg(100,20); //1
		print("계산 결과 : "+result); //5
	}
}

public class C03Method {
	public static void main(String[] args) {
		
		Method t = new Method();
		
		t.processs();
	}

}
