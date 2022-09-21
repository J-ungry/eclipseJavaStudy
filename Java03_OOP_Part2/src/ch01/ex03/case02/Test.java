package ch01.ex03.case02;

import java.util.ArrayList;

import ch01.ex03.case01.*;

public class Test {
	
	public void moveAnimal(Animal a) {
		a.move();
	}
	

	public static void main(String[] args) {

		Animal lion = new Lion(); //up_casting
		Animal falcon = new Falcon();
		Animal human = new Human();
		
		ArrayList<Animal> list = new ArrayList<>(); 
		list.add(human);
		list.add(falcon);
		list.add(lion);
		
		for(Animal x : list) {
			x.move();
		}
	}

}
