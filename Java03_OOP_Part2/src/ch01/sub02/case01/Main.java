package ch01.sub02.case01;

public class Main {

	public static void main(String[] args) {
		
		Human human = new Human();
		Kimchi kimchi = new Kimchi();
		Ramen ramen = new Ramen();
		
		human.eat(kimchi);
		human.eat(ramen);
	}

}
