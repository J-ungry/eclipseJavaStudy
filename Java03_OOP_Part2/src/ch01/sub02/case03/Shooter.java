package ch01.sub02.case03;

public class Shooter {
	
	private Gun gun;
	

	public void setGun(Gun gun) {
		this.gun = gun;

	}
	
	public void fire() {
		this.gun.fire(); //this : shooter 
	}
}
