package examples.patterns.command;

public class Player {
	private ICommand attack;
	private ICommand defend;
	
	public Player(ICommand attack, ICommand defend) {
		this.attack = attack;
		this.defend = defend;
	}
	
	public void executeAttack() {
		attack.executeCommand();
	}
	
	public void executeDefend() {
		defend.executeCommand();
	}
	
	public void undoAttack() {
		attack.undoCommand();
	}
	
	public void undoDefend() {
		defend.undoCommand();
	}
}
