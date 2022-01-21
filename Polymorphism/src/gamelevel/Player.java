package gamelevel;

public class Player {
	
	//이걸 생각하는게 어렵다.
	private PlayerLevel level;
	
	public Player() {
		level=new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}

	public void play(int count) {
		level.go(count);
	}

	
	
	
}
