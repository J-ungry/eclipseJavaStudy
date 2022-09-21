package ch01.ex03.case01;

public class Teset {
	
	public void moveAnimal(Animal a) {
		a.move();
	}
	

	public static void main(String[] args) {

		Animal lion = new Lion();
		Animal falcon = new Falcon();
		Animal human = new Human();
		
		//객체 생성띵 
		Teset t = new Teset();
		t.moveAnimal(human);
		t.moveAnimal(lion);
		t.moveAnimal(falcon);
	}

}
