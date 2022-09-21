package ch01.ex01.case04;

public class StrudentMain {

	public static void main(String[] args) {

		
		Student s = new Student();
		
		s.name ="김유리";
		s.kor = 100;
		s.eng = 90;
		s.math = 90;
		
		s.sum = s.kor + s.eng + s.math;
		s.avg = s.sum / 3.0;
		
		System.out.println("이름 : "+s.name);
		System.out.println("총점 : "+s.sum);
		System.out.println("평균 : "+s.avg);
	}

}
