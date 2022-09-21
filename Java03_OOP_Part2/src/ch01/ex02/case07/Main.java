package ch01.ex02.case07;

public class Main {

	public static void main(String[] args) {
		
		Cat cat = new Cat("시베리안고양이 ",3); //객체생성 
		
		System.out.printf("%s %d",cat.getAnimalName(),cat.getAge());
	}

}
