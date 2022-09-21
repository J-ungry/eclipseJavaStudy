package ch02.quiz.case04;

public class Player {
	
	//field
	private PlayerLevel level; //Player has a Playerlevel
	
	//생성자 
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	public void upgradeLevel(PlayerLevel level) {
		this.level =level; //upgrade 한 레벨이 담긴다 
		
		level.showLevelMessage();
	}
	public void play(int count) {
		level.go(count);
	} 
}
