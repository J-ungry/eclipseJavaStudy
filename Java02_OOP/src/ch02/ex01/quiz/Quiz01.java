package ch02.ex01.quiz;

public class Quiz01 {

	int a,b,c,d;
	
	public Quiz01() {
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	public Quiz01(int a) {
		this();  //이거 하면 default 에 있는게 그대로들어오는거랑 똑같은거임 !!!!!
		this.a = a; //그리고 여기서 값 변경을 하는것 !!!
//		b = 20;
//		c = 30;
//		d = 40;
	}
	
	public Quiz01(int a,int b) {
		this();
		this.a = a;
		this.b = b;
//		this.c = 30;
//		this.d = 40;
	}
}
