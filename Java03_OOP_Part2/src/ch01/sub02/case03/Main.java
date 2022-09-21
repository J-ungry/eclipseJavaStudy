package ch01.sub02.case03;

public class Main {

	public static void main(String[] args) {

		Pistol ps = new Pistol();
		Rifle ri = new Rifle();
		Shooter shooter = new Shooter();
		
		shooter.setGun(ps);
		shooter.fire();
		shooter.setGun(ri);
		shooter.fire();
		
		
		
		
	}

}

/*
 * 
 * Has - a 관계 이용해서 
 * shooter 객체의 setter 이용해서
 * 권총과 소총을 각각 삽입한 후 
 * 각 총이 발사 소리가 출력이 되도록  
 */
