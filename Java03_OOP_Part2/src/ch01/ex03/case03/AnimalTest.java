package ch01.ex03.case03;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니동 ~ ");
	}
	
	public void eating() {}
}

class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다. ");
	}
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다. ");
	}
}

class Tiger extends Animal {
	
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다 ");
	}
	
	public void hunt() {
		System.out.println("호랑이가 사냥을 합니다. ");
	}
}

class Eagle extends Animal{
	
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다 ");
	}
	
	public void peakAt() {
		System.out.println("독수리가 모이를 쫍니다 ");
	}
}
public class AnimalTest {

	public static void main(String[] args) {

		Animal human = new Human();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		
		animalList.add(human);
		animalList.add(tiger);
		animalList.add(eagle);
		
		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);
	}
	
	public void testDownCasting(ArrayList<Animal> animalList) {
		for(int i=0; i<animalList.size(); i++) {
			Animal animal = animalList.get(i);
			
			if(animal instanceof Human) { //animal 이 실제 객체로는 Human 객체 타입이라면 !!!!!!
				Human human = (Human) animal; //animal 은 animal 타입이니까 Human 으로 해라 !! -> 다운 캐스팅  원래는 휴먼만의 메소드(readbooks 가 호출되지 않았는데 이제 호출 가능하다)
				human.readBooks();
			} 
			else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal ;
				tiger.hunt();
			}
			else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle) animal;
				eagle.peakAt();
			}
			else {
				System.out.println("ERROR !");
			}
		}
	}

}
